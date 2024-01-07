package lib.util;
import java.util.Comparator;

public class ComparatorTransazioni implements Comparator<Transazione> {

    @Override
    public int compare(Transazione t1, Transazione t2) {

        return Double.compare(t1.getTotale(), t2.getTotale());

    }

}