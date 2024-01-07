package lib.utils;
import java.util.Date;

public class Prodotto {

    private int codiceCliente;
    private String dataRicezione;
    private String descrizioneGuasto;
    private String descrizioneIntervento;
    private double costoRiparazioneStimato;
    private double costoRiparazioneEffettivo;
    private static int contatore = 0;
    private int idRiparazione;

    // false = non consegnato; true = consegnato
    private boolean consegnato;

    public Prodotto(String nomeCliente, String cognomeCliente, String descrizioneGuasto) {
        
        setCodiceCliente(nomeCliente, cognomeCliente);
        setDataRicezione();
        this.descrizioneGuasto = descrizioneGuasto;
        setCostoRiparazioneStimato(descrizioneGuasto);

        idRiparazione = contatore++;
        this.consegnato = false;
    }

    private void setCodiceCliente(String nomeCliente, String cognomeCliente) {

        if (nomeCliente.isEmpty() || cognomeCliente.isEmpty()) {
            throw new InvalidDataException("Le generalità del cliente sono obbligatorie");
        }
        this.codiceCliente = Math.abs(nomeCliente.toLowerCase().hashCode() + cognomeCliente.toLowerCase().hashCode());

    }

    private void setCostoRiparazioneStimato(String descrizioneGuasto) {

        if (descrizioneGuasto.isEmpty()) {
            throw new InvalidDataException("Bisogna descrivere il guasto del prodotto");
        }
        this.costoRiparazioneStimato = descrizioneGuasto.length() * 1.5;

    }

    public void setCostoRiparazioneEffettivo(double costoRiparazioneEffettivo) {
        this.costoRiparazioneEffettivo = costoRiparazioneEffettivo;
    }

    public void setDescrizioneIntervento(String descrizioneIntervento) {

        this.descrizioneIntervento = descrizioneIntervento;

    }

    private void setDataRicezione() {
        Date data = new Date();
        this.dataRicezione = data.toString();
    }

    public int getCodiceCliente() {
        return codiceCliente;
    }

    public int getIdRiparazione() {
        return idRiparazione;
    }

    public double getCostoRiparazioneStimato() {
        return costoRiparazioneStimato;
    }

    public double getCostoRiparazioneEffettivo() {
        return costoRiparazioneEffettivo;
    }

    public boolean getStato() {
        return consegnato;
    }

    public void setStato(boolean stato) {
        this.consegnato = stato;
    }

    public String getDescrizioneIntervento() {
        return descrizioneIntervento;
    }

    @Override 
    public String toString() {
        return "codice cliente: " + codiceCliente + " id: " + idRiparazione +" data ricezione: " + dataRicezione + " costo riparazione stimato: " + costoRiparazioneStimato + "stato: " + consegnato;
    }

}