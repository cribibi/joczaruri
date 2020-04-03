package jocZaruri10;

import jocZaruri.JocZaruri;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int miza = 10;
        JocZaruri10 jucator1 = new JocZaruri10(100);
        JocZaruri10 jucator2 = new JocZaruri10(150);

        Scanner tastatura = new Scanner(System.in);
        System.out.println("Doriti sa jucati? Puteti juca maxim 10 jocuri");
        String raspuns = tastatura.nextLine();

        if (raspuns.equalsIgnoreCase("da")) {
            do {
                jucator1.aruncareZar();
                System.out.println("jucator 1 a dat: " + jucator1.getValoareZar());
                jucator2.aruncareZar();
                System.out.println("jucator 2 a dat: " + jucator2.getValoareZar());

                switch (JocZaruri10.comparareZaruri(jucator1, jucator2)) {
                    case -1:
                        jucator1.adaugaCastig(miza);
                        jucator2.scadePierdere(miza);
                        break;
                    case 0:
                        System.out.println("egal");
                        break;
                    case 1:
                        jucator2.adaugaCastig(miza);
                        jucator1.scadePierdere(miza);
                        break;
                    default:
                        System.out.println("Ai dat de o eroare grava!");
                }
                System.out.println("Doriti sa jucati? Puteti juca maxim 10 jocuri.");
                raspuns = tastatura.nextLine();
            } while (raspuns.equalsIgnoreCase("da")&&jucator1.getNumarTotalAruncari()/2<10);

            System.out.println("numarul de jocuri este: " + jucator1.getNumarTotalAruncari()/ 2);
            System.out.printf("Jucatorul 1 mai are %d lei, iar jucatorul 2 mai are %d lei", jucator1.getSumaJucator(), jucator2.getSumaJucator());
        } else {
            System.out.println("stop joc");
        }
    }
}
