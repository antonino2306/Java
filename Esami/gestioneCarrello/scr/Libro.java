package lib.util;

public class Libro extends Articolo {

    private String titolo, autore;

    public Libro(String titolo, String autore, String descrizione, double costo) throws PriceException {
        super(descrizione, costo);

        this.titolo = titolo;
        this.autore = autore;
    }

    @Override
    public String toString() {
        return super.toString() + " " + titolo + " " + autore;
    }

}