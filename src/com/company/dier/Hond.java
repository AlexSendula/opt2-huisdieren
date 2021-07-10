package com.company.dier;

public class Hond extends Dier {
    private Integer poten;
    private String kleurOgen;
    private Soort soort;

    enum Soort {
        HOND;
    }

    public Hond(String naam, Integer leeftijd, boolean nachtelijk, Integer poten, String kleurOgen) {
        super(naam, leeftijd, nachtelijk);
        this.poten = poten;
        this.kleurOgen = kleurOgen;
        this.soort = Soort.HOND;
    }

    public Integer getPoten() {
        return poten;
    }

    public String getKleurOgen() {
        return kleurOgen;
    }

    public Soort getSoort() {
        return soort;
    }
}
