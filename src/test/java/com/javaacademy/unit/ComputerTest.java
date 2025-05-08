package com.javaacademy.unit;

import com.javaacademy.calc.Calc;
import com.javaacademy.calc.Computer;
import com.javaacademy.calc.SquareType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ComputerTest {

    @Test
    @DisplayName("Вычисление площади в метрах, mock")
    public void computeSquareMetersSuccess() {
        Calc mock = Mockito.mock(Calc.class);
        Mockito.when(mock.multiply(2, 2)).thenReturn(4);

        Computer computer = new Computer(mock);
        double res = computer.computeSquare(2, 2, SquareType.METERS);

        Assertions.assertEquals(4, res);
    }

    @Test
    @DisplayName("Вычисление площади в метрах, spy")
    public void computeSquareMetersSuccess2() {
        Calc calcSpy = Mockito.spy(Calc.class);
        Mockito.when(calcSpy.multiply(2, 2)).thenReturn(4);

        Computer computer = new Computer(calcSpy);
        double res = computer.computeSquare(2, 2, SquareType.METERS);
        Assertions.assertEquals(4, res);

        double res2 = computer.computeSquare(3, 3, SquareType.METERS);
        Assertions.assertEquals(9, res2);
    }
}
