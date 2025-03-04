package org.example;

import java.util.*;

public class StudentManager {
    public StudentManager() {
    }

    public void addStudent(Set<Student> students, Student student) {
        students.add(student);
    }

    public void removeStudentsWithLowGrades(Set<Student> students) {
        students.removeIf(student -> student.getAverageGrade() < 3);
    }

    public void promoteStudents(Set<Student> students) {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3) {
                student.promote();
            }
        }
    }

    public void printStudents(Set<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName() + " ");
            }
        }
    }
}
