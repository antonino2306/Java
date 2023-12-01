package prg.es08;

public class Automobile extends VeicoloAMotore {
	
	private String targa;
	
	public Automobile() {
		this("00000", 0, 0, 0, 0, 0, 0);
	}
	
	public Automobile(String targa, double pX, double pY, double vX, double vY, double aX, double aY) {
		this.targa = targa;
		
		setPosizioneIniziale(pX, pY);
		setVelocitaIniziale(vX, vY);
		setAccelerazione(aX, aY);
		setPosizione(pX, pY);
	}
	
	@Override
	public String toString() {
		return targa + " " + super.toString();
	}
}