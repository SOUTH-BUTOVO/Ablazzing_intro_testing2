package com.javaacademy.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
}
