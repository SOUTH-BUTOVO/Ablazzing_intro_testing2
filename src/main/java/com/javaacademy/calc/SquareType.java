package com.javaacademy.calc;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SquareType {
    METERS(1), FOOTS(10.764), YARDS(1.196);
    private final double convertCoefficient;
}
