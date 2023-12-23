package prg.es07;
import prg.es05.Date;

public class StudenteTriennale extends StudenteEs7 {
	public static final int CFU_DA_CONSEGUIRE = 180;
	private String scuolaSuperiore;
	
	public StudenteTriennale() {
		
	}
	
	public StudenteTriennale(String nome, String congome, int eta, long matricola, String corsoDiLaurea,
							String scuolaSuperiore) {
		
		super(nome, congome, eta, matricola, corsoDiLaurea);
		this.scuolaSuperiore = scuolaSuperiore;
	}
	
	public StudenteTriennale(String nome, String congome, int eta, long matricola, String corsoDiLaurea,
		String scuolaSuperiore, Date dataIscrizione, double contributoIscrizione) {
		
		super(nome, congome, eta, dataIscrizione, matricola, corsoDiLaurea, contributoIscrizione);
		this.scuolaSuperiore = scuolaSuperiore;
	}
	
	public void setScuolaSuperiore(String scuolaSuperiore) {
		this.scuolaSuperiore = scuolaSuperiore;
	}
	
	public String toString() {
		return super.toString() + " scuolaSuperiore: " + scuolaSuperiore;
	}
}