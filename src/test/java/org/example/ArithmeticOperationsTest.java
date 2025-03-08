package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticOperationsTest {

    @Test
    @DisplayName("Сложение положительных чисел")
    public void testAddPositiveNumbers() {
        assertEquals(7, ArithmeticOperations.add(3, 4));
    }

    @Test
    @DisplayName("Сложение отрицательных чисел")
    public void testAddNegativeNumbers() {
        assertEquals(-7, ArithmeticOperations.add(-3, -4));
    }

    @Test
    @DisplayName("Вычитание положительных чисел")
    public void testSubtractPositiveNumbers() {
        assertEquals(1, ArithmeticOperations.subtract(5, 4));
    }

    @Test
    @DisplayName("Вычитание отрицательных чисел")
    public void testSubtractNegativeNumbers() {
        assertEquals(-1, ArithmeticOperations.subtract(-5, -4));
    }

    @Test
    @DisplayName("Умножение положительных чисел")
    public void testMultiplyPositiveNumbers() {
        assertEquals(20, ArithmeticOperations.multiply(4, 5));
    }

    @Test
    @DisplayName("Умножение отрицательных чисел")
    public void testMultiplyNegativeNumbers() {
        assertEquals(20, ArithmeticOperations.multiply(-4, -5));
    }

    @Test
    @DisplayName("Деление положительных чисел")
    public void testDividePositiveNumbers() {
        assertEquals(2, ArithmeticOperations.divide(10, 5));
    }

    @Test
    @DisplayName("Деление отрицательных чисел")
    public void testDivideNegativeNumbers() {
        assertEquals(2, ArithmeticOperations.divide(-10, -5));
    }

    @Test
    @DisplayName("Деление на 0")
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> ArithmeticOperations.divide(10, 0));
    }

    @Test
    @DisplayName("Деление 0 на положительное число")
    public void testDivideZeroNumerator() {
        assertEquals(0, ArithmeticOperations.divide(0, 5));
    }
}