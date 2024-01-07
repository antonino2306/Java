package lib.utils;
import java.util.PriorityQueue;
import java.util.List;
import java.util.LinkedList;


public class Gestore {

    private PriorityQueue<Prodotto> elencoRiparazioni = new PriorityQueue<>(new ComparatoreProdotti());
    private List<Prodotto> prodottiRiparati = new LinkedList<>();


    public Gestore() {

    }

    public void aggiungiProdottoDaRiparare(Prodotto p) {

        elencoRiparazioni.add(p);

    }

    public void ripara(String descrizione) {
        Prodotto inRiparazione = elencoRiparazioni.poll();

        if (descrizione.isEmpty()) {
            throw new InvalidDataException("Bisogna descrivere la riparazione effettuata");
        }

        if (inRiparazione != null) {

            
            double costoPezziDiRicambio = descrizione.length() * 1.1;
            double oreLavorate = (int)((Math.random() * 100) % 10 + 1);

            inRiparazione.setCostoRiparazioneEffettivo(0.6 * inRiparazione.getCostoRiparazioneStimato() + costoPezziDiRicambio + oreLavorate*30);

            inRiparazione.setDescrizioneIntervento(descrizione);

            prodottiRiparati.add(inRiparazione);

        }
        else {
            throw new EmptyRegisterException("Non ci sono prodotti da riparare");
        }
    }

    public Prodotto consegnaProdottoRiparato(int idRiparazione, String nomeCliente, String cognomeCliente) {

        int codiceCliente = Math.abs(nomeCliente.toLowerCase().hashCode() + cognomeCliente.toLowerCase().hashCode());

        for (Prodotto p: prodottiRiparati) {

            if (p.getStato()) {
                throw new InvalidDataException("Il prodotto in questione è già stato consegnato");
            }

            if (p.getIdRiparazione() == idRiparazione && p.getCodiceCliente() == codiceCliente) {

                if (p.getCostoRiparazioneEffettivo() == 0) {
                    throw new InvalidDataException("Il prodotto non è stato ancora riparato");
                }

                System.out.println("Intervento: " + p.getDescrizioneIntervento() + " costo riparazione: " + p.getCostoRiparazioneEffettivo());
                
                // Prodotto consegnato
                p.setStato(true);
                return p;
            }

        }

        throw new EmptyRegisterException("Il prodotto non è nel registro");

    }


    public void stampaProdottiDaRiparare() {

        for (Prodotto p: elencoRiparazioni) {
            System.out.println(p);
        }

    }

    public void stampaProdottiRiparati() {

        for (Prodotto p: prodottiRiparati) {
            System.out.println(p);
        }

    }

}