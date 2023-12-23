package prg.es08;

public class Ciclomotore extends VeicoloAMotore {
	
	private long numeroTelaio;
	
	public Ciclomotore() {
		this(0,0,0,0,0,0,0);
	}
	
	public Ciclomotore(long numeroTelaio, double pX, double pY, double vX, double vY, double aX, double aY) {
		this.numeroTelaio = numeroTelaio;
		
		setPosizioneIniziale(pX, pY);
		setVelocitaIniziale(vX, vY);
		setAccelerazione(aX, aY);
		setPosizione(pX, pY);
		
	}
	
	@Override
	public String toString() {
		return numeroTelaio + " " + super.toString();
	}
}