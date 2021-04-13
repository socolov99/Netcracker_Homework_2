package com.netcracker.edu.sokolov.baselibraries.dice;

/**
 * Test class for testing Dice class.
 *
 * @author kirillsokolov
 * @version 1.1
 */
public class DiceMain {
    public static void main(String[] args) {
        String[] namesOfPlayers = {"Kirill", "Maxim", "Anton", "Viktor", "Alex"};
        DiceGameImpl diceGame = new DiceGameImpl(namesOfPlayers, 5);
        diceGame.play();
        diceGame.resultsOfTheGame();
    }
}
