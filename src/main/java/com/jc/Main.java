package com.jc;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Produit> produits = new ArrayList<>();
        produits.add(new Produit("Carnet", 5.0, 2.0));   // marge 3
        produits.add(new Produit("Stylo", 3.0, 1.0));    // marge 2
        produits.add(new Produit("Sac", 20.0, 15.0));    // marge 5
        produits.add(new Produit("Manteau", 200.0, 150.0));    // marge 5
        produits.add(new Produit("Jean", 20.0, 19.5));    // marge 5

        Produit resultat = Analyse.produitLePlusRentable(produits);

        if (resultat != null) {
            System.out.println("Produit le plus rentable  est : " + resultat.getNom());
        } else {
            System.out.println("Aucun produit trouvé.");
        }

        Produit result = Analyse.produitLeMoinsRentable(produits);
        if (result != null) {
            System.out.println("Produit le moins  rentable  est : " + result.getNom());
        }else {
            System.out.println("Aucun produit trouvé");
        }
    }

}