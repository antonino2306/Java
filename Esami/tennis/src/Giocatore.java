package prg.util;

public class Giocatore {

    private String nome, cognome;
    private int posizioneClassifica;

    public Giocatore() {

    }

    public Giocatore(String nome, String cognome, int posizioneClassifica) {
        this.nome = nome;
        this.cognome = cognome;
        setPosizioneClassifica(posizioneClassifica);
    }

    private void setPosizioneClassifica(int posizioneClassifica) {
        if (posizioneClassifica < 0) {
            throw new AttributoNonValidoException("La posizione in classifica deve essere >= 1");
        }
        this.posizioneClassifica = posizioneClassifica;
    }

    @Override 
    public String toString() {
        return nome + " " + cognome + " posizione in classifica: " + posizioneClassifica;
    }

}