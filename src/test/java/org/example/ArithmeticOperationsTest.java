package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArithmeticOperationsTest {
    @DataProvider(name = "arithmeticTestData")
    public Object[][] arithmeticTestData() {
        return new Object[][] {
                {"add", 3, 4, 7},
                {"subtract", 5, 4, 1},
                {"multiply", 4, 5, 20},
                {"divide", 10, 5, 2}
        };
    }

    @Test(dataProvider = "arithmeticTestData")
    public void testArithmeticOperations(String operation, int a, int b, int expected) {
        switch (operation) {
            case "add":
                assertEquals(ArithmeticOperations.add(a, b), expected);
                break;
            case "subtract":
                assertEquals(ArithmeticOperations.subtract(a, b), expected);
                break;
            case "multiply":
                assertEquals(ArithmeticOperations.multiply(a, b), expected);
                break;
            case "divide":
                assertEquals(ArithmeticOperations.divide(a, b), expected);
                break;
        }
    }

    @Test
    public void testDivide_byZero() {
        assertThrows(IllegalArgumentException.class, () -> ArithmeticOperations.divide(10, 0));
    }
}