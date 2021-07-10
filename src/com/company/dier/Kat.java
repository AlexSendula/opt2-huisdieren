package com.company.dier;

public class Kat extends Dier {
    private Integer poten;
    private boolean huisKat;
    private String vachtKleur;
    private Soort soort;

    enum Soort {
        KAT;
    }

    public Kat(String naam, Integer leeftijd, boolean nachtelijk, Integer poten, Boolean huisKat, String vachtKleur) {
        super(naam, leeftijd, nachtelijk);
        this.poten = poten;
        this.huisKat = huisKat;
        this.vachtKleur = vachtKleur;
        this.soort = Soort.KAT;
    }

    public Integer getPoten() {
        return poten;
    }

    public boolean getHuisKat() {
        return huisKat;
    }

    public String getVachtKleur() {
        return vachtKleur;
    }

    public Soort getSoort() {
        return soort;
    }
}
