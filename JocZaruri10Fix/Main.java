package JocZaruri10Fix;

import jocZaruri10.JocZaruri10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int miza = 10;
        JocZaruri10Fix jucator1 = new JocZaruri10Fix(100);
        JocZaruri10Fix jucator2 = new JocZaruri10Fix(150);

        for (int i = 0; i <10 ; i++) {
            jucator1.aruncareZar();
            System.out.println("jucator 1 a dat: " + jucator1.getValoareZar());
            jucator2.aruncareZar();
            System.out.println("jucator 2 a dat: " + jucator2.getValoareZar());

            switch (JocZaruri10Fix.comparareZaruri(jucator1, jucator2)) {
                case -1:
                    jucator1.adaugaCastig(miza);
                    jucator2.scadePierdere(miza);
                    System.out.println("jucator 1 a castigat");
                    break;
                case 0:
                    System.out.println("egal");
                    break;
                case 1:
                    jucator2.adaugaCastig(miza);
                    jucator1.scadePierdere(miza);
                    System.out.println("jucator 2 a castigat");
                    break;
                default:
                    System.out.println("Ai dat de o eroare grava!");
            } System.out.printf("Jucatorul 1 mai are %d lei, iar jucatorul 2 mai are %d lei",
                    jucator1.getSumaJucator(), jucator2.getSumaJucator());
            System.out.println();
            System.out.println("----------------------");
        }
        System.out.println("numarul de jocuri este: " + jucator1.getNumarTotalAruncari()/ 2);
        }
    }

