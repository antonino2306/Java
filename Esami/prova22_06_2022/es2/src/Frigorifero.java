package lib.utils;

public class Frigorifero extends Elettrodomestico {

    private int temperaturaMinima;
    
    // altezza in centimetri
    private int altezza;

    public Frigorifero(String classeEnergetica, double prezzo, int temperaturaMinima, int altezza) {

        super(classeEnergetica, prezzo);

        this.temperaturaMinima = temperaturaMinima;
        this.altezza = Math.abs(altezza);

    }

    @Override
    public String toString() {
        return super.toString() + " temperatura minima: " + temperaturaMinima + " °C, altezza: " + altezza + " cm";
    }


}