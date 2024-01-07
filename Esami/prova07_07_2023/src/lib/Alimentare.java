package prg.lib;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Alimentare extends Prodotto {

    GregorianCalendar dataScadenza;


    public Alimentare() {
        this("", 0, new GregorianCalendar(0, 0, 1));
    }

    public Alimentare(String nome, int quantita, GregorianCalendar dataScadenza) {
        super(nome, quantita);
        this.dataScadenza = dataScadenza;
    }

    
    @Override 
    public String toString() {
        return super.toString() + " " + dataScadenza.get(Calendar.DAY_OF_MONTH) + "/" + (dataScadenza.get(Calendar.MONTH) + 1) + "/" + dataScadenza.get(Calendar.YEAR);
    }


}