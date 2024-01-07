package prg.lib;

public class Elettronica extends Prodotto {

    private String marchio;

    public Elettronica() {
        this("", 0, "");
    }

    public Elettronica(String nome, int quantita, String marchio) {
        super(nome, quantita);
        this.marchio = marchio;
    }

    @Override
    public String toString() {
        return super.toString() + " marchio: " + marchio;
    }



}