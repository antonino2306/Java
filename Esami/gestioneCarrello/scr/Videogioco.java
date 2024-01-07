package lib.util;

public class Videogioco extends Articolo {

    private String piattaforma;

    public Videogioco(String descrizione, String piattaforma, double costo) throws PriceException {
        super(descrizione, costo);
        this.piattaforma = piattaforma;
    }

    @Override
    public String toString() {
        return super.toString() + " piattaforma: " + piattaforma;
    }

}