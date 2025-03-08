package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareIntegersTest {

    @Test
    @DisplayName("Сравнение положительных чисел a > b")
    public void testCompareGreater() {
        assertEquals("5 больше 3", CompareIntegers.compare(5, 3));
    }

    @Test
    @DisplayName("Сравнение положительных чисел a < b")
    public void testCompareLesser() {
        assertEquals("3 меньше 5", CompareIntegers.compare(3, 5));
    }

    @Test
    @DisplayName("Сравнение положительных чисел a = b")
    public void testCompareEqual() {
        assertEquals("4 равно 4", CompareIntegers.compare(4, 4));
    }

    @Test
    @DisplayName("Сравнение отрицательных чисел a > b")
    public void testCompareNegativeGreater() {
        assertEquals("-1 больше -2", CompareIntegers.compare(-1, -2));
    }

    @Test
    @DisplayName("Сравнение отрицательных чисел a < b")
    public void testCompareNegativeLesser() {
        assertEquals("-3 меньше -1", CompareIntegers.compare(-3, -1));
    }

    @Test
    @DisplayName("Сравнение отрицательных чисел a = b")
    public void testCompareNegativeEqual() {
        assertEquals("-5 равно -5", CompareIntegers.compare(-5, -5));
    }

    @Test
    @DisplayName("Сравнение 0 и отрицательного числа")
    public void testCompareZeroGreater() {
        assertEquals("0 больше -1", CompareIntegers.compare(0, -1));
    }

    @Test
    @DisplayName("Сравнение нулей")
    public void testCompareZeroEqual() {
        assertEquals("0 равно 0", CompareIntegers.compare(0, 0));
    }

    @Test
    @DisplayName("Сравнение отрицательного числа и 0")
    public void testCompareZeroLesser() {
        assertEquals("-1 меньше 0", CompareIntegers.compare(-1, 0));
    }
}