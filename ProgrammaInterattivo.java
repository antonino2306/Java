package prg.exe;
import java.util.Scanner;
import java.util.ArrayList;

public class ProgrammaInterattivo {
	public static void main(String args[]) {
		
		ArrayList<String> nonStampare = new ArrayList<>();
		nonStampare.add("alpha");
		nonStampare.add("beta");
		nonStampare.add("gamma");
		nonStampare.add("delta");
		nonStampare.add("epsilon");
		nonStampare.add("kappa");
		nonStampare.add("lambda");
		nonStampare.add("sigma");
		nonStampare.add("omega");
		
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