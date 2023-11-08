package prg.es05;

public class Studente {
	private String nome;
	private String cognome;
	Date dataDiNascita;
	long matricola;
	
	public Studente() {
		this("Anonimo", "Anonimo", new Date(), 0);
	}
	
	public Studente(String nome, String cognome, Date dataDiNascita, long matricola) {
		this.setNome(nome);
		this.setCognome(cognome);
		this.setDataDiNascita(dataDiNascita);
		this.setMatricola(matricola);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public void setDataDiNascita(Date dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}
	
	public void setMatricola(long matricola) {
		if (matricola >= Math.pow(10, 5)) {
			this.matricola = matricola;
		}
		else {
			System.out.println("Inserire una matricola valida");
		}
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCognome() {
		return this.cognome;
	}
	
	public Date getDataDiNascita() {
		return this.dataDiNascita;
	}
	
	public long getMatricola() {
		return this.matricola;
	}
	
	
	public String toString() {
		return "0" + this.matricola + " " + this.nome + " " + this.cognome + " " + this.dataDiNascita.toString();
	}
	
	
}