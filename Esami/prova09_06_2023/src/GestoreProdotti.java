package lib.util;
import java.util.List;
import java.util.ArrayList;


public class GestoreProdotti {

    private List<Prodotto> lista = new ArrayList<>();

    public GestoreProdotti() {

    }

    public void add(Prodotto p) {

        lista.add(p);

    }

    public int contaProdottiAlimentati220() {

        int counter = 0;
        for (Prodotto p: lista) {

            if (p instanceof Elettronica prodotto) {
                
                if (prodotto.getTensione() == 220) {
                    counter++;
                }

            }

        }

        return counter;

    }

    public int contaIOS() {

        int counter = 0;

        for (Prodotto p: lista) {

            if (p instanceof Smartphone s) {

                if (s.getSistema().equals("ios")) {
                    counter++;
                }

            }

        }

        return counter;

    }

    public void stampaLista() {

        lista.sort(new ComparatorProdotti());

        for (Prodotto p: lista) {
            System.out.println(p);
        }

    }

}