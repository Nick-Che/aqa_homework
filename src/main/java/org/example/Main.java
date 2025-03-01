package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();//Задание 1

        StudentManager studentManager = new StudentManager();

        Map<String, Integer> gradesM = new HashMap<>();
        gradesM.put("Math", 3);
        gradesM.put("Physics", 4);
        gradesM.put("Chemistry", 5);

        Map<String, Integer> gradesN = new HashMap<>();
        gradesN.put("Math", 3);
        gradesN.put("Physics", 3);
        gradesN.put("Chemistry", 2);

        Map<String, Integer> gradesK = new HashMap<>();
        gradesK.put("Math", 4);
        gradesK.put("Physics", 4);
        gradesK.put("Chemistry", 3);

        Map<String, Integer> gradesZ = new HashMap<>();
        gradesZ.put("Math", 5);
        gradesZ.put("Physics", 4);
        gradesZ.put("Chemistry", 5);

        Student max = new Student("Max", "it-1", 1, gradesM);
        Student nick = new Student("Nick", "it-4", 2, gradesN);
        Student kate = new Student("Kate", "it-3", 2, gradesK);
        Student zara = new Student("Zara", "it-2", 3, gradesZ);

        studentManager.addStudent(students, max);
        studentManager.addStudent(students, nick);
        studentManager.addStudent(students, kate);
        studentManager.addStudent(students, zara);

        studentManager.printStudents(students, 2);
        studentManager.removeStudentsWithLowGrades(students);
        studentManager.promoteStudents(students);
        studentManager.printStudents(students, 2);

        PhoneBook phoneBook = new PhoneBook();//Задание 2
        phoneBook.add("Ivanov", "123456");
        phoneBook.add("Petrov", "654321");
        phoneBook.add("Ivanov", "789101");

        System.out.println("Phones for Ivanov: " + phoneBook.get("Ivanov"));
        System.out.println("Phones for Petrov: " + phoneBook.get("Petrov"));
    }
}