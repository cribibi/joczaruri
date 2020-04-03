package jocZaruriStop2;

import JocZaruri10Fix.JocZaruri10Fix;

public class Main {
    public static void main(String[] args) {
        int miza = 23;
        JocZaruriStop2 jucator1 = new JocZaruriStop2(100);
        JocZaruriStop2 jucator2 = new JocZaruriStop2(150);
        //int i;
        for (int i = 1; ((jucator1.getSumaJucator()>=miza) && (jucator2.getSumaJucator()>=miza)); i++) {
            //System.out.printf("jocul nr:d%", i);
            jucator1.aruncareZar();
            System.out.println("\n\njucator 1 a dat: " + jucator1.getValoareZar());
            jucator2.aruncareZar();
            System.out.println("jucator 2 a dat: " + jucator2.getValoareZar());

            switch (JocZaruriStop2.comparareZaruri(jucator1, jucator2)) {
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
            }System.out.printf("Jucatorul 1 mai are %d lei, iar jucatorul 2 mai are %d lei", jucator1.getSumaJucator(), jucator2.getSumaJucator());

        }
        System.out.println();
        System.out.println("------------");
        System.out.println("numarul de jocuri este: " +  JocZaruriStop2.getNumarTotalAruncari()/2);
        System.out.printf("Jucatorul 1 mai are %d lei, iar jucatorul 2 mai are %d lei", jucator1.getSumaJucator(), jucator2.getSumaJucator());
        }
    }

