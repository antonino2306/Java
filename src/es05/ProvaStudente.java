package prg.es05.exe;
import prg.es05.Studente;
import prg.es05.Date;
import java.util.Scanner;

public class ProvaStudente {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		Studente s1 = new Studente(scanner.next(), scanner.next(), 
								new Date(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()), scanner.nextLong());
		Studente s2 = new Studente(scanner.next(), scanner.next(),
								new Date(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()), scanner.nextLong());
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
	
}

