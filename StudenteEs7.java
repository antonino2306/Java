package prg.es07;
import prg.es03.Persona;
import prg.es05.Date;

public class StudenteEs7 extends Persona {
	private Date dataIscrizione;
	private long matricola;
	private String corsoDiLaurea;
	private double contributoIscrizione;
	
	public StudenteEs7() {
		
	}
	
	public StudenteEs7(String nome, String cognome, int eta, long matricola, String corsoDiLaurea) {
		super(nome, cognome, eta);
		setMatricola(matricola);
		this.corsoDiLaurea = corsoDiLaurea;
	}
	
	public StudenteEs7(String nome, String cognome, int eta, Date dataIscrizione, long matricola,
		String corsoDiLaurea, double contributoIscrizione) {
	
		super(nome, cognome, eta);
		this.dataIscrizione = dataIscrizione;
		setMatricola(matricola);
		this.corsoDiLaurea = corsoDiLaurea;
		setContributoIscrizione(contributoIscrizione);
	}
	
	private void setMatricola(long matricola) {
		if (matricola >= Math.pow(10, 5)) {
			this.matricola = matricola;
		}
		else {
			System.out.println("Inserire una matricola valida");
		}
	}
	
	public long getMatricola() {
		return matricola;
	}
	
	private void setContributoIscrizione(double contributoIscrizione) {
		if (contributoIscrizione < 0) {
			this.contributoIscrizione = 0;
		}
		else {
			this.contributoIscrizione = contributoIscrizione;
		}
	}
	
	public double getContributoIscrizione() {
		return contributoIscrizione;
	}
	
	
	public String getCorsoDiLaurea() {
		return corsoDiLaurea;
	}
	
	public void setCorsoDiLaurea(String corsoDiLaurea) {
		this.corsoDiLaurea = corsoDiLaurea;
	}
	
	public String toString() {
		return super.toString() + " " + matricola + " " + corsoDiLaurea + " " + " data iscrizione: " + dataIscrizione.toString() + " contributoIscrizione: " + contributoIscrizione;
	}
}