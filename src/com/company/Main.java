package com.company;

import com.company.dier.Slang;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Eigenaar julia = new Eigenaar("Julia", 24);

        Slang slang1 = new Slang("slang1", 1, true, 11.1, false);
        Slang slang2 = new Slang("slang2", 2, false, 22.2, false);
        Slang slang3 = new Slang("slang3", 3, true, 33.3, true);

        julia.slangen.add(slang1);
        julia.slangen.add(slang2);
        julia.slangen.add(slang3);

        while (true) {
            System.out.println();
            System.out.println("Kies een van de volgende menu-opties:");
            System.out.println("1.  Huisdier toevoegen");
            System.out.println("2.  Overzicht");
            System.out.println("3.  Afsluiten");

            Scanner scanner = new Scanner(System.in);
            int keuze = scanner.nextInt();
            scanner.nextLine();

            switch (keuze) {
                case 1 -> julia.nieuwHuisdier();
                case 2 -> julia.overzichtHuisdieren();
                case 3 -> {
                    System.out.println("Doei");
                    System.exit(0);
                }
            }
        }
    }
}
