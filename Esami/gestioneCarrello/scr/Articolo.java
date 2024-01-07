package lib.util;

public abstract class Articolo {

    private static int counter = 0;
    private int id;
    private String descrizione;
    private double prezzo;

    public Articolo(String descrizione, double prezzo) throws PriceException {

        id = counter++;

        this.descrizione = descrizione;
        setPrezzo(prezzo);

    }

    private void setPrezzo(double prezzo) throws PriceException {
        if (prezzo < 0) {
            throw new PriceException("Il prezzo inserito non è valido");
        }

        this.prezzo = prezzo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + descrizione + " prezzo: " + prezzo + " €";
    }

}