package prg.util;

public abstract class OperaDArte{

    private String titolo, autore, dataDiCreazione;

    public OperaDArte() {

        this("-", "-", "0/01/0000");

    }

    public OperaDArte(String titolo, String autore, String dataDiCreazione) {
        this.titolo = titolo.toLowerCase();
        this.autore = autore;
        this.dataDiCreazione = dataDiCreazione;
    }


    public String getTitolo() {

        return titolo;

    }
    @Override
    public String toString() {

        return titolo + " realizzata da: " + autore + " / data: " + dataDiCreazione;

    }
}