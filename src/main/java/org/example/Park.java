package org.example;

import java.util.*;

public class Park {
    private List<Attraction> attractions;

    public Park() {
        this.attractions = new ArrayList<>();
    }

    public void addAttraction(String name, String workingHours, double price) {
        this.attractions.add(new Attraction(name, workingHours, price));
    }

    public void displayAttractions() {
        for (Attraction attraction : attractions) {
            System.out.println(attraction);
        }
    }

    class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "name='" + name + '\'' +
                    ", workingHours='" + workingHours + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}