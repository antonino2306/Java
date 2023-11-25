package prg.es07;
import prg.es05.Date;

public class StudenteMagistrale extends StudenteTriennale {
	public static final int CFU_DA_CONSEGUIRE = 120;
	
	private String corsoTriennale = getCorsoDiLaurea();
	
	public StudenteMagistrale() {
		
	}
	
	public StudenteMagistrale(String nome, String congome, int eta, long matricola, String corsoDiLaurea,
							String scuolaSuperiore) {
		
		super(nome, congome, eta, matricola, corsoDiLaurea, scuolaSuperiore);
		
	}
	
	public StudenteMagistrale(String nome, String congome, int eta, long matricola, String corsoDiLaurea,
		String scuolaSuperiore, Date dataIscrizione, double contributoIscrizione) {
		
		super(nome, congome, eta, matricola, corsoDiLaurea, scuolaSuperiore, dataIscrizione, contributoIscrizione);
	}
	
	public String getCorsoTriennale() {
		return corsoTriennale;
	}
	
}

