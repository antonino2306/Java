package prg.util;

public class Scultura extends OperaDArte {

    private String materiale;

    // Altezza misurata in centimetri
    private int altezza;

    public Scultura() {
        this("-", "-", "-", 0, "-");
    }

    public Scultura(String titolo, String autore, String materiale, int altezza, String dataDiCreazione) {

        super(titolo, autore, dataDiCreazione);
        this.materiale = materiale;

        setAltezza(altezza);

    }

    private void setAltezza(int altezza) {
        if (altezza < 0) {
            throw new InvalidDimensionException("Una scultura non può avere altezza negativa");
        }
        
        this.altezza = altezza;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Materiale: " + materiale + " / " + altezza + " cm";
    }

}