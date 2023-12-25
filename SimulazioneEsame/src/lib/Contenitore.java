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
		// todo: aggiungere un id speciale che se inserito fa accendere tutte le luci

		boolean accensione = false;
		for (Appartamento a: l) {
			if (a.getDescrizione().toLowerCase().equals(descrizione.toLowerCase())) {
				
				if (id == -1) {
					a.accendiTutto();
					accensione = true;
				}
				else {
					a.accendi(id);
					accensione = true;
				}
				
			}
		}
		if (!accensione) {
			throw new NessunaCorrispondenzaException();
		}

		
	}
	
	public void spegniLuce(String descrizione, int id) {

		boolean spegnimento = false;
		for (Appartamento a: l) {
			
			if (a.getDescrizione().toLowerCase().equals(descrizione.toLowerCase())) {
			
				if (id == -1) {
					a.spegniTutto();
					spegnimento = true;
				}
			
				a.spegni(id);
				spegnimento = true;
			} 
		}
		if (!spegnimento) {
			throw new NessunaCorrispondenzaException();
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (Appartamento a: l) {
			sb.append(a.toString() + "\n");
		}

		return sb.toString();
	}

	
	
	
}