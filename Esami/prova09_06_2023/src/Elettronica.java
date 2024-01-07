package lib.util;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Elettronica extends Prodotto{

    private List<Integer> tensioni = Arrays.asList(12, 24, 110, 220);
    private int tensioneDiAlimentazione;

    public Elettronica() {
        this("-", 0, 12);
    } 

    public Elettronica(String descrizione, double costo, int tensioneDiAlimentazione) {
        super(descrizione, costo);
        setTensione(tensioneDiAlimentazione);
    }

    private void setTensione(int tensioneDiAlimentazione) {
        if (!tensioni.contains(tensioneDiAlimentazione)) {
            throw new TensioneNonValidaException("Il valore della tensione non è compreso tra quelli accettati");
        }

        this.tensioneDiAlimentazione = tensioneDiAlimentazione;
    }

    public int getTensione() {
        return tensioneDiAlimentazione;
    }

    @Override
    public String toString() {
        return super.toString() + " tensione di alimentazione: " + tensioneDiAlimentazione;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj instanceof Elettronica prod) {

            if (this.hashCode() == prod.hashCode()) {
                return true;
            }

        }

        

        return false;
    }

}