package prg.lib;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Abbigliamento extends Prodotto {

    private List<String> listaTaglie = Arrays.asList("xs", "s", "m", "l", "xl", "xxl", "xxxl"); 
    private String taglia;
    private String colore;

    public Abbigliamento() {

    }

    public Abbigliamento(String nome, int quantita, String taglia, String colore) {
        super(nome, quantita);
        setTaglia(taglia);
        this.colore = colore;
    }

    private void setTaglia(String taglia) {
        if (listaTaglie.contains(taglia.toLowerCase())) {
            this.taglia = taglia.toLowerCase();
        }
        else {
            throw new TagliaInesistenteException("La taglia che hai inserito non esiste");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " taglia: " + taglia + " colore: " + colore;
    }

}