package lib.util;
import java.util.List;
import java.util.Arrays;

public class Birra extends Bevanda {

    private String tipologia;
    private List<String> tipiBirre = Arrays.asList("lager", "blanche", "ipa", "stout");

    public Birra(String descrizione, double costo, String tipologia) {
        super(descrizione, costo);

        setTipologia(tipologia);
    }

    private void setTipologia(String tipologia) {

        if (!tipiBirre.contains(tipologia.toLowerCase())) {

            throw new InvalidBeerTypeException("Il tipo di birra selezionato non esiste");

        }

        this.tipologia = tipologia.toLowerCase();

    }

    public String getTipologia() {
        return tipologia;
    }

     @Override
    public String toString() {
        return super.toString() + " tipologia: " + tipologia;
    }


}