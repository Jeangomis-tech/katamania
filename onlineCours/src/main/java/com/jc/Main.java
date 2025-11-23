package com.jc;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Etudiant> etudiants = Arrays.asList(
                new Etudiant("Alice", new double[]{15.5, 12.0, 18.5, 14.0}),
                new Etudiant("Bob", new double[]{10.0, 11.5, 9.0, 13.0}),
                new Etudiant("Charlie", new double[]{16.0, 17.5, 15.0, 18.0}),
                new Etudiant("Pierre", new double[]{16.0, 08.5, 02.0, 01.0}),
                new Etudiant("Malick", new double[]{04.0, 12.5, 08.0, 04.0}),
                new Etudiant("Modou", new double[]{02.0, 11.5, 10.0, 07.0}),
                new Etudiant("Johane", new double[]{16.0, 12.5, 07.0, 11.0}),
                new Etudiant("Marie", new double[]{1.0, 13.5, 11.0, 0.0})
        );
     List<Etudiant> admis =   Admision.admision(etudiants);

        System.out.println("La liste des admis" + admis);

    }
}