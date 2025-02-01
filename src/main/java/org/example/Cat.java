package org.example;

public class Cat extends Animal{
    private static int counter = 0;
    private boolean hunger = false;
    public Cat (String name) {
        super(name);
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public void eat(int food){

    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(super.getName() + " пробежал " + distance + " м");
        } else {
            System.out.println(super.getName() + " устал");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(super.getName() + " боится воды");
    }
}
