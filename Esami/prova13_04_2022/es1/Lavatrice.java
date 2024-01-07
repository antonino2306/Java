package prg.lib;

public class Lavatrice {

    private String marca;
    private String modello;
    private int capacitaCarico;

    public Lavatrice() {
        this("-", "-", 0);
    }

    public Lavatrice(String marca, String modello, int capacitaCarico) {

        this.marca = marca;
        this.modello = modello;
        setCapacitaCarico(capacitaCarico);

    }

    private void setCapacitaCarico(int capacitaCarico) {
        if (capacitaCarico < 0) {
            throw new CapacitaErrataException("La capacità inserita non è accetabile");
        }

        this.capacitaCarico = capacitaCarico;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public int getCapacitaCarico() {
        return capacitaCarico;
    }

    @Override
    public String toString() {
        return marca + " " + modello + " " + capacitaCarico;
    }

}