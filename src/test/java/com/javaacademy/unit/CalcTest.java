package com.javaacademy.unit;

import com.javaacademy.calc.Calc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalcTest {

    @Test
    @DisplayName("Сложение")
    public void addSuccess() {
        Calc calc = new Calc();
        int res = calc.add(10, 10);
        if (res != 20) {
            throw new RuntimeException("Ожидалось 20, а результат: " + res);
        }
    }

    @Test
    @DisplayName("Деление")
    public void divideSuccess() {
        Calc calc = new Calc();
        int res = calc.divide(4, 2);
        if (res != 2) {
            throw new RuntimeException("Ожидалось 2, а результат: " + res);
        }
    }

    @Test
    @DisplayName("Деление на 0")
    public void divideFailure() {
        Calc calc = new Calc();
        Assertions.assertThrows(ArithmeticException.class, () -> calc.divide(4, 0));
    }

    @Test
    @DisplayName("Умножение")
    public void multiply() {
        Calc calc = new Calc();
        Assertions.assertEquals(9, calc.multiply(3, 3));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/calc_test.csv", delimiter = ';', numLinesToSkip = 1)
    @DisplayName("Тестирование csv")
    public void multiplyFromCsvSuccess(Integer num1, Integer num2, Integer expected) {
        Calc calc = new Calc();
        int result = calc.multiply(num1, num2);
        System.out.printf(
                "num1: %s, num2: %s, expected: %s - result: %s\n", num1, num2, expected, result);
        Assertions.assertEquals(expected, result);
    }
}
