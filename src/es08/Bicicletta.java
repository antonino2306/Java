package prg.es08;

public class Bicicletta extends Veicolo {
	
	private String modello;
	
	public Bicicletta() {
		this("bmx", 0, 0, 0);
	}
	
	public Bicicletta(String modello, double vX, double pX, double pY) {
		this.modello = modello;
		setVelocitaIniziale(vX, 0);
		setPosizioneIniziale(pX, 0);
		setPosizione(pX, 0);
	}
	
	@Override
	public double[] muovi(double tempo) {
		double[] v = getVelocitaIniziale();
		double[] p = getPosizioneIniziale();
		
		double pX = p[0] + v[0] * tempo;
		double pY = 0;
		
		setPosizione(pX, pY);
		
		return getPosizioneIniziale();
	}
	
	@Override
	public String toString() {
		return modello + " " + super.toString();
	}
}