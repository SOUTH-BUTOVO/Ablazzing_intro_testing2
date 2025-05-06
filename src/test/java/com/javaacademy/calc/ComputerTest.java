package com.javaacademy.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static com.javaacademy.calc.SquareType.*;

public class ComputerTest {
    private static double resultTest;

    @Test
    @DisplayName("Создание калькулятора")
    public void calcNotNull() {
        Calc calc = new Calc();
        Computer computer = new Computer(calc);
        Assertions.assertNotNull(new Computer(calc).getCalc());
    }

    @Test
    @DisplayName("Вычисление площади в метрах")
    public void computeSquareMetersSuccess() {
        Computer computer = new Computer(new Calc());
        Assertions.assertEquals(12 * METERS.getConvertCoefficient(),
                computer.computeSquare(3, 4, METERS));
    }

    @Test
    @DisplayName("Вычисление площади в футах")
    public void computeSquareFootsSuccess() {
        Computer computer = new Computer(new Calc());
        Assertions.assertEquals(12 * FOOTS.getConvertCoefficient(),
                computer.computeSquare(3, 4, FOOTS));
    }

    @Test
    //@Disabled
    @DisplayName("Исключение на систему измерения")
    public void computeExceptionConvertSuccess() {
        Computer computer = new Computer(new Calc());
        Assertions.assertThrows(InvalidParameterException.class,
                () -> computer.computeSquare(3, 4, YARDS));
    }
}
