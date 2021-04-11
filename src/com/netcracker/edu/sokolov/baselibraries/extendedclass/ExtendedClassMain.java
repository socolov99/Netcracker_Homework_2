package com.netcracker.edu.sokolov.baselibraries.extendedclass;

/**
 * Test class for testing ExtendedClass class.
 *
 * @author kirillsokolov
 * @version 1.1
 */
public class ExtendedClassMain {
    public static void main(String[] args) {
        ParentClass extendedClass1 = new ExtendedClass((byte) 1, 1294, 12.42, "string A");
        ParentClass extendedClass2 = new ExtendedClass((byte) 1, 3, 12.42, "string B");
        ParentClass extendedClass3 = new ExtendedClass((byte) 1, 3, 12.42, "string B");
        System.out.println("extendedClass1: " + extendedClass1.toString());
        System.out.println("extendedClass2: " + extendedClass2.toString());
        System.out.println("extendedClass3: " + extendedClass3.toString());
        System.out.println("Equals check:");
        System.out.println("extendedClass1.equals(extendedClass2): " + extendedClass1.equals(extendedClass2)); // false (objects are different)
        System.out.println("extendedClass2.equals(extendedClass3): " + extendedClass2.equals(extendedClass3)); // true (objects are equal)
    }
}
