package org.junitcourse;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    static void initCalculator() {
        calculator = new Calculator();
    }

    @DisplayName("Calculator add")
    @ParameterizedTest
    @CsvSource({"1, 1, 2", "10, 5, 15", "13, 7, 20"})
    public void testCalculatorAdd(int a, int b, int expected) {
        assertEquals(expected, calculator.add(a, b), "Incorrect sum");
    }

    @DisplayName("Calculator subtract")
    @ParameterizedTest
    @CsvSource({"10, 5, 5", "20, 5, 15", "5, 10, -5"})
    public void testCalculatorSubtract(int a, int b, int expected) {
        assertEquals(expected, calculator.subtract(a, b), "Incorrect sum");
    }

    @DisplayName("Calculator multiply")
    @ParameterizedTest
    @CsvSource({"5, 5, 25", "10, 5, 50", "3, 3, 9"})
    public void testCalculatorMultiply(int a, int b, int expected) {
        assertEquals(expected, calculator.multiply(a, b), "Incorrect sum");
    }

    @DisplayName("Calculator divide")
    @ParameterizedTest
    @CsvSource({"9, 3, 3", "100, 5, 20", "25, 5, 5"})
    public void testCalculatorDivide(int a, int b, int expected) {
        assertEquals(expected, calculator.divide(a, b), "Incorrect sum");
    }
}
