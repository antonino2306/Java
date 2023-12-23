package prg;

import prg.lib.*;

public class Main {
	public static void main(String args[]) {
		
		Contenitore gestoreLuci = new Contenitore();
	
		gestoreLuci.aggiungiAppartamento(new Appartamento("casa", 4));
		gestoreLuci.aggiungiAppartamento(new Ufficio("ufficio_personale", 2, false));
		gestoreLuci.aggiungiAppartamento(new Appartamento("casa_2", 5));
		
		try {
			
			gestoreLuci.accendiLuce("casa", 1);
			gestoreLuci.accendiLuce("casa" , 3);
			
			System.out.println(gestoreLuci);
			
			// gestoreLuci.spegniLuce("ufficio_personale", 5);
			
		} catch (IndexOutOfBoundsException exc) {
			System.out.println("Id non presente nella lista");
		}
		
		
	}
}