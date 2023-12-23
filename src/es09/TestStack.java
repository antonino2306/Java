package prg.es09.exe;
import prg.es09.StackGen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.InputMismatchException;

public class TestStack {
	public static void main(String args[]) {
		
		ArrayList<StackGen<String>> pile = new ArrayList<>();
		int input = 0;
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			stampaMenu();
			
			try {
				System.out.print("> ");
				input = scanner.nextInt();
			}
			catch (InputMismatchException exc) {
				System.out.println("Input in formato errato. Esco");
				input = 0;
			}
			finally {
				
				switch(input) {
					case 1:
						System.out.print("Inserisci la prima stringa: ");
						
						StackGen<String> stk = new StackGen<>(scanner.next());
						
						pile.add(stk);
						
						do {
							
							System.out.print("Vuoi inserire ancora elementi? premi 1 per si, 0 per no: ");
							if (scanner.nextInt() == 0) {
								break;
							}
							
							System.out.print("Nuova Stringa: ");
							stk.push(scanner.next());	
							
						} while (true);
						
						
						
					break;
					case 2: 
					
						for (StackGen<String> pila: pile) {
							System.out.println(pila);
						}
					
					break;
					case 3: 
					
						int index1, index2;
						System.out.println("Inserisci gli indici delle pile da confrontare:");
						try {
							System.out.print("Primo indice: ");
							index1 = scanner.nextInt();
							
							System.out.print("Secondo indice: ");
							index2 = scanner.nextInt();
							
							if (pile.get(index1).equals(pile.get(index2))) {
								System.out.println("Le due pile sono uguali");
							}
							else {
								System.out.println("Le due pile sono diverse");
							}
						}
						catch (InputMismatchException exc) {
							System.out.println("Gli indici devono essere valori interi");
						}
						catch (IndexOutOfBoundsException exc) {
							System.out.println("Gli indici devono essere > 0 e < " + pile.size());
						}
						catch (Exception exc) {
							exc.printStackTrace();
						}
						
					
					break;
					case 4: 
					
						try {
							System.out.print("Inserisci indice dello stack da modificare: ");
							int index3 = scanner.nextInt();
							String poppedString;
							
							StackGen<String> tmpStack = pile.get(index3);
							
							System.out.print("Premi 1 per effettuare un push, 2 per effettuare un pop: ");
							input = scanner.nextInt();
							if (input == 1) {
								System.out.print("Inserisci stringa: ");
								tmpStack.push(scanner.next());
							}
							else if (input == 2) {
								poppedString = tmpStack.pop();
							}
						}
						catch (InputMismatchException exc) {
							System.out.println("Gli indici devono essere valori interi");
						}
						catch (IndexOutOfBoundsException exc) {
							System.out.println("Gli indici devono essere > 0 e < " + pile.size());
						}
						catch (Exception exc) {
							exc.printStackTrace();
						}
						
					break;
					default: break;
				}
			}
			
			
			
			
		} while (input != 0);
		
		
		
	}
	
	public static void stampaMenu() {
		System.out.println("1. Crea nuovo stack");
		System.out.println("2. Stampa tutti gli stack");
		System.out.println("3. Confronta Stack");
		System.out.println("4. Modifica Stack");
		System.out.println("0. Esci");
	}
}