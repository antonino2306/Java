package prg.util;
import java.util.List;
import java.util.ArrayList;

public class Nave {

    private String codice;
    private List<Double> coordinate = new ArrayList<>();

    private double velocita;
    private int direzione;
    private double lunghezza, larghezza;
    private int numeroPasseggeri;

    public Nave(String codice, double coordX, double coordY, double velocita, int direzione, double lunghezza, double larghezza, int numeroPasseggeri) {

        this.codice = codice.toLowerCase();
        coordinate.add(coordX);
        coordinate.add(coordY);
        setVelocita(velocita);
        setDimensioni(lunghezza, larghezza);
        setDirezione(direzione);
        setNumeroPasseggeri(numeroPasseggeri);

    }

    private void setVelocita(double velocita) {
        if (velocita < 0) {
            throw new InvalidDataError("La velocità non può essere negativa");
        }

        this.velocita = velocita;
    }

    private void setDimensioni(double lunghezza, double larghezza) {

        if (lunghezza < 0 || larghezza < 0) {
            throw new InvalidDataError("Le dimensioni devono essere valori maggiori di 0");
        }

        this.lunghezza = lunghezza;
        this.larghezza = larghezza;

    }

    private void setDirezione(int direzione) {
        if (direzione < 0 || direzione > 359) {
            throw new InvalidDataError("La direzione deve essere un angolo compreso tra 0 e 359");
        }
        this.direzione = direzione;
    }

    private void setNumeroPasseggeri(int numeroPasseggeri) {
        if (numeroPasseggeri < 0) {
            throw new InvalidDataError("Il numero di passeggeri deve essere maggiore di 0");
        }
        this.numeroPasseggeri = numeroPasseggeri;
    }

    public void avanza() {
        double x = coordinate.get(0) + velocita * Math.cos(direzione * 3.14 / 180);
        double y = coordinate.get(1) + velocita * Math.sin(direzione * 3.14 / 180);

        coordinate.set(0, x);
        coordinate.set(1, y);
    }

    public String getCodice() {
        return codice;
    } 

    public List<Double> getCoordinate() {
        return coordinate;
    }

    @Override
    public String toString() {

        return codice + " (" + coordinate.get(0) + ", " + coordinate.get(1) + ") velocità: " + velocita +
                        "dimensioni: " + lunghezza + "x" + larghezza + " numero passeggeri: " + numeroPasseggeri;

    }

}