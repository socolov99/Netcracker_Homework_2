package com.netcracker.edu.sokolov.baselibraries.twonumbers;

/**
 * Interface for classes storing two double numbers with possibility to compare these numbers
 *
 * @author kirillsokolov
 * @version 1.0
 */
public interface TwoNumbers {
    void setX(double x);

    void setY(double y);

    /**
     * Prints an absolute difference between object's x and y values
     */
    void getDifference();
}
