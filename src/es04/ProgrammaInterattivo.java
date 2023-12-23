package prg.es04.exe;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ProgrammaInterattivo {
	public static void main(String args[]) {
		
		List<String> nonStampare = Arrays.asList("alpha", "beta", "gamma", "delta", "epsilon", "kappa", "lambda", "sigma", "omega");
		
		Scanner scanner = new Scanner(System.in);
		
		String stringa = "";
		System.out.println("Digita qualcosa e batti enter, oppure " +
		"scrivi \"fine\" per terminare il programma");
		
		while(!(stringa = scanner.next()).equals("fine")) {
			if (!nonStampare.contains(stringa)) {
				System.out.println("Hai digitato " + stringa.toUpperCase() + "!");
			}
			
		}
		System.out.println("Fine programma!");
	}
}