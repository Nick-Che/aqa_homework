package org.example;

public class Cat extends Animal {
    private static int counter = 0;
    private boolean hunger = false;

    public Cat(String name) {
        super(name);
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public boolean isHunger() {
        return hunger;
    }

    public void eat(int hungerIndex, Bowl bowl) {
        if (hungerIndex <= bowl.getCapacity()) {
            hunger = true;
            bowl.setCapacity(bowl.getCapacity() - hungerIndex);
        } else {
            System.out.println(super.getName() + " не стал трогать миску, неси мандарины");
        }
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
