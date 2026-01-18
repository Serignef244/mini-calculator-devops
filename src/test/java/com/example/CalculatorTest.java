package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests unitaires pour la classe Calculator.
 * Couvre toutes les méthodes avec des cas normaux et d'erreur.
 */
class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5.0, calculator.add(2.0, 3.0));
        assertEquals(0.0, calculator.add(-1.0, 1.0));
        assertEquals(-3.0, calculator.add(-1.0, -2.0));
    }

    @Test
    void testSub() {
        assertEquals(1.0, calculator.sub(3.0, 2.0));
        assertEquals(0.0, calculator.sub(2.0, 2.0));
        assertEquals(-3.0, calculator.sub(-1.0, 2.0));
    }

    @Test
    void testMul() {
        assertEquals(6.0, calculator.mul(2.0, 3.0));
        assertEquals(0.0, calculator.mul(0.0, 5.0));
        assertEquals(-6.0, calculator.mul(2.0, -3.0));
    }

    @Test
    void testDiv() {
        assertEquals(2.0, calculator.div(4.0, 2.0));
        assertEquals(2.5, calculator.div(5.0, 2.0));
        assertEquals(-2.0, calculator.div(-4.0, 2.0));
    }

    @Test
    void testDivByZero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculator.div(5.0, 0.0));
        assertEquals("Division by zero", exception.getMessage());
    }

    @Test
    void testPower() {
        assertEquals(8.0, calculator.power(2.0, 3.0));
        assertEquals(1.0, calculator.power(5.0, 0.0));
        assertEquals(0.25, calculator.power(2.0, -2.0));
    }

    @Test
    void testSqrt() {
        assertEquals(3.0, calculator.sqrt(9.0));
        assertEquals(0.0, calculator.sqrt(0.0));
        assertEquals(2.0, calculator.sqrt(4.0));
    }

    @Test
    void testSqrtNegative() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculator.sqrt(-1.0));
        assertEquals("Cannot calculate square root of negative number", exception.getMessage());
    }

    @Test
    void testSin() {
        assertEquals(0.0, calculator.sin(0.0), 0.0001);
        assertEquals(1.0, calculator.sin(Math.PI / 2), 0.0001);
    }

    @Test
    void testCos() {
        assertEquals(1.0, calculator.cos(0.0), 0.0001);
        assertEquals(0.0, calculator.cos(Math.PI / 2), 0.0001);
    }

    @Test
    void testTan() {
        assertEquals(0.0, calculator.tan(0.0), 0.0001);
        assertEquals(1.0, calculator.tan(Math.PI / 4), 0.0001);
    }

    @Test
    void testLog() {
        assertEquals(0.0, calculator.log(1.0), 0.0001);
        assertEquals(1.0, calculator.log(Math.E), 0.0001);
    }

    @Test
    void testLogNonPositive() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculator.log(0.0));
        assertEquals("Cannot calculate logarithm of non-positive number", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> calculator.log(-1.0));
        assertEquals("Cannot calculate logarithm of non-positive number", exception.getMessage());
    }

    @Test
    void testLog10() {
        assertEquals(1.0, calculator.log10(10.0), 0.0001);
        assertEquals(2.0, calculator.log10(100.0), 0.0001);
    }

    @Test
    void testLog10NonPositive() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculator.log10(0.0));
        assertEquals("Cannot calculate logarithm of non-positive number", exception.getMessage());
    }

    @Test
    void testFactorial() {
        assertEquals(1.0, calculator.factorial(0));
        assertEquals(1.0, calculator.factorial(1));
        assertEquals(2.0, calculator.factorial(2));
        assertEquals(6.0, calculator.factorial(3));
        assertEquals(24.0, calculator.factorial(4));
    }

    @Test
    void testFactorialNegative() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculator.factorial(-1));
        assertEquals("Cannot calculate factorial of negative number", exception.getMessage());
    }
}