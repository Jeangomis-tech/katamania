package com.jc;

import java.util.List;

public class Analyse {


    public static Produit produitLePlusRentable(List<Produit> produits) {

        Produit meilleurProduit = null;
        double maxMarge = Double.NEGATIVE_INFINITY;
        for (Produit p : produits) {

            double marge = p.getPrix() - p.getCout();
            if (marge > maxMarge) {
                maxMarge = marge;
                meilleurProduit = p;
            }
        }
        return meilleurProduit;
    }

    public static Produit produitLeMoinsRentable(List<Produit> produits) {
        Produit pireProduit = null;
        double minMarge = Double.POSITIVE_INFINITY;
        for (Produit p : produits) {
            double marge = p.getPrix() - p.getCout();
            if (marge < minMarge) {
                minMarge = marge;
                pireProduit = p;
            }
        }
        return pireProduit;
    }
}
