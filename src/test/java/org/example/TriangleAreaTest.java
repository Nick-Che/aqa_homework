package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleAreaTest {

    @Test
    @DisplayName("Ввод отрицательного основания")
    public void testCalculateAreaNegativeBase(){
        assertThrows(IllegalArgumentException.class, () ->  TriangleArea.calculateArea(-1, 1));
    }

    @Test
    @DisplayName("Ввод отрицательной высоты")
    public void testCalculateAreaNegativeHeight(){
        assertThrows(IllegalArgumentException.class, () ->  TriangleArea.calculateArea(1, -1));
    }

    @Test
    @DisplayName("Площадь треугольника с основанием 10, высотой 5")
    public void testCalculateAreaPositiveValues() {
        assertEquals(25.0, TriangleArea.calculateArea(10, 5));
    }

    @Test
    @DisplayName("Площадь треугольника с основанием 10000, высотой 10000")
    public void testCalculateAreaLargeValues() {
        assertEquals(5000000.0, TriangleArea.calculateArea(10000, 1000));
    }

    @Test
    @DisplayName("Дробная площадь треугольника")
    public void testCalculateAreaFractionalValues() {
        assertEquals(12.5, TriangleArea.calculateArea(5, 5));
    }
}