package jocZaruriIn3;

import java.util.Random;

public class JocZaruriIn3 {
    private int valoareZar;
    private static int numarTotalAruncari;
    private int sumaJucator;

    public JocZaruriIn3(int sumaJucator){
        this.sumaJucator = sumaJucator;
    }

    public void aruncareZar(){
        Random rand = new Random();
        this.valoareZar = rand.nextInt(6);
        numarTotalAruncari++;
    }

    static int comparareZaruri(JocZaruriIn3 zar1, JocZaruriIn3 zar2, JocZaruriIn3 zar3){
        if (zar1.valoareZar == zar2.valoareZar |  zar2.valoareZar == zar3.valoareZar | zar1.valoareZar ==zar3.valoareZar){
            return 0;
        }
        else if (zar1.valoareZar > zar2.valoareZar && zar1.valoareZar > zar3.valoareZar) {
            return 1;
        }
        else if (zar2.valoareZar > zar1.valoareZar && zar2.valoareZar > zar3.valoareZar){
            return 2;
        }
        else if (zar3.valoareZar > zar1.valoareZar && zar3.valoareZar > zar2.valoareZar) {
            return 3;
        }
        else {
            return 1000000;
        }
    }
    public void adaugaCastig (int miza){
        this.sumaJucator+=miza;
    }

    public void scadePierdere(int miza){
        this.sumaJucator-=miza;
    }

    public int getSumaJucator(){
        return this.sumaJucator;
    }

    public int getNumarTotalAruncari(){
        return numarTotalAruncari;
    }

    public int getValoareZar(){
        return this.valoareZar;
    }
}
