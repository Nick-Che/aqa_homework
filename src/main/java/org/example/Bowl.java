package org.example;

public class Bowl {
    private int capacity;

    public Bowl(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int fill(int value) {
        capacity += value;
        return capacity;
    }
}