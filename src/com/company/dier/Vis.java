package com.company.dier;

public class Vis extends Dier{
    private double lengte;
    private Boolean zoetWater;
    private Soort soort;

    enum Soort {
        VIS;
    }

    public Vis(String naam, Integer leeftijd, boolean nachtelijk, double lengte, Boolean zoetWater) {
        super(naam, leeftijd, nachtelijk);
        this.lengte = lengte;
        this.zoetWater = zoetWater;
        this.soort = Soort.VIS;
    }

    public double getLengte() {
        return lengte;
    }

    public boolean getZoetWater() {
        return zoetWater;
    }

    public Soort getSoort() {
        return soort;
    }
}
