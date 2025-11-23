package com.jc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Admision {


    public static List<Etudiant> admision(List<Etudiant> etudiants) {
        final double noteAdmission = 10.5;
        return  etudiants.stream().filter(etudiant->calculerMoyenne(etudiant) >= noteAdmission)
                .collect(Collectors.toList());

    }

    private static double calculerMoyenne(Etudiant etudiant) {

        double[] notes = etudiant.getNote();
        double somme = 0;
        for(double note : notes) {
            somme += note;
        }
        return somme / notes.length;

    }
}
