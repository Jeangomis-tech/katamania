package com.jc;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stock {

    List<Produit> produit = Arrays.asList(
            new Produit("Mangue", 4),
            new Produit("orange", 2),
            new Produit("Goyave", 1),
            new Produit("Pomme", 3),
            new Produit("Poire", 5)
    );
    public static List<Produit> surveillance(List<Produit> produits) {

        return produits.stream().filter(p -> p.getQuantite() <= 2).toList();

    }
}
