package com.jc;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public  class CaclculeVente {
    private List<Vente> ventes;
    private LocalDateTime dataVente;

    public CaclculeVente(List<Vente> ventes, LocalDateTime date) {
        this.ventes = new ArrayList<>();

    }


    public static  long venteDujour(List<Vente> ventes, LocalDateTime date) {
        return ventes.stream().filter(vente-> vente.getDateVente().equals(LocalDateTime.of(2025, 11, 22, 0, 0))).count();
    }

//    public static long venteDujour(List<Vente> ventes) {
//    }
}
