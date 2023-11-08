package prg.es03;

public class Persona {
    
    private String nome;
    private String cognome;
    private int eta;

    public Persona() {

    }

    public Persona(String nome, String cognome, int eta) {
        this.setNome(nome);
        this.setCognome(cognome);
		this.setEta(eta);
    }
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String getCognome() {
		return this.cognome;
	} 
	
	public void setEta(int eta) {
		if (eta < 0) {
			this.eta = 0;
		}
		else {
			this.eta = eta;
		}
	}
	
	public int getEta() {
		return this.eta;
	}

    public String toString() {
        return "Mi chiamo " + this.nome + " " + this.cognome + " e ho " + this.eta + " anni";
    }

    public void aumentaEta() {
        eta++;
    }

    public boolean equals(Persona p2) {
        if (this.nome.equals(p2.getNome()) && this.cognome.equals(p2.getCognome()) && this.eta == p2.getEta()) {
            return true;
        }
        return false;
    }

    
    
}
