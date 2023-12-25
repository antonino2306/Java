package prg;

import prg.lib.*;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String args[]) {
		

		List<Appartamento> lista = Arrays.asList(new Appartamento("casa", 4), new Ufficio("ufficio_personale", 2, false), new Appartamento("casa_campagna", 5), new Ufficio("studio", 3, false));

		Contenitore gestoreLuci = new Contenitore(lista.iterator());
		
		try {
			
			System.out.println(gestoreLuci);

			gestoreLuci.accendiLuce("casa", 1);
			gestoreLuci.accendiLuce("casa" , 3);
			gestoreLuci.accendiLuce("ufficio_personale", -1);
			
			System.out.println(gestoreLuci);
			
			
			
		} 
		catch (IndexOutOfBoundsException exc) {
			System.out.println("Id non presente nella lista");
		}
		catch (NessunaCorrispondenzaException exc) {
			System.out.println(exc);
		}
		

	}
}