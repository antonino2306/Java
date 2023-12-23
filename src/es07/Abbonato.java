package prg.es07;
import prg.es03.Persona;

public class Abbonato extends Persona {
	private double percentualeSconto;
	
	public Abbonato() {
		
	}
	
	public Abbonato(String nome, String cognome, int eta, int percentualeSconto) {
		super(nome, cognome, eta);
		setPercentualeSconto(percentualeSconto);
	}
	
	private void setPercentualeSconto(int percentualeSconto) {
		
		if (percentualeSconto >= 0) {
			this.percentualeSconto = (double)percentualeSconto / 100;
		}
		else {
			this.percentualeSconto = 0;
		}
		
	}
	
	public double getPercentualeSconto() {
		return percentualeSconto;
	}
	
	public double acquista(double importo) {
		return importo - importo * percentualeSconto;
	}
	
	public String toString() {
		return super.toString() + " percentualeSconto: " + this.percentualeSconto*100 + "%";
	}
}