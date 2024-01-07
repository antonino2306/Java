package lib.util;

public class Articolo {

    private static int contatore = 0;
    private int codice;
    private String nome;
    private double prezzo;

    public Articolo() {
        this("-", 0);
    }

    public Articolo(String nome, double prezzo) {

        codice = contatore++;
        this.nome = nome;
        this.prezzo = Math.abs(prezzo);

    }

    public int getCodice() {
        return codice;
    }

    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {

        return "Codice Articolo: " + codice + "/ Prezzo: " + prezzo;

    }



}