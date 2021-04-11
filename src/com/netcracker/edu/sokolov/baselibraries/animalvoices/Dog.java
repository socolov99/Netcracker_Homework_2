package com.netcracker.edu.sokolov.baselibraries.animalvoices;

/**
 * Class Dog with possibility to make voice
 *
 * @author kirillsokolov
 * @version 1.0
 */
public class Dog implements Voice {
    @Override
    public void voice() {
        System.out.println("Guf guf");
    }
}
