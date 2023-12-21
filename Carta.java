package prg.es10;
import java.util.List;
import java.util.Arrays;

public class Carta implements Comparable<Carta> {
	
	private int valore;
	private String seme;
	private final List<Integer> insiemeValori = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); 
	private final List<String> insiemeSemi = Arrays.asList("denari", "coppe", "bastoni", "spade");
	
	public Carta(int valore, String seme) {
		setValore(valore);
		setSeme(seme);
	}
	
	private void setValore(int valore) {
		if (insiemeValori.contains(valore)) {
			this.valore = valore;
		}
		else {
			this.valore = 0;
		}
	}
	
	private void setSeme(String seme) {
		if (insiemeSemi.contains(seme.toLowerCase())) {
			this.seme = seme.toLowerCase();
		}
		else {
			this.seme = insiemeSemi.get(0);
		}
	}
	
	public int getValore() {
		return valore;
	}
	
	public String getSeme() {
		return seme;
	} 
	
	@Override
	// Confronto basato sul valore delle carte
	public int compareTo(Carta c) {
		if (this.equals(c)) {
			return 0;
		}
		
		if (valore > c.getValore()) {
			return 1;
		}
		
		return -1;
	}
	
	
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		
		if (o instanceof Carta c) {
			if (valore == c.getValore() && seme.equals(c.getSeme())) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return valore + " di " + seme;
	}
}