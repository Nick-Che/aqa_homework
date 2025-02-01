package org.example;

public class Dog extends Animal {
    private static int counter = 0;

    public Dog(String name) {
        super(name);
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(name + " пробежал " + distance + " м");
        } else {
            System.out.println(name + " устал");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(name + " проплыл " + distance + " м");
        } else {
            System.out.println(name + " не доплыл");
        }
    }
}