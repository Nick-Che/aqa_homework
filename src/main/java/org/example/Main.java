package org.example;

import java.util.*;

import static org.example.Cat.getCounter;

public class Main {
    public static void main(String[] args) {
        Animal bobik = new Cat("Боббик");
        Animal chichik = new Cat("чичик");
        Animal kittik = new Cat("киттик");

        Dog shurik = new Dog("shurik");

        System.out.println(Cat.getCounter());
        System.out.println(Dog.getCounter());
        System.out.println(Animal.getCounter());
    }
}