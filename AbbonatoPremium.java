package prg.es07;

public class AbbonatoPremium extends Abbonato {
	private static final int BONUS = 5;
	private static final int SPESA_COMPLESSIVA = 100;
	
	public AbbonatoPremium() {
		
	}
	
	public AbbonatoPremium(String nome, String cognome, int eta, int percentualeSconto) {
		super(nome, cognome, eta, percentualeSconto);
	}
	
	public double acquista(double importo) {
		
		double prezzoScontato = importo - importo * getPercentualeSconto();
		
		if (importo >= 100) {
			
			prezzoScontato -= BONUS*importo/100;
			
		}
		
		return prezzoScontato;
		
	}
	
	public String toString() {
		return super.toString();
	}
	
	
}