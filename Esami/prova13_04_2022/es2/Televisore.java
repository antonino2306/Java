package prg.lib;
import java.util.Scanner;

public class Televisore implements Spegnimento {

    private static int counter = 0;
    private int id;
    private String modello;
    private int dimensione;

    public Televisore() {
        this("-", 0);
    }

    public Televisore(String modello, int dimensione) {
        id = counter++;
        this.modello = modello;
        setDimensione(dimensione);
    }

    private void setDimensione(int dimensione) {
        if (dimensione < 0) {
            this.dimensione = 0;
        }
        else {
            this.dimensione = dimensione;
        }
    }

    @Override
    public String toString() {
        return id + " " + modello + " " + dimensione + "\"";
    }

    @Override
    public void spegni() {
        Scanner s = new Scanner(System.in);

        System.out.println("Dopo quanti minuti? ");
        int tempoSpegnimento = s.nextInt();

    }
}