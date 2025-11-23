package com.jc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Calcul {


    public static double calculate(List<Parcour> parcours) {


        double total = parcours.stream().mapToDouble(Parcour::getDistance).sum();
        return total;

    }

    public static double calculateAverage(List<Parcour> parcours) {
        double average = parcours.stream().collect(Collectors.averagingDouble(Parcour::getDistance));
        return average;
    }
}
