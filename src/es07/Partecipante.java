package prg.es07;

public class Partecipante {
	private static int contatorePartecipanti = 0;
	private int id;
	private int numeroVoti;
	
	public Partecipante() {
		this.id = contatorePartecipanti;
		
		contatorePartecipanti++;
	}
	
	public void aggiungiVoto() {
		numeroVoti++;
	}
	
	public int getId() {
		return id;
	}
	
	public int getNumeroVoti() {
		return numeroVoti;
	}
	
}