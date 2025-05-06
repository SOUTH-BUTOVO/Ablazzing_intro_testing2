package com.javaacademy.calc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
@AllArgsConstructor
public class Computer {
    private Calc calc;
    public static List<Double> historyCompute = new ArrayList<>();

    public double computeSquare(int lengthMeter, int widthMeter, SquareType squareType) {
        int resultSquareMeters = calc.multiply(lengthMeter, widthMeter);
        if (squareType == SquareType.METERS) {
            //historyCompute.add((double) resultSquareMeters);
            return resultSquareMeters * SquareType.METERS.getConvertCoefficient();
        } else if (squareType == SquareType.FOOTS) {
//            return convertSquareMetersToFoots(resultSquareMeters);
            //historyCompute.add((double) resultSquareMeters);
            return resultSquareMeters * SquareType.FOOTS.getConvertCoefficient();
        }
        throw new InvalidParameterException("Неизвестная система измерения: " + squareType.name());
    }

//    private double convertSquareMetersToFoots(double squareMeters) {
//        return squareMeters * 10.764;
//    }
}
