package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employee ivan = new Employee("Иванов Иван Иванович", "Тестировщик", "ivanov.i.i@gmail.com", "+375291234567", 120000, 25);

        System.out.println(ivan.toString());

        List<Employee> employees = new ArrayList();

        employees.add(ivan);
        employees.add(new Employee("Александров Александр Александрович", "Менеджер", "alex.a.a@gmail.com", "+375291234567", 240000, 27));
        employees.add(new Employee("Петров Петр Петрович", "Аналитик", "petroff.p.p@gmail.com", "+375291234567", 450000, 45));
        employees.add(new Employee("Сергеев Сергей Сергеевич", "Разработчик", "sergey.s.s@gmail.com", "+375291234567", 320000, 32));
        employees.add(new Employee("Дмитриев ДДмитрий Дмитриевич", "Дизайнер", "ddimas.d.d@gmail.com", "+375291234567", 300000, 28));

    }
}