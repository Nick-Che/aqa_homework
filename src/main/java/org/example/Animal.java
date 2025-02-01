package org.example;

public class Animal {
    private static int counter = 0;
    private String name;
    public Animal(String name) {
        this.name = name;
        counter++;
    }

    public String getName() {
        return name;
    }

    public static int getCounter() {
        return counter;
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м");
    }

    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " м");
    }
}