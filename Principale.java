package prg.exe;
import prg.es03.Persona;
import java.util.Scanner;

public class Principale {
    public static void main(String args[]) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

		Scanner scanner = new Scanner(System.in);
		
		persona1.setNome(scanner.nextLine());
		persona1.setCognome(scanner.nextLine());
		persona1.setEta(scanner.nextInt());
		
		persona2.setNome(scanner.nextLine());
		persona2.setCognome(scanner.nextLine());
		
		// Rimuove un ritorno a capo rimasto nel flusso di input
		scanner.next();
		persona2.setEta(scanner.nextInt());
		
		
        if (persona1.equals(persona2)) {
            System.out.println("Uguali");
        }
		else {
			System.out.println("Diversi");
		}

    }    
}
