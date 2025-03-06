package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CompareIntegersTest {
    @DataProvider(name = "compareTestData")
    public Object[][] compareTestData() {
        return new Object[][] {
                {5, 3, "5 больше 3"},
                {3, 5, "3 меньше 5"},
                {4, 4, "4 равно 4"},
                {-1, -2, "-1 больше -2"},
                {-3, -1, "-3 меньше -1"},
                {-5, -5, "-5 равно -5"},
                {0, -1, "0 больше -1"},
                {0, 0, "0 равно 0"},
                {-1, 0, "-1 меньше 0"}
        };
    }

    @Test(dataProvider = "compareTestData")
    public void testCompare(int a, int b, String expected) {
        assertEquals(CompareIntegers.compare(a, b), expected);
    }
}