package lib.utils;
import java.util.Arrays;
import java.util.List;

public abstract class Dispositivo implements OnOff {

    private static int counter = 0;
    private int id;
    private String marca, modello, stato;
    private List<String> statiPossibili = Arrays.asList("acceso", "spento");


    public Dispositivo() {

    }

    public Dispositivo(String marca, String modello, String stato) {

        id = counter++;

        this.marca = marca;
        this.modello = modello;

        setStato(stato);

    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {

        if (statiPossibili.contains(stato.toLowerCase())) {
            this.stato = stato;
        }
        else {
            this.stato = "spento";
        }

    }

    @Override
    public void accendi() {

        this.stato = "acceso";

    }

    @Override 
    public String toString() {
        return id + " " + marca + " " + modello + " " + stato;
    }

}