package prg.es07;
import prg.es03.Persona;
import prg.es05.Date;

public class Professore extends Persona {
	
	private String listaRuoli[] = {"Ricercatore", "Professore Associato", "Professore Ordinario"};
	
	private Date dataAssunzione;
	private String ruolo;
	private String dipartimento;
	private double stipendio;
	
	public Professore() {
	}
	
	public Professore(String nome, String cognome, int eta, Date dataAssunzione, String ruolo, String dipartimento, double stipendio) {
		super(nome, cognome, eta);
		this.dataAssunzione = dataAssunzione;
		setRuolo(ruolo);
		this.dipartimento = dipartimento;
		setStipendio(stipendio);
	}
	
	public void setRuolo(String ruolo) {
		for (String r: listaRuoli) {
			if (r.toLowerCase().equals(ruolo.toLowerCase())) {
				this.ruolo = r;
				break;
			}
		}
		this.ruolo = "Non definito";
		
	}
	
	public String getRuolo() {
		return ruolo;
	}
	
	public void setDipartimento(String dipartimento) {
		this.dipartimento = dipartimento;
	}
	
	public void setDataAssunzione(Date dataAssunzione) {
		this.dataAssunzione = dataAssunzione;
	}
	
	public Date getDataAssunzione() {
		return dataAssunzione;
	}
	
	public void setStipendio(double stipendio) {
		if (stipendio < 0) {
			this.stipendio = 0;
		}
		else {
			this.stipendio = stipendio;
		}
	}
	
	public double getStipendio() {
		return stipendio;
	}
	
	public String toString() {
		return super.toString() + " " + ruolo + " " + dipartimento + " data assunzione: " + dataAssunzione.toString();
	}
}