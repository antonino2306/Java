package prg.lib;

public class Prodotto {
    private static int contatore = 0;
    private int id;
    private String nome;
    private int quantita;


    public Prodotto() {

        this("", 0);

    }

    public Prodotto(String nome, int quantita) {
        id = contatore++;
        this.nome = nome;
        setQuantita(quantita);

    }

    public void setQuantita(int quantita) {

        if (quantita < 0) {
            this.quantita = 0;
        }
        else {
            this.quantita = quantita;
        }

    }

    public int getQuantita() {
        return quantita;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return id + " " + nome + ": " + quantita;
    }


}