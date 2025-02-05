package org.example;

import java.util.*;

import static org.example.Cat.getCounter;

public class Main {
    public static void main(String[] args) {
        Animal bobbik = new Dog("Боббик");
        Dog sharik = new Dog("Шарик");
        Dog hanchik = new Dog("Ханчик");

        Bowl bowl = new Bowl(20);

        bowl.fill(30);

        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Барсик");
        cats[1] = new Cat("Персик");
        cats[2] = new Cat("Олег");
        cats[3] = new Cat("Китти");

        for (int i = 0; i < 4; i++) {
            cats[i].eat(15, bowl);
        }

        System.out.println(Animal.getCounter());
        System.out.println(Dog.getCounter());
        System.out.println(Cat.getCounter());

        sharik.run(700);
        hanchik.swim(7);
        cats[2].run(150);
        cats[0].swim(31);

        Shape circle = new Circle(5, "Красный", "Черный");
        Shape rectangle = new Rectangle(4, 6, "Зеленый", "Желтый");
        Shape triangle = new Triangle(3, 4, 5, "Синий", "Розовый");

        printShapeDetails(circle);
        printShapeDetails(rectangle);
        printShapeDetails(triangle);
    }

    public static void printShapeDetails(Shape shape) {
        System.out.println("Периметр: " + shape.calculatePerimeter());
        System.out.println("Площадь: " + shape.calculateArea());
        System.out.println("Цвет фона: " + shape.getFillColor());
        System.out.println("Цвет границ: " + shape.getBorderColor());
        System.out.println();
    }
}