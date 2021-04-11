package com.netcracker.edu.sokolov.baselibraries.animalvoices;

/**
 * Test class for testing implementations of Voice interface
 *
 * @author kirillsokolov
 * @version 1.0
 */
public class AnimalVoicesMain {
    public static void main(String[] args) {
        Voice cat = new Cat();
        Voice dog = new Dog();
        Voice cow = new Cow();

        cat.voice();    // Myau myau
        dog.voice();    // Guf guf
        cow.voice();    // Muuuuu
    }
}
