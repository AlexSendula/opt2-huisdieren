package com.company;

import com.company.dier.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Eigenaar {
    private String naam;
    private Integer leeftijd;
    public ArrayList<Slang> slangen = new ArrayList<>();
    public ArrayList<Vis> vissen = new ArrayList<>();
    public ArrayList<Hond> honden = new ArrayList<>();
    public ArrayList<Kat> katten = new ArrayList<>();

    public Eigenaar(String naam, Integer leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    public enum Soort {
        SLANG, VIS, HOND, KAT
    }

    public void nieuwHuisdier() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welk soort huisdier? (Slang, Vis, Hond, Kat)");
        String soort = scanner.nextLine();

        if (soortChecker(soort) == null) {
            System.out.println("Probeer het opnieuw.");
            return;
        }

        System.out.println("Naam?");
        String naam = scanner.nextLine();

        System.out.println("Leeftijd?");
        Integer leeftijd = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Is het nachtelijk? (Ja / Nee)");
        boolean nachtelijk = scanner.nextLine().equalsIgnoreCase("ja");

        switch (soortChecker(soort)) {
            case SLANG -> nieuwSlang(naam, leeftijd, nachtelijk);
            case VIS -> nieuwVis(naam, leeftijd, nachtelijk);
            case HOND -> nieuwHond(naam, leeftijd, nachtelijk);
            case KAT -> nieuwKat(naam, leeftijd, nachtelijk);
        }
    }

    public Soort soortChecker(String soort) {
        return switch (soort.toLowerCase()) {
            case "slang" -> Soort.SLANG;
            case "vis" -> Soort.VIS;
            case "hond" -> Soort.HOND;
            case "kat" -> Soort.KAT;
            default -> null;
        };
    }

    public void nieuwSlang(String naam, Integer leeftijd, boolean nachtelijk) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wat is de lengte?");
        double lengte = Double.parseDouble(scanner.nextLine());

        System.out.println("Is het giftig?");
        boolean giftig = scanner.nextLine().equalsIgnoreCase("ja");

        Slang slang = new Slang(naam, leeftijd, nachtelijk, lengte, giftig);
        slangen.add(slang);
    }

    public void nieuwVis(String naam, Integer leeftijd, boolean nachtelijk) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wat is de lengte?");
        double lengte = Double.parseDouble(scanner.nextLine());

        System.out.println("Is het een zoetwater vis?");
        boolean zoetWater = scanner.nextLine().equalsIgnoreCase("ja");

        Vis vis = new Vis(naam, leeftijd, nachtelijk, lengte, zoetWater);
        vissen.add(vis);
    }

    public void nieuwHond(String naam, Integer leeftijd, boolean nachtelijk) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welke kleur ogen heeft je hond?");
        String kleurOgen = scanner.nextLine();

        Hond hond = new Hond(naam, leeftijd, nachtelijk, 4, kleurOgen);
        honden.add(hond);
    }

    public void nieuwKat(String naam, Integer leeftijd, boolean nachtelijk) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is het een huiskat?");
        boolean huisKat = scanner.nextLine().equalsIgnoreCase("ja");

        System.out.println("Welke kleur vacht heeft je kat?");
        String vachtKleur = scanner.nextLine();

        Kat kat = new Kat(naam, leeftijd, nachtelijk, 4, huisKat, vachtKleur);
        katten.add(kat);
    }

    public void overzichtHuisdieren() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welk soort huisdier? (Slang, Vis, Hond, Kat)");
        String soort = scanner.nextLine();

        if (soortChecker(soort) == null) {
            System.out.println("Probeer het opnieuw.");
            return;
        }

        loopHuisdieren(soort);
    }

    public void loopHuisdieren(String soort) {
        if (soort.equalsIgnoreCase("slang") && slangen.size() != 0) {
            System.out.printf("%s heeft %d slangen.\n", this.naam, slangen.size());

            System.out.printf("%s", slangen.get(0).getNaam());
            for (int i = 1; i < slangen.size(); i++) {
                System.out.printf(", %s", slangen.get(i).getNaam());
            }
            System.out.println("");
            return;

        } else if (soort.equalsIgnoreCase("vis")) {
            System.out.printf("%s heeft %d vissen.\n", this.naam, vissen.size());

            System.out.printf("%s", vissen.get(0).getNaam());
            for (int i = 1; i < vissen.size(); i++) {
                System.out.printf(", %s", vissen.get(i).getNaam());
            }
            System.out.println("");
            return;

        } else if (soort.equalsIgnoreCase("hond")) {
            System.out.printf("%s heeft %d honden.\n", this.naam, honden.size());

            System.out.printf("%s", honden.get(0).getNaam());
            for (int i = 1; i < honden.size(); i++) {
                System.out.printf(", %s", honden.get(i).getNaam());
            }
            System.out.println("");
            return;

        } else if (soort.equalsIgnoreCase("kat")) {
            System.out.printf("%s heeft %d katten.\n", this.naam, katten.size());

            System.out.printf("%s", katten.get(0).getNaam());
            for (int i = 1; i < katten.size(); i++) {
                System.out.printf(", %s", katten.get(i).getNaam());
            }
            System.out.println("");
            return;
        }
    }
}
