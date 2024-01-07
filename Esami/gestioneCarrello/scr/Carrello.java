package lib.util;
import java.util.List;
import java.util.ArrayList;

public class Carrello {

    private List<Articolo> carrello = new ArrayList<>();

    public Carrello() {

    }

    public void add(Articolo a) {
        carrello.add(a);
    }

    public void remove(int id) {

        for (Articolo a: carrello) {
            if (a.getId() == id) {
                carrello.remove(a);
            }
        }
    }

    public void visualizzaCarrello() {

        if (carrello.size() == 0) {
            throw new EmptyChartException("Il carrello non contiene articoli");
        }

        for (Articolo a: carrello) {

            System.out.println(a);

        }

    }

    public double totale() {

        if (carrello.size() == 0) {
            throw new EmptyChartException("Il carrello non contiene articoli");
        }

        double totale = 0;

        for (Articolo a: carrello) {
            totale += a.getPrezzo();
        }

        return totale;

    }


    public double totaleVideogiochi() {

        if (carrello.size() == 0) {
            throw new EmptyChartException("Il carrello non contiene articoli");
        }

        double totale = 0;

        for (Articolo a: carrello) {
            
            if (a instanceof Videogioco v) {
                totale += v.getPrezzo();
            }

        }

        if (totale == 0) {
            throw new EmptyChartException("Il carrello non contiene videogiochi");
        }

        return totale;

    }


    public double totaleLibri() {

        if (carrello.size() == 0) {
            throw new EmptyChartException("Il carrello non contiene articoli");
        }

        double totale = 0;

        for (Articolo a: carrello) {
            
            if (a instanceof Libro v) {
                totale += v.getPrezzo();
            }

        }

        if (totale == 0) {
            throw new EmptyChartException("Il carrello non contiene libri");
        }

        return totale;

    }

}