package lib.util;
import java.util.Date;

public class Transazione {

    private int codiceCliente;
    private String dataTransazione;
    private int codiceArticolo;
    private double prezzoUnitario;
    private int quantitaArticoli;
    private double totale;

    public Transazione() {
    }

    public Transazione(int codiceCliente, Articolo a, int quantitaArticoli) {

        setDataTransazione(dataTransazione);
        this.codiceCliente = codiceCliente;
        this.codiceArticolo = a.getCodice();
        this.prezzoUnitario = a.getPrezzo();
        setQuantitaArticoli(quantitaArticoli);
        this.totale = prezzoUnitario * quantitaArticoli;

    }

    private void setDataTransazione(String dataTransazione) {
        Date data = new Date();
        this.dataTransazione = data.toString();

    } 

    private void setQuantitaArticoli(int quantitaArticoli) {
        if (quantitaArticoli < 0) {
            throw new InvalidDataException("Non puoi acquistare un numero negativo di articoli");
        }

        this.quantitaArticoli = quantitaArticoli;
    }

    public double getTotale() {
        return totale;
    }

    public int getCodiceCliente() {
        return codiceCliente;
    }

    @Override
    public String toString() {
        return "codice cliente: " + codiceCliente + 
                "\ncodice articolo: " + codiceArticolo + "/ prezzo unitario: " + prezzoUnitario + "/ quantità: " + quantitaArticoli +
                "\n data acquisto: " + dataTransazione;

    }

}