package com.netcracker.edu.sokolov.baselibraries.animalvoices;

/**
 * Class Cat with possibility to make voice
 *
 * @author kirillsokolov
 * @version 1.0
 */
public class Cat implements Voice {
    @Override
    public void voice() {
        System.out.println("Myau myau");
    }
}
