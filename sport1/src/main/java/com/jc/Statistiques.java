package com.jc;

 public class Statistiques {
    private double distanceTotale;
    private double distanceMoyenne;

    public Statistiques(double distanceTotale, double distanceMoyenne) {
        this.distanceTotale = distanceTotale;
        this.distanceMoyenne = distanceMoyenne;
    }

    public double getDistanceTotale() {
        return distanceTotale;
    }

    public double getDistanceMoyenne() {
        return distanceMoyenne;
    }

}
