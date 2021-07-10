package com.company.dier;

public class Slang extends Dier{
    private double lengte;
    private boolean giftig;
    private Soort soort;

    enum Soort {
        SLANG;
    }

    public Slang(String naam, Integer leeftijd, boolean nachtelijk, double lengte, Boolean giftig) {
        super(naam, leeftijd, nachtelijk);
        this.lengte = lengte;
        this.giftig = giftig;
        this.soort = Soort.SLANG;
    }

    public double getLengte() {
        return lengte;
    }

    public boolean getGiftig() {
        return giftig;
    }

    public Soort getSoort() {
        return soort;
    }
}
