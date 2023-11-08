package prg.exe;
import prg.es05.Razionale;
import java.util.Scanner;


public class ProvaRazionale {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		Razionale num1 = new Razionale(scanner.nextInt(), scanner.nextInt());
		Razionale num2 = new Razionale(scanner.nextInt(), scanner.nextInt());
		
		System.out.println("Somma: " + Razionale.somma(num1, num2));
		System.out.println("Prodotto: " + Razionale.moltiplica(num1, num2));
		System.out.println("Rapporto: " + Razionale.dividi(num1, num2));
		
	}
}