package com.netcracker.edu.sokolov.baselibraries.twonumbers;

import static java.lang.Math.*;

/**
 * Class for TwoNumbers implementation
 *
 * @author kirillsokolov
 * @version 1.0
 */
public class TwoNumbersImpl implements TwoNumbers {
    private double x;
    private double y;
    
    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void getDifference() {
        System.out.println(abs(x - y));
    }
}
