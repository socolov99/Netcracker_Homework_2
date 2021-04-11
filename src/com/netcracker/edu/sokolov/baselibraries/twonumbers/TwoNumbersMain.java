package com.netcracker.edu.sokolov.baselibraries.twonumbers;

/**
 * Test class for testing TwoNumbers interface and TwoNumbersImpl class.
 *
 * @author kirillsokolov
 * @version 1.1
 */
public class TwoNumbersMain {
    public static void main(String[] args) {
        TwoNumbers obj = new TwoNumbersImpl();
        obj.setX(-10);
        obj.setY(10.5);
        obj.getDifference();
    }
}
