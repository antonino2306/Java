package prg.es05.exe;
import prg.es05.Razionale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import prg.es09.ComparatorRazionaliNumeratore;
import prg.es09.ComparatorRazionaliDenominatore;

public class ProvaRazionale {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Razionale> lista = new ArrayList<>();
		
		try {
			
			for (int i = 0; i < 3; i++) {
				System.out.print("Inserisci numeratore: ");
				int n = scanner.nextInt();
				
				System.out.print("Inserisci denominatore: ");
				int d = scanner.nextInt();
				
				lista.add(new Razionale(n, d));
			}
			// Razionale num1 = new Razionale(scanner.nextInt(), scanner.nextInt());
			// Razionale num2 = new Razionale(scanner.nextInt(), scanner.nextInt());
			
			// System.out.println(num1.toString());
			// System.out.println(num2.toString());
		
		
			// System.out.println(num1.compareTo(num2));
		
			// System.out.println("Somma: " + Razionale.somma(num1, num2));
			// System.out.println("Prodotto: " + Razionale.moltiplica(num1, num2));
			// System.out.println("Rapporto: " + Razionale.dividi(num1, num2));
		}
		catch (ArithmeticException | IllegalArgumentException exc) {
			System.out.println(exc);
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
		System.out.println("Sort in base all'ordinamento naturale");
		Collections.sort(lista);
		System.out.println(Arrays.toString(lista.toArray(new Razionale[0])));
		
	
		System.out.println("Sort in base ai numeratori");
		Collections.sort(lista, new ComparatorRazionaliNumeratore());
		System.out.println(Arrays.toString(lista.toArray(new Razionale[0])));
		
		System.out.println("Sort in base ai denominatori");
		Collections.sort(lista, new ComparatorRazionaliDenominatore());
		System.out.println(Arrays.toString(lista.toArray(new Razionale[0])));
		
		
	}
}