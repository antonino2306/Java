package lib.util;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class Registro {

    private LinkedList<Transazione> registroTransazioni = new LinkedList<>();
    private double totaleVenduto;


    public Registro() {
        totaleVenduto = 0;
    }

    public void aggiungiTransazione(String nomeCliente, String cognomeCliente, Articolo a, int quantitaArticoli) {
        int codiceCliente = Math.abs(nomeCliente.toLowerCase().hashCode() + cognomeCliente.toLowerCase().hashCode());
        
        Transazione t = new Transazione(codiceCliente, a, quantitaArticoli);
        totaleVenduto += t.getTotale();

        registroTransazioni.add(t);
        registroTransazioni.sort(new ComparatorTransazioni());
    }

    public double getTotaleVenduto() {
        return totaleVenduto;
    }

    public Iterator<Transazione> getTransazioniMinoriDiValore(double importo) {

        List<Transazione> transazioniMinori = new LinkedList<>();

        for (Transazione t: registroTransazioni) {
            if (t.getTotale() < importo) {
                transazioniMinori.add(t);
            }
            else {
                break;
            }
        }

        return transazioniMinori.iterator();

    }

    public Iterator<Transazione> getTransazioniMaggioriDiValore(double importo) {

        List<Transazione> transazioniMaggiori = new LinkedList<>();
        Iterator<Transazione> iteratore = registroTransazioni.descendingIterator();
        
        while (iteratore.hasNext()) {

            Transazione t = iteratore.next();
            if (t.getTotale() > importo) {
                transazioniMaggiori.add(t);
            } 
            else {
                break;
            }

        }

        return transazioniMaggiori.iterator();

    }

    public double getTotaleTransazioniCliente(String nomeCliente, String cognomeCliente) {
        int codiceCliente = Math.abs(nomeCliente.toLowerCase().hashCode() + cognomeCliente.toLowerCase().hashCode());

        double totaleCliente = 0;

        for (Transazione t: registroTransazioni) {

            if (t.getCodiceCliente() == codiceCliente) {
                totaleCliente += t.getTotale();
            }

        }

        return totaleCliente;
    }

}