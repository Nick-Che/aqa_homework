package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TriangleAreaTest {

    @DataProvider(name = "triangleAreaTestData")
    public Object[][] triangleAreaTestData() {
        return new Object[][] {
                {10, 5, 25.0},
                {3, 4, 6.0},
                {7, 8, 28.0},
                {100, 200, 10000.0}
        };
    }

    @Test(dataProvider = "triangleAreaTestData")
    public void testCalculateArea(double base, double height, double expected) {
        assertEquals(TriangleArea.calculateArea(base, height), expected);
    }

    @Test
    public void testCalculateAreaNegativeBase() {
        assertThrows(IllegalArgumentException.class, () -> TriangleArea.calculateArea(-1, 5));
    }

    @Test
    public void testCalculateAreaNegativeHeight() {
        assertThrows(IllegalArgumentException.class, () -> TriangleArea.calculateArea(5, -1));
    }

    @Test
    public void testCalculateAreaZeroBase() {
        assertThrows(IllegalArgumentException.class, () -> TriangleArea.calculateArea(0, 5));
    }

    @Test
    public void testCalculateAreaZeroHeight() {
        assertThrows(IllegalArgumentException.class, () -> TriangleArea.calculateArea(5, 0));
    }
}