package prg.lib;
import java.util.List;
import java.util.ArrayList;


public class Appartamento implements Illuminazione {
	
	private String descrizione;
	
	private List<Boolean> stato = new ArrayList<>();
	
	private int numeroStanze;
	
	
	public Appartamento() {
		this("", 0);
	}
	
	public Appartamento(int numeroStanze) {
		this("", numeroStanze);
	}
	
	public Appartamento(String descrizione, int numeroStanze) {
	
		this.descrizione = descrizione;
		setNumeroStanze(numeroStanze);
		initStato();
	}
	
	private void initStato() {
		
		for (int i = 0; i < numeroStanze; i++) {
			stato.add(false);
		}
		
	}
	
	private void setNumeroStanze(int numeroStanze) {
		if (numeroStanze < 0) {
			this.numeroStanze = 0;
		}
		else {
			this.numeroStanze = numeroStanze;
		}
		
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public int getNumeroStanze() {
		return numeroStanze;
	}
	
	public List<Boolean> getStato() {
		return stato;
	}
	
	@Override
	public void accendi(int id) {
		if (id < 0 || id >= numeroStanze) {
			throw new IndexOutOfBoundsException();
		}
		
		if (stato.get(id)) {
			System.out.println("Luce stanza " + id + " già accesa");
		}
		else {
			stato.set(id, true);
		
			System.out.println("Luce stanza " + id + " accesa");	
		}
		
		
	}
	
	@Override
	public void spegni(int id) {
		if (id < 0 || id >= numeroStanze) {
			throw new IndexOutOfBoundsException();
		}
		
		if (stato.get(id)) {
			stato.set(id, false);
			System.out.println("Luce stanza " + id + " spenta");
		}
		else {
			System.out.println("Luce stanza " + id + " già spenta");
		}
	}
	
	@Override
	public void spegniTutto() {
		
		for (int i = 0; i < numeroStanze; i++) {
			stato.set(i, false);
		}
		
	}
	
	@Override
	public void accendiTutto() {
		
		for (int i = 0; i < numeroStanze; i++) {
			stato.set(i, true);
		}
		
	}
	
	@Override
	public String toString() {
		return descrizione + " " + numeroStanze;
	}
	
}