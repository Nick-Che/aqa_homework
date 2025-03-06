package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FactorialTest {
    @DataProvider(name = "factorialTestData")
    public Object[][] factorialTestData() {
        return new Object[][] {
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120},
                {10, 3628800}
        };
    }

    @Test(dataProvider = "factorialTestData")
    public void testCalculateFactorial(int input, int expected) {
        assertEquals(Factorial.calculateFactorial(input), expected);
    }

    @Test
    public void testCalculateFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.calculateFactorial(-1));
    }
}