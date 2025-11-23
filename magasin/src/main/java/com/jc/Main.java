package com.jc;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Vente> ventes = Arrays.asList(
                new Vente("1A", 15.0, LocalDateTime.of(2025, 11, 21, 0, 0)),
                new Vente("1B", 20.0, LocalDateTime.of(2025, 11, 20, 0, 0)),
                new Vente("1C", 14.0, LocalDateTime.of(2025, 11, 22, 0, 0)),
                new Vente("1D", 12.0, LocalDateTime.of(2025, 11, 22, 0, 0))
        );

        long venteDuJour = ventes.stream().filter(vente-> vente.getDateVente().equals(LocalDateTime.of(2025, 11, 22, 0, 0))).count();
        System.out.println(venteDuJour);

    }
}