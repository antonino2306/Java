package prg.es03;

public class Persona implements Comparable<Persona>{
    
    private String nome;
    private String cognome;
    private int eta;

    public Persona() {
		this("", "", 0);
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
        return this.nome + " " + this.cognome + " " + this.eta + " anni";
    }

    public void aumentaEta() {
        eta++;
    }

    @Override
    public boolean equals(Object p2) {
        if (p2 == null) {
			return false;
		}

				
		if (this.hashCode() == p2.hashCode()) {
			return true;
		}

		return false;
    }

	@Override
	public int hashCode() {
	
		String hashString = nome.concat(cognome);
		hashString = hashString.concat(Integer.toString(eta));
	
		return hashString.hashCode();
	}
    
	@Override
	public int compareTo(Persona p) {
		
		return this.cognome.compareTo(p.getCognome());
	
	}
}
