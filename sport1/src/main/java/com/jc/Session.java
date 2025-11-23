package com.jc;

public class Session {
    private double distance; // en kilomètres
    private String nom;

    public Session(double distance, String nom) {
        this.distance = distance;
        this.nom = nom;
    }

    public double getDistance() {
        return distance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Session{" +
                "distance=" + distance +
                ", nom='" + nom + '\'' +
                '}';
    }
}
