package lib.util;

public class Film extends Video {

    private int durata;

    public Film() {

    }

    public Film(String titolo, int durata, boolean inRiproduzione) {
        super(titolo, inRiproduzione);

        setDurata(durata);
    }

    private void setDurata(int durata) {

        if (durata < 0) {
            this.durata = 0;
        }

        this.durata = durata;
    }

    @Override
    public void play() {

        if (getStato()) {
            throw new RiproduzioneGiaInCorsoException("Il film è già in riproduzione");
        }

        System.out.println("Riproduzione del film: " + getTitolo());
        setStato(true);

    }

    @Override 
    public String toString() {
        return getTitolo() + " " + durata + " minuti";
    }

}