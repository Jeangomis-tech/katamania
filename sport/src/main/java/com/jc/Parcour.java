package com.jc;

import java.util.List;

public class Parcour {
   private double distance;
    private String session;


    public Parcour(double distance, String session) {
        this.distance = distance;
        this.session = session;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    @Override
    public String toString() {
        return "Montre{" +
                "distance=" + distance +
                ", session='" + session + '\'' +
                '}';
    }

}
