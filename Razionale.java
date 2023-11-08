package prg.es05;

public class Razionale {
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
	
	public void setDenominatore(int denominatore) {
		if (denominatore != 0) {
			this.denominatore = denominatore;
		}
		else {
			System.out.println("Il denominatore non può essere 0");
		}
	}
	
	public int getNumeratore() {
		return numeratore;
	}
	
	public int getDenominatore() {
		return denominatore;
	}
	
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
	
	public static Razionale dividi(Razionale num1, Razionale num2) {
		
		Razionale quoziente = new Razionale(num1.getNumeratore() * num2.getDenominatore(), num1.getDenominatore() * num2.getNumeratore());

		return quoziente;
	}
}