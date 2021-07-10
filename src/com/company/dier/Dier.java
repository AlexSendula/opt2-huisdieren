package com.company.dier;

public abstract class Dier {
    private String naam;
    private Integer leeftijd;
    private boolean nachtelijk;

    public Dier(String naam, Integer leeftijd, boolean nachtelijk) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.nachtelijk = nachtelijk;
    }

    public String getNaam() {
        return naam;
    }

    public Integer getLeeftijd() {
        return leeftijd;
    }

    public boolean isNachtelijk() {
        return nachtelijk;
    }
}
