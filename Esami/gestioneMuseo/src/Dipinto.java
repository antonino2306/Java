package prg.util;
import java.util.List;
import java.util.ArrayList;

public class Dipinto extends OperaDArte {

    private String tecnica;

    // in ordine: lunghezza, altezza espresse in centimetri
    private List<Double> dimensioni = new ArrayList<>(); 

    public Dipinto() {

    }

    public Dipinto(String titolo, String autore, String tecnica, double lunghezza, double altezza, String dataDiCreazione) {
        super(titolo, autore, dataDiCreazione);
        this.tecnica = tecnica;
        setDimensioni(lunghezza, altezza);
    }

    private void setDimensioni(double lunghezza, double altezza) {

        if (lunghezza < 0 || altezza < 0) {
            throw new InvalidDimensionException("Le dimensioni del dipinto devono essere entrambe positive");
        }

        dimensioni.add(lunghezza);
        dimensioni.add(altezza);
    }

    @Override
    public String toString() {
        return super.toString() + "\n Tecnica: " + tecnica + " /" + dimensioni.get(0) + "x" + dimensioni.get(1) + " cm";
    }
}