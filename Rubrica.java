package prg.exe;
import prg.es03.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class Rubrica {
	public static void main(String args[]) {
		
		ArrayList<Persona> rubrica = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int inputUtente;
		
		
		do {
			stampaMenu();
			inputUtente = scanner.nextInt();
			
			switch (inputUtente) {
				case 1:
					String nomeTmp, cognomeTmp;
					int etaTmp;
					
					System.out.print("Inserisci nome: ");
					nomeTmp = scanner.next();
					
					System.out.print("Inserisci cognome: ");
					cognomeTmp = scanner.next();
					
					System.out.print("Inserisci eta: ");
					etaTmp = scanner.nextInt();
					
					Persona p = new Persona(nomeTmp, cognomeTmp, etaTmp);
					rubrica.add(p);
					
				break;
				case 2: 
					System.out.print("Inserisci il nome della persona da cercare: ");
					String strTmp = scanner.next();
					boolean trovato = false;
					
					for (Persona pTmp: rubrica) {
						if(pTmp.nome.equals(strTmp) && !trovato) {
							System.out.println("Il bro è nella lista");
							trovato = true;
						}
					}	
					
					if (!trovato) {
						System.out.println("Il bro non è nella lista");
					}
						
				break;
				
				case 3: 
					for (Persona pTmp: rubrica) {
						pTmp.toString_();
					}
				break;
				case 4: 
					rubrica.clear();
				break;
				case 0: break;
				default: break;
			}			
		} while (inputUtente != 0);
		
	}
	
	private static void stampaMenu() {
		System.out.println("Premi 1 per inserire una nuova persona");
		System.out.println("Premi 2 per cercare una persona nella lista in base al nome");
		System.out.println("Premi 3 per stampare l'intera lista");
		System.out.println("Premi 4 per cancellare la lista");
		System.out.println("Premi 0 per uscire");
		System.out.print("> ");
	}
}