package com.netcracker.edu.sokolov.baselibraries.dice;

/**
 * Interface for dice cube in a dice game
 *
 * @author kirillsokolov
 * @version 1.0
 */
public interface DiceCube {
    /**
     * Generates random value from 1,2,3,4,5,6
     */
    void generateValue();

    /**
     * @return generated random value
     */
    int getValue();
}
