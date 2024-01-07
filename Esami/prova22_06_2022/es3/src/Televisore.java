package lib.utils;

public class Televisore implements Comparable<Televisore>{

    private static int counter = 0;
    private int id = 0;
    private double prezzo;
    private String marca, modello;
    private int dimensione; // in pollici

    public Televisore(String marca, String modello, int dimensione, double prezzo) {

        this.marca = marca;
        this.modello = modello;

        this.dimensione = Math.abs(dimensione);
        this.prezzo = Math.abs(prezzo);
    
    }

    public int getDimensione() {
        return dimensione;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }

        if (obj instanceof Televisore t) {

            if (t.hashCode() == hashCode()) {
                return true;
            }

        }

        return false;
    }

    @Override
    public int hashCode() {

        return marca.hashCode() + modello.hashCode();

    }

    @Override
    public int compareTo(Televisore t) {

        return Integer.valueOf(dimensione).compareTo(t.getDimensione());

    }

    @Override
    public String toString() {
        return marca + " " + modello + " " + dimensione + "\" " + prezzo + " €"; 
    }

}