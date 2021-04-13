package com.netcracker.edu.sokolov.baselibraries.dice;

/**
 * Interface for player in a dice game
 *
 * @author kirillsokolov
 * @version 1.0
 */
public interface Player {
    /**
     * @return Player's points in the step
     */
    int getPoints();

    String getName();

    int getNumberOfVictories();

    /**
     * Method for incrementing number of victories
     */
    void numberOfVictoriesIncrement();

    /**
     * Method for rolling all dices
     */
    int rollDices();
}
