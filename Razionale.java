package prg.es05;

public class Razionale implements Comparable<Razionale> {
	private int numeratore;
	private int denominatore;
	
	public Razionale() {
		this(0,1);
	}
	
	public Razionale(int numeratore, int denominatore) {
		this.setNumeratore(numeratore);
		this.setDenominatore(denominatore);
	}
	
	public void setNumeratore(int numeratore) {
		this.numeratore = numeratore;
	}
	
	public void setDenominatore(int denominatore) throws IllegalArgumentException{
		if (denominatore == 0) {
			throw new IllegalArgumentException("Il denominatore non può essere zero");
		}
		else if (denominatore < 0) {
			
			this.denominatore = -1*denominatore;
			this.numeratore *= -1;
		}
		else {
			this.denominatore = denominatore;
		}
	}
	
	public int getNumeratore() {
		return numeratore;
	}
	
	public int getDenominatore() {
		return denominatore;
	}
	
	@Override
	public String toString() {
		return this.numeratore + "/" + this.denominatore;
	}
	
	public static Razionale somma(Razionale num1, Razionale num2) {
	
		Razionale somma = new Razionale();
		
		int denominatoreSomma = num1.getDenominatore() * num2.getDenominatore();
		int numeratoreSomma = (denominatoreSomma / num1.getDenominatore() * num1.getNumeratore()) + (denominatoreSomma / num2.getDenominatore() * num2.getNumeratore());
		
		somma.setDenominatore(denominatoreSomma);
		somma.setNumeratore(numeratoreSomma);
		
		return somma;
	}
	
	public static Razionale moltiplica(Razionale num1, Razionale num2) {
		
		Razionale prodotto = new Razionale(num1.getNumeratore()*num2.getNumeratore(), num1.getDenominatore() * num2.getDenominatore());
		
		return prodotto;
	}
	
	public static Razionale dividi(Razionale num1, Razionale num2) throws ArithmeticException{
		
		if (num2.getDenominatore() == 0) {
			throw new ArithmeticException("Impossibile effettuare divisione per 0");
		}
		Razionale quoziente = new Razionale(num1.getNumeratore() * num2.getDenominatore(), num1.getDenominatore() * num2.getNumeratore());

		return quoziente;
	}
	
	@Override
	public boolean equals(Object raz) {
		
		if (raz == null) {
			return false;
		}
		
		if (raz instanceof Razionale r) {
			if ((numeratore * r.getDenominatore()) == (denominatore * r.getNumeratore())) {
				return true;
			}	
		}
		
		return false;
	}
	
	@Override
	public int compareTo(Razionale r) {
		// Uso la regola del prodotto in croce: a/b > c/d se a*d > b*c
		
		if ((numeratore * r.getDenominatore()) > (denominatore * r.getNumeratore())) {
			return 1;
		}
		else if ((numeratore * r.getDenominatore()) < (denominatore * r.getNumeratore())) {
			return -1;
		}
		else {
			return 0;
		}
		
		
	}
}