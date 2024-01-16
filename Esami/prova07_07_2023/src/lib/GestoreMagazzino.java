package prg.lib;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class GestoreMagazzino {

    private List<Prodotto> magazzino = new ArrayList<>();

    public GestoreMagazzino() {

    }

    public GestoreMagazzino(Iterator<Prodotto> i) {

        while (i.hasNext()) {

            magazzino.add(i.next());

        }

    }

    public void inserisciProdotto(Prodotto p) {
        magazzino.add(p);
    }

    public void aggiornaQuantita(int id, int nuovaQuantita) {

        //? Posso cercare per id basandomi sull'indice per il modo in cui genero l'id
        //? e memorizzo i dati nella lista
        //? e soprattutto perché non c'è nessuna funzione che rimuove elementi
        //? altrimenti gli indici non combaciano più con l'id
        if (id < 0 || id >= magazzino.size()) {
            throw new IndexOutOfBoundsException("Il prodotto non è presente nel magazzino");
        }

        magazzino.get(id).setQuantita(nuovaQuantita);

    }

    public Prodotto ricercaProdotto(int id) {
        if (id < 0 || id >= magazzino.size()) {
            throw new IndexOutOfBoundsException("Il prodotto non è presente nel magazzino");
        }
        //? In alternativa posso stampare qui le info del prodotto
        return magazzino.get(id);
    }

    public Iterator<Prodotto> elencoMagazzino() {
        //? In alternativa posso stampare qui l'elenco dei prodotti
        return magazzino.iterator();
    }

    public int totaleProdotti() {

        int totale = 0;
        for (Prodotto p: magazzino) {

            totale += p.getQuantita();

        }

        return totale;

    }

    public Map<String, Integer> totaleProdottiPerTipo() {

        Map<String, Integer> totale = new HashMap<>();

        totale.put("Elettronica", 0);
        totale.put("Abbigliamento", 0);
        totale.put("Alimentare", 0);

        for (Prodotto p: magazzino) {
            if (p instanceof Elettronica prod) {
                int vecchioValore = totale.get("Elettronica");
                totale.replace("Elettronica", vecchioValore + prod.getQuantita());
            }

            if (p instanceof Abbigliamento prod) {
                int vecchioValore = totale.get("Abbigliamento");
                totale.replace("Abbigliamento", vecchioValore + prod.getQuantita());
            }

             if (p instanceof Alimentare prod) {
                int vecchioValore = totale.get("Alimentare");
                totale.replace("Alimentare", vecchioValore + prod.getQuantita());
            }
        }

        return Collections.unmodifiableMap(totale);
    }

}