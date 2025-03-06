package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    @DisplayName("Факториал 0")
    public void testCalculateFactorialZero(){
        assertEquals(1, Factorial.calculateFactorial(0));
    }

    @Test
    @DisplayName("Факториал 1")
    public void testCalculateFactorialOne(){
        assertEquals(1, Factorial.calculateFactorial(1));
    }

    @Test
    @DisplayName("Факториал 2")
    public void testCalculateFactorialTwo(){
        assertEquals(2, Factorial.calculateFactorial(2));
    }

    @Test
    @DisplayName("Факториал 3")
    public void testCalculateFactorialThree(){
        assertEquals(6, Factorial.calculateFactorial(3));
    }

    @Test
    @DisplayName("Факториал 4")
    public void testCalculateFactorialFour(){
        assertEquals(24, Factorial.calculateFactorial(4));
    }

    @Test
    @DisplayName("Ввод числа < 0")
    public void testCalculateFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.calculateFactorial(-1));
    }
}