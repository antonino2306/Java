package lib.util;

public abstract class Bevanda {

    private static int counter = 0;
    private int codice;

    private String descrizione;
    private double costo;

    public Bevanda(String descrizione, double costo) {
        codice = counter++;

        this.descrizione = descrizione;
        setCosto(costo);
    }

    private void setCosto(double costo) {

        if (costo < 0) {
            throw new InvalidNumberException("il prezzo della bevanda non può essere negativo");
        }
        this.costo = costo;

    }

    public int getCodice() {
        return codice;
    }

    @Override
    public String toString() {
        return codice + " " + descrizione + " " + costo + " €";
    }

}