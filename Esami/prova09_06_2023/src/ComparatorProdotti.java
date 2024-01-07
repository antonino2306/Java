package lib.util;
import java.util.Comparator;

public class ComparatorProdotti implements Comparator<Prodotto> {

  
    public int compare(Prodotto p1, Prodotto p2) {

        return Double.compare(p1.getCosto(), p2.getCosto());

    }

} 