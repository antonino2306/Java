package lib.utils;

public class Lavatrice extends Elettrodomestico {

    private String modello;
    
    // misurata in kg
    private int capacitaCarico;

    public Lavatrice(String modello, int capacitaCarico, String classeEnergetica, double prezzo) {

        super(classeEnergetica, prezzo);

        this.modello = modello;
        setCapacitaCarico(capacitaCarico);

    }

    private void setCapacitaCarico(int capacitaCarico) {

        this.capacitaCarico = Math.abs(capacitaCarico);

    }

    @Override
    public String toString() {

        return super.toString() + " " + modello + " capacità di carico: " + capacitaCarico + " kg";

    }

}