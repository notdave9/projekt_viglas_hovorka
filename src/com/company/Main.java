package com.company;

import java.time.Year;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vyberte si jaký projekt chcete spustit");
        System.out.println("1 -- obchod");
        System.out.println("2 -- třídění čísel");
        System.out.println("3 -- kvíz");
        System.out.println("4 -- přestupný rok");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("Vítej v obchodě");
                int cena = 0;
                boolean end = false;
                do {
                    System.out.println("");
                    System.out.println("Vyberte si položku");
                    System.out.println("1 - Mobilní telefony");
                    System.out.println("2 - Chytré hodinky");
                    System.out.println("3 - Přejít k platbě");
                    int num = sc.nextInt();
                    switch (num) {
                        case 1:
                            System.out.println("Mobilní telefony");
                            System.out.println("iPhone 14 Pro 1TB (49 990Kč,-)");
                            System.out.println("Huawei Mate Xs 2 (49 990Kč,-)");
                            System.out.println("Samsung Galaxy Z Fold4 (44 990Kč,-)");
                            int telefony = sc.nextInt();
                            switch (telefony){


                                case 1:
                                    System.out.println("iPhone 14 Pro 1TB byl vybrán, +49 990Kč,- k účtu");
                                    cena+=49990;

                                    break;
                                case 2:
                                    System.out.println("Huawei Mate Xs 2 byl vybran, +49 990Kč k účtu");
                                    cena +=49990;
                                    break;
                                case 3:
                                    System.out.println("Samsung Galaxy Z Fold4, +44 990Kč k účtu");
                                    cena+=44990;
                                    break;
                            }
                            break;

                        case 2:
                            System.out.println("Chytré hodinky");
                            System.out.println("Apple Watch Series 8 45mm Cellular Grafitový nerez s grafitovým milánským tahem (24 990,- Kč)");
                            System.out.println("Garmin Tactix Delta PRO Solar Sapphire  (22 490,- Kč)");
                            System.out.println("Samsung Galaxy Watch 5 Pro 45mm šedé (11 999,- Kč)");
                            int hodinky = sc.nextInt();

                            switch (hodinky){
                                case 1:
                                    System.out.println("Apple Watch Series 8 45mm Cellular Grafitový nerez s grafitovým milánským tahem byly vybrany, +24 990");
                                    cena+=24990;
                                    break;
                                case 2:
                                    System.out.println("Garmin Tactix Delta PRO Solar Sapphire  byly vybrány, +22 490");
                                    cena+=22490;
                                    break;
                                case 3:
                                    System.out.println("Samsung Galaxy Watch 5 Pro 45mm šedé byly vybrány, +11 999");
                                    cena+=11999;
                                    break;
                            }
                            break;


                        case 3:
                            System.out.println("Vyúčtování...");
                            end = true;
                            break;
                        default:
                            break;
                    }

                }
                while(!end);
                System.out.println("Celková cena" +cena + "Kč");
                break;
            case 2 :
                System.out.println("Kolik čísel si přejete setřídit:");
                int velikost = sc.nextInt();
                System.out.println("Zadejte čísla která chcete setřídit");
                int[] pole = new int[velikost];

                for (int i = 0; i <pole.length; i++) {
                    pole[i] = sc.nextInt();
                }
                Arrays.sort(pole);

                for (int i = 0; i <pole.length ; i++) {
                    System.out.println(pole[i]);

                }
                break;

            case 3:
                int Body = 0;
                System.out.println("je moje oblibena barva cerna?");
                String color = sc.nextLine();
                if (color.equalsIgnoreCase("ano")){
                    System.out.println("toto neni spravna odpoved, moje oblibena barva je bila, 0 bodu");
                }
                else {
                    System.out.println("ano, toto je sprava odpoved, +1 bod"); Body = 1;
                }
                System.out.println("Bude dnes prset?");
                String Weather = sc.nextLine();
                if(Weather.equalsIgnoreCase("ano")){
                    System.out.println("ano, bez napovedy, +1 bod"); Body++;
                }
                else {
                    System.out.println("spatne, bez bodu");
                }
                System.out.println("Mam se dnes dobre?");
                String mood = sc.nextLine();
                if (mood.equalsIgnoreCase("ano")){
                    System.out.println("toto je spravna odpoved, 1 bod"); Body++;
                }
                else {
                    System.out.println("Toto je spatna odpoved, bez bodu");
                }
                System.out.println("Mam na sobe mikinu?");
                String sweatshirt = sc.nextLine();
                if(sweatshirt.equalsIgnoreCase("ano")){
                    System.out.println("ano, bez napovedy, +1 bod");
                    Body++; }
                else {
                    System.out.println("spatne, bez bodu");
                }

                System.out.println("Budu mit dnes k veceri pizzu?");
                String dinner = sc.nextLine();
                if(dinner.equalsIgnoreCase("ano")){
                    System.out.println("Spatne, bezu bodu");
                }
                else {
                    System.out.println("ano spravne + bod");
                    Body++;  }
                System.out.println(Body + " body");

                break;

            case 4:
                System.out.println("zadej rok");
                int rok = (sc.nextInt());
                if(Year.isLeap(rok)){
                    System.out.println("rok je prestupny");
                }
                else{
                    System.out.println("rok neni prestupny");
                }
                break;
        }

    }
        }

