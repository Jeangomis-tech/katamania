package com.jc;

public class Produit {
   private  String nom;
    private double prix;
   private  double cout;

    public Produit(String nom, double prix, double cout) {
        this.nom = nom;
        this.prix = prix;
        this.cout = cout;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double getCout() {
        return cout;
    }

    public void setCout(double cout) {
        this.cout = cout;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "nom='" + nom + '\'' +
                ", prix=" + prix +
                ", cout=" + cout +
                '}';
    }
}
