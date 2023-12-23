package prg.es10;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Mazzo {
	
	private List<Carta> mazzo = new ArrayList<>();
	private final List<String> insiemeSemi = Arrays.asList("denari", "coppe", "bastoni", "spade");
	
	public Mazzo() {
		
		for (String seme: insiemeSemi) {
			
			for (int i = 1; i <= 10; i++) {
				mazzo.add(new Carta(i, seme));
			}
			
		}
		
	}
	
	
	@Override
	public String toString() {
		
		StringBuilder mazzoStampabile = new StringBuilder();
		
		for (Carta c: mazzo) {
			mazzoStampabile.append(c.toString() + "\n");
		}
		
		return mazzoStampabile.toString();
		
	}
	
	public void mescola() {
		Collections.shuffle(mazzo);
	}
	
	public void ordina() {
		Collections.sort(mazzo);
	}
	
	public Carta pesca() {
		int indiceCarta = (int)((Math.random() * 100) % 40);
		
		return mazzo.remove(indiceCarta);
	}
	
	public void inserisciCarta(Carta carta) throws NullPointerException, CartaGiaNelMazzoException{
		if (carta == null) {
			throw new NullPointerException();
		}
		
		if (carta instanceof Carta c) {
			if (!mazzo.contains(c)) {
				mazzo.add(c);
			}
			else {
				throw new CartaGiaNelMazzoException();
			}
		}
	}
}