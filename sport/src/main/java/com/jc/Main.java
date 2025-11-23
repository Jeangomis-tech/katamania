package com.jc;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Parcour> parcours = Arrays.asList(
                new Parcour(7.5, "une"),
                new Parcour(2.0, "deux"),
                new Parcour(10.3, "trois"),
                new Parcour(4.5, "quatre"),
                new Parcour(9.00, "cinq")
        );

        double totalParcours = Calcul.calculate(parcours);
        System.out.println(totalParcours);

        double averageParcours = Calcul.calculateAverage(parcours);
        System.out.println( "Le parcour moyen est de : " + averageParcours);


    }

}