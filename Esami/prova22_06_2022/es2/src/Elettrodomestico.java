package lib.utils;



public abstract class Elettrodomestico {

    private static int counter = 0;
    private int id;

    private String classeEnergetica;
    private double prezzo;

    public Elettrodomestico(String classeEnergetica, double prezzo) {

        id = counter++;

        this.classeEnergetica = classeEnergetica.toUpperCase();
        setPrezzo(prezzo);
    }


    private void setPrezzo(double prezzo) {

        if (prezzo < 0) {
            this.prezzo = prezzo * -1;
        }
        this.prezzo = prezzo;

    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {

        return id + " " + prezzo + "€, classe Energetica: " + classeEnergetica;

    }

}