package com.javaacademy.it;

import com.javaacademy.car.Car;
import com.javaacademy.car.Engine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarIT {

    @Test
    @DisplayName("Тест машины и двигателя")
    public void startSuccess() {
        Car car = new Car(new Engine());
        Assertions.assertDoesNotThrow(() -> car.start(100));
    }
}
