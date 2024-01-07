package lib.util;

public abstract class Video implements Riproduzione {

    private static int contatore = 0;
    private int id;
    private String titolo;
    private boolean inRiproduzione;

    public Video() {
        this("-", false);
    }

    public Video(String titolo, boolean inRiproduzione) {
        id = contatore++;

        this.titolo = titolo;
        this.inRiproduzione = inRiproduzione;
    }

    public boolean getStato() {
        return inRiproduzione;
    }

    public void setStato(boolean inRiproduzione) {
        this.inRiproduzione = inRiproduzione;
    }

    public int getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    @Override
    public void pause() {

        if (inRiproduzione) {
            System.out.println("PAUSE");
            setStato(false);
        }

    }

    @Override
    public String toString() {
        return id + " " + titolo + " in riproduzione: " + inRiproduzione;
    }

}