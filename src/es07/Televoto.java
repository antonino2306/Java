package prg.es07.exe;
import prg.es07.Votante;
import prg.es07.Gara;
import prg.es07.Partecipante;
import java.util.ArrayList;
import java.util.Scanner;

public class Televoto {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		Gara garaCanora = new Gara();
		
		ArrayList<Votante> listaVotanti = new ArrayList<Votante>();
		ArrayList<Partecipante> listaPartecipanti = garaCanora.getListaPartecipanti();
		
		
		
		for (Partecipante p: listaPartecipanti) {
			System.out.println(p.getId());
		}
		
		int input;
		
		do {
			
			stampaMenu();
			input = scanner.nextInt();
			
			switch(input) {
				case 1: 
					System.out.println("Inserisci numero di telefono");
					String telefono = scanner.next();
					
					System.out.println("Inserisci l'id del cantante da votare");
					int idDaVotare = scanner.nextInt();
					
					
					boolean votato = false;
					
					for (int i = 0; i < listaVotanti.size() && !votato; i++) {
						if (listaVotanti.get(i).getTelefono().equals(telefono)) {
								
							listaVotanti.get(i).vota(listaPartecipanti, idDaVotare);
							votato = true;
						}
					}
					
					if (!votato) {
						listaVotanti.add(new Votante(telefono));
						
						listaVotanti.get(listaVotanti.size()-1).vota(listaPartecipanti, idDaVotare);
					}
					
				break;
				
				case 2:
					int totale = 0;
					for (Partecipante p: listaPartecipanti) {
						totale += p.getNumeroVoti();
					}
					System.out.println(totale);
				break;
				
				case 3:
					for (Partecipante p: listaPartecipanti) {
						System.out.println(p.getId() + " " + p.getNumeroVoti());
					}
				break;
			}
			
			
			
		} while(input != 0);
		
	}
	
	private static void stampaMenu() {
		System.out.println("1. per aggiungere un voto");
		System.out.println("2. per stampare il totale dei voti attuale");
		System.out.println("3. per stampare i voti ricevuti da ciascun cantante");
		System.out.println("0. per uscire");
		
	}
}