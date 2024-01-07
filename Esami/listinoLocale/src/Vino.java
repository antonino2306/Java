package lib.util;

public class Vino extends Bevanda {

    private int anno;

    public Vino(String descrizione, double costo, int anno) {
        super(descrizione, costo);

        setAnno(anno);
    }

    private void setAnno(int anno) {

        if (anno < 2000 || anno > 2019) {
            throw new InvalidNumberException("L'anno inserito non è accettabile");
        }

        this.anno = anno;

    }

    @Override
    public String toString() {
        return super.toString() + " anno: " + anno;
    }

}