package prg.lib;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;


public class Contenitore {
	
	private List<Appartamento> l = new ArrayList<>();
	
	public Contenitore(Iterator<Appartamento> i) {
		while (i.hasNext()) {
			l.add(i.next());
		}
	}
	
	public Contenitore() {
		
	}
	
	public void aggiungiAppartamento(Appartamento a) {
		l.add(a);
	}
	
	public void accendiLuce(String descrizione, int id) {
		for (Appartamento a: l) {
			if (a.getDescrizione().toLowerCase().equals(descrizione.toLowerCase())) {
				a.accendi(id);
			}
		}
	}
	
	public void spegniLuce(String descrizione, int id) {
		for (Appartamento a: l) {
			if (a.getDescrizione().toLowerCase().equals(descrizione.toLowerCase())) {
				a.spegni(id);
			} 
		}
	}
	
	@Override
	public String toString() {
		return Arrays.toString(l.toArray(new Appartamento[0]));
	}
	
	
	
}