package prg.es09.exe;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class TestGestioneEccezioniScanner {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> lista = new ArrayList<>();
		
		int i = 0;
		
		do {
			
			try {
				lista.add(scanner.nextDouble());
				i++;
			}
			catch (InputMismatchException exc) {
				System.out.println("Inserisci un double, tipi di dato diversi non verranno accettati");
				scanner.next();
			}
			catch (IllegalStateException exc) {
				System.out.println("Scanner chiuso");
				break;
			}			
			catch (NoSuchElementException exc) {
				exc.printStackTrace();
			}
		} while (i < 5);
		
		Iterator<Double> iter = lista.iterator();
		
		
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		
	}
}