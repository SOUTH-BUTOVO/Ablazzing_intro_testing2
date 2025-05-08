package com.javaacademy.car;

public class Engine {

    public static final int VOL_FUEL = 100;
    public static final int MIN_VOL_FUEL = 10_000;

    public void start(int fuel) {
        if (fuel == VOL_FUEL) {
            System.out.println("Двигатель завёлся.");
            return;
        }

        if (fuel < MIN_VOL_FUEL) {
            throw new RuntimeException("Мало бензина (косяк джуна)");
        }
        System.out.println("Двигатель завёлся.");
    }
}
