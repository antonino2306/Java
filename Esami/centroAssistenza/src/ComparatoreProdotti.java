package lib.utils;
import java.util.Comparator;

public class ComparatoreProdotti implements Comparator<Prodotto> {

    @Override
    public int compare(Prodotto p1, Prodotto p2) {

        return -1 * Double.compare(p1.getCostoRiparazioneStimato(), p2.getCostoRiparazioneStimato());

    }

}