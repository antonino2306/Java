package prg.es07;
import java.util.ArrayList;


public class Gara {
	
	private int numeroPartecipanti;
	private ArrayList<Partecipante> listaPartecipanti;
	
	
	public Gara() {
		this.numeroPartecipanti = 15;
		setListaPartecipanti();
	}
	
	public Gara(int numeroPartecipanti) {
		this.numeroPartecipanti = numeroPartecipanti;
		setListaPartecipanti();
	}
	
	private void setListaPartecipanti() {
		
		listaPartecipanti = new ArrayList<Partecipante>();
		
		for (int i = 0; i < numeroPartecipanti; i++) {
			listaPartecipanti.add(new Partecipante());
		}
		
	}
	
	
	public ArrayList<Partecipante> getListaPartecipanti() {
		return listaPartecipanti;
	}
	
	
	
	
	
}