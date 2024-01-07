package lib.util;

public class SerieTv extends Video {

    private int numEpisodi;
    private int episodioSelezionato;

    public SerieTv() {
        this("-", 0, 0, false);
    }

    public SerieTv(String titolo, int numEpisodi, int episodioSelezionato, boolean inRiproduzione) {
        super(titolo, inRiproduzione);
        setNumEpisodi(numEpisodi);
        setEpisodioSelezionato(episodioSelezionato);
    }

    private void setNumEpisodi(int numEpisodi) {
        if (numEpisodi < 0) {
            throw new NumeroNonValidoException("Il numero di episodi inserito non è valido");
        }

        this.numEpisodi = numEpisodi;
    }

    private void setEpisodioSelezionato(int episodioSelezionato) {
        if (episodioSelezionato < 0 || episodioSelezionato > numEpisodi) {
            throw new NumeroNonValidoException("L'episodio selezionato non esiste");
        }
        this.episodioSelezionato = episodioSelezionato;
    }

    @Override
    public void play() {

        if (getStato()) {
            throw new RiproduzioneGiaInCorsoException("La riproduzione è già in corso");
        }

        System.out.println(getTitolo() + " " + episodioSelezionato);
        setStato(true);

    }

    @Override
    public String toString() {
        return getTitolo() + " " + numEpisodi + " episodi. " + "Episodio selezionato: " + episodioSelezionato;
    }

    


}