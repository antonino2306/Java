package prg.es03;

public class Persona {
    
    public String nome;
    public String cognome;
    public int eta;

    public Persona() {

    }

    public Persona(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public void toString_() {
        System.out.println("Mi chiamo " + nome + " " + cognome + " e ho " + eta + " anni");
    }

    public void aumentaEta() {
        eta++;
    }

    public boolean equals(Persona p2) {
        if (this.nome.equals(p2.nome) && this.cognome.equals(p2.cognome) && this.eta == p2.eta) {
            return true;
        }
        return false;
    }

    
    
}
