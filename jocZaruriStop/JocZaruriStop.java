package jocZaruriStop;

import java.util.Random;

public class JocZaruriStop {
    private int valoareZar;
    private static int numarTotalAruncari;
    private int sumaJucator;

    public JocZaruriStop(int sumaJucator){
        this.sumaJucator = sumaJucator;
    }

    public void aruncareZar(){
        Random rand = new Random();
        this.valoareZar = rand.nextInt(6);
        numarTotalAruncari++;
    }

    static int comparareZaruri(JocZaruriStop zar1, JocZaruriStop zar2){
        if (zar1.valoareZar == zar2.valoareZar){
            return 0;
        }
        else if (zar1.valoareZar < zar2.valoareZar) {
            return 1;
        }
        else {
            return -1;
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
