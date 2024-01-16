package prg.util;

public abstract class Giocatore {

    private static int counter = 0;
    private int id;
    private String nome;
    private int numeroVittorie;

    public Giocatore() {
        id = ++counter;
        this.nome = "Giocatore" + id;
    }

    public Giocatore(String nome) {
        id = ++counter;
        this.nome = nome;
    }

    public void incrementaContatoreVittorie() {
        numeroVittorie++;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome + " - partite vinte: " + numeroVittorie;
    }

}