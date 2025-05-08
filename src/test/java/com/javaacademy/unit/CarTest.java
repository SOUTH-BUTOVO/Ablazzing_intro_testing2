package com.javaacademy.unit;

import com.javaacademy.car.Car;
import com.javaacademy.car.Engine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CarTest {

    @Test
    @DisplayName("Тест машины и двигатель-мок")
    public void startSuccess() {
        Engine engineMock = Mockito.mock(Engine.class);
        Car car = new Car(engineMock);
        Assertions.assertDoesNotThrow(() -> car.start(100));
    }

    @Test
    @DisplayName("Тест машины и двигатель-мок-Exception")
    public void startFailure() {
        Engine engineMock = Mockito.mock(Engine.class);
        Mockito.doThrow(RuntimeException.class).when(engineMock).start(-1);

        Car car = new Car(engineMock);
        Assertions.assertThrows(RuntimeException.class, () -> car.start(-1));
    }
}
