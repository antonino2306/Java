package lib.util;

public abstract class Prodotto implements Comparable<Prodotto> {
    private static int counter;
    private int id;
    private String descrizione;
    private double costo;

    public Prodotto() {
        this("-", 0);
    }

    public Prodotto(String descrizione, double costo) {
        id = counter++;
        this.descrizione = descrizione;
        setCosto(costo);

    }

    private void setCosto(double costo) {
        if (costo < 0) {
            throw new CostoNonValidoException("Il prezzo deve essere > 0");
        }

        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    @Override
    public int hashCode() {
        return descrizione.hashCode() + Integer.valueOf(id).hashCode();
    }

    @Override
    public String toString() {
        return "Id: " + id + " " + descrizione + " prezzo: " + costo;
    }


    @Override
    public int compareTo(Prodotto p) {

        //? potevo confrontare in base al costo e non usare il comparator
        return descrizione.compareTo(p.getDescrizione());

    }
}