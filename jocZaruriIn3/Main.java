package jocZaruriIn3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int miza = 10;
        JocZaruriIn3 jucator1 = new JocZaruriIn3(100);
        JocZaruriIn3 jucator2 = new JocZaruriIn3(150);
        JocZaruriIn3 jucator3 = new JocZaruriIn3(150);


        Scanner tastatura = new Scanner(System.in);
        System.out.println("Doriti sa jucati?");
        String raspuns = tastatura.nextLine();

        if (raspuns.equalsIgnoreCase("da")) {
            do {
                jucator1.aruncareZar();
                System.out.println("jucator 1 a dat: " + jucator1.getValoareZar());
                jucator2.aruncareZar();
                System.out.println("jucator 2 a dat: " + jucator2.getValoareZar());
                jucator3.aruncareZar();
                System.out.println("jucator 3 a dat: " + jucator3.getValoareZar());

                jucator1.getNumarTotalAruncari();

                switch (JocZaruriIn3.comparareZaruri(jucator1, jucator2, jucator3)) {
                    case 1:
                        jucator1.adaugaCastig(miza*2);
                        jucator2.scadePierdere(miza);
                        jucator3.scadePierdere(miza);
                        break;
                    case 0:
                        System.out.println("egal");
                        break;
                    case 2:
                        jucator2.adaugaCastig(miza*2);
                        jucator1.scadePierdere(miza);
                        jucator3.scadePierdere(miza);
                        break;
                    case 3:
                        jucator3.adaugaCastig(miza*2);
                        jucator1.scadePierdere(miza);
                        jucator2.scadePierdere(miza);
                        break;
                    default:
                        System.out.println("Ai dat de o eroare grava!");
                }
                System.out.println("Doriti sa jucati?");
                raspuns = tastatura.nextLine();
            } while (raspuns.equalsIgnoreCase("da"));

            System.out.println("numarul de jocuri este: " + jucator1.getNumarTotalAruncari() / 3);
            System.out.printf("Jucatorul 1 mai are %d lei, jucatorul 2 mai are %d lei, iar jucatorul 3 mai are %d lei",
                    jucator1.getSumaJucator(), jucator2.getSumaJucator(), jucator3.getSumaJucator());
        } else {
            System.out.println("stop joc");
        }
    }
}


