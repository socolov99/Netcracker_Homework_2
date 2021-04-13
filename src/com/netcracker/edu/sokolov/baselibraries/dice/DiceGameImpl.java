package com.netcracker.edu.sokolov.baselibraries.dice;

import java.util.*;

import static java.lang.Math.random;

/**
 * Class for DiceGame implementation.
 *
 * @author kirillsokolov
 * @version 1.1
 */
public class DiceGameImpl implements DiceGame {
    private final LinkedList<PlayerImpl> players;
    private final DiceCubeImpl[] diceCubes;
    private Player winner;

    public DiceGameImpl(String[] namesOfPlayers, int numberOfDices) {
        LinkedList<PlayerImpl> players = new LinkedList<>();
        for (String namesOfPlayer : namesOfPlayers) {
            players.add(new PlayerImpl(namesOfPlayer));
        }

        List<DiceCubeImpl> diceCubes = new ArrayList<>();
        for (int i = 0; i < numberOfDices; i++) {
            diceCubes.add(new DiceCubeImpl());
        }

        this.players = players;
        this.diceCubes = diceCubes.toArray(new DiceCubeImpl[0]);
    }

    /**
     * Class for DiceCube implementation
     *
     * @author kirillsokolov
     * @version 1.0
     */
    public static class DiceCubeImpl implements DiceCube {
        private int value;

        public DiceCubeImpl() {
        }

        public void generateValue() {
            value = (int) (random() * 6 + 1);
        }

        public int getValue() {
            return value;
        }


    }

    /**
     * Class for player in dice game
     *
     * @author kirillsokolov
     * @version 1.1
     */
    public class PlayerImpl implements Player {
        private final String name;
        private int numberOfVictories = 0;
        private int points = 0;

        public PlayerImpl(String name) {
            this.name = name;
        }

        public int getPoints() {
            return points;
        }

        public String getName() {
            return name;
        }

        public int getNumberOfVictories() {
            return numberOfVictories;
        }

        public int rollDices() {
            points = 0;
            for (DiceCubeImpl diceCube : diceCubes) {
                diceCube.generateValue();
                points += diceCube.getValue();
            }
            return points;
        }

        public void numberOfVictoriesIncrement() {
            numberOfVictories++;
        }

    }

    public void play() {
        this.winner = null;
        int step = 1;
        do {
            boolean draw = false;
            System.out.println("Step " + step);
            step++;
            int maxNumberOfPoints = 0;
            PlayerImpl stepWinner = players.getFirst();
            for (PlayerImpl player : players) {
                int points = player.rollDices();
                System.out.println(player.getName() + ", points: " + points);
                if (points >= maxNumberOfPoints) {
                    maxNumberOfPoints = points;
                    stepWinner = player;
                }
            }
            // if there are two or more stepWinners we say that it is a draw and don't give anyone points
            for (PlayerImpl player : players) {
                if (player.getPoints() == maxNumberOfPoints && player != stepWinner) {
                    draw = true;
                    break;
                }
            }
            if (draw) {
                System.out.println();
                System.out.println("Draw");
                System.out.println("–––––––––––––––––––––––––––––––––");
            } else {
                stepWinner.numberOfVictoriesIncrement();
                System.out.println();
                System.out.println(stepWinner.getName() + " won this step");
                System.out.println("–––––––––––––––––––––––––––––––––");
                if (stepWinner.getNumberOfVictories() >= 7) {
                    winner = stepWinner;
                    break;
                }
                //replace winner of the step to the beginning of players list
                players.remove(stepWinner);
                players.addFirst(stepWinner);
            }
        } while (winner == null);
    }

    public void resultsOfTheGame() {
        System.out.println("RESULTS OF THE GAME:");
        System.out.println("–––––––––––––––––––––––––––––––––");
        System.out.println(winner.getName() + " won the game !");
        System.out.println("Scores:");

        //sorts Players by NumberOfVictories decrease
        players.sort(new Comparator<PlayerImpl>() {
            @Override
            public int compare(PlayerImpl o1, PlayerImpl o2) {
                return o2.getNumberOfVictories() - o1.getNumberOfVictories();
            }
        });
        for (PlayerImpl player : players) {
            System.out.println(player.getName() + " won " + player.getNumberOfVictories() + " times");
        }
        System.out.println("–––––––––––––––––––––––––––––––––");
    }
}
