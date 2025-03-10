package org.example;

public class Factorial {
    public static int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Введите положительные целые числа.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}