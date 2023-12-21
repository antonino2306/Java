package prg.es10;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.InputMismatchException;

public class RegistroVoti {
	public static void main(String args[]) {
		
		SortedMap<String, String> registro = new TreeMap<>();
		Scanner scanner = new Scanner(System.in);
		
		int input = 0;
		String nome, voto;
		
		do {
			
			stampaMenu();
			
			try {
				input = scanner.nextInt();
			}
			catch (InputMismatchException exc) {
				System.out.println("L'input deve esser intero");
				input = 0;
			}
			finally {
				
				switch(input) {
					
					case 1:
						
						System.out.print("Inserisci nome: ");
						nome = scanner.next();
						
						System.out.print("Inserisci voto: ");
						voto = scanner.next();
					
						registro.put(nome, voto);
						
					break;
					
					case 2:
						System.out.print("Inserisci il nome dello studente da rimuovere: ");
						nome = scanner.next();
						registro.remove(nome);
					break;
					
					case 3: 
						System.out.print("Inserire il nome dello studente di cui vuoi cambiare il voto: ");
						nome = scanner.next();
						System.out.print("Inserisci il nuovo voto: ");
						voto = scanner.next();
						
						registro.replace(nome, voto);
					break;
					
					case 4:
						System.out.println(registro);
					break;
					default: break;
					
				}
				
			}
			
			
			
			
		} while (input != 0);
		
	}
	
	
	public static void stampaMenu() {
		System.out.println("1. Inserisci nuovo studente");
		System.out.println("2. Elimina studente");
		System.out.println("3. Modifica voto di uno studente");
		System.out.println("4. Stampa tutti i voti");
		System.out.print("> ");
	}
}