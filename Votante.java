package prg.es07;
import java.util.ArrayList;

public class Votante{
	private int VOTI_MAX = 5;
	private int numeroVoti;
	private String telefono;
	
	public Votante() {
		telefono = "";
	}
	
	public Votante(String telefono) {
		this.telefono = telefono;
		numeroVoti = 0;
	}
	
	public void vota(ArrayList<Partecipante> listaPartecipanti, int idDaVotare) {
		if (numeroVoti < 5) {
			
			for (int i = 0; i < listaPartecipanti.size(); i++) {
				if (listaPartecipanti.get(i).getId() == idDaVotare) {
					listaPartecipanti.get(i).aggiungiVoto();
					numeroVoti++;
				}
			}
		
		}
		else {
			System.out.println("Numero massimo raggiunto");
		}
	}
	
	public String getTelefono() {
		return telefono;
	}
	
}