package lib.utils;

public class Proiettore {

    private String aula;
    private String modello;

    // dimensione in pollici
    private int dimensione;
    private int oreDiAccensione;

    public Proiettore() {

    }

    public Proiettore(String aula, String modello, int dimensione, int oreDiAccensione) {

        this.aula = aula;
        this.modello = modello;

        setDimensione(dimensione);
        setOreDiAccensione(oreDiAccensione);
    }

    private void setDimensione(int dimensione) {

        if (dimensione < 0) {
            throw new InvalidNumberException("La dimensione deve essere > 0");
        }        

        this.dimensione = dimensione;

    }

    private void setOreDiAccensione(int oreDiAccensione) {

        if (oreDiAccensione < 0) {
            throw new InvalidNumberException("Il numero di ore non può essere un numero negativo");
        }

        this.oreDiAccensione = oreDiAccensione;

    }

    // Aggiunge le ore passate come parametro a quelle già salvate
    public void aggiornaOreDiAccensione(int ore) {
        oreDiAccensione += ore;
    }

    public void resetOreDiAccensione() {
        oreDiAccensione = 0;
    }


    @Override
    public String toString() {
        return "Aula: " + aula + " " + modello + " " + dimensione + "\"" + " ore di accensione: " + oreDiAccensione;
    }

}