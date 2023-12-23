package prg.es08;

public abstract class VeicoloAMotore extends Veicolo {
	
	private String motore;
	private int cilindrata;
	
	
	@Override
	public double[] muovi(double tempo) {
		
		double[] p = getPosizioneIniziale();
		double[] v = getVelocitaIniziale();
		double[] a = getAccelerazione();
		
		double pX = p[0] + v[0]*tempo + a[0]*tempo*tempo;
		double pY = p[1] + v[1]*tempo + a[1]*tempo*tempo;
		
		setPosizione(pX, pY);
		
		return getPosizione();
	}
	
} 