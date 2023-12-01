package prg.exe;

import prg.es07.Abbonato;
import prg.es07.AbbonatoPremium;
import java.util.ArrayList;

public class TestAbbonati {
	
	// private static ArrayList<Abbonato> listaAbbonati = new ArrayList<Abbonato>();
	// private	static ArrayList<AbbonatoPremium> listaAbbonatiPremium = new ArrayList<AbbonatoPremium>();
	
	
	private static void stampaDatiAbbonato(Abbonato a) {
		System.out.println(a.toString());
	} 
	
	// private static void stampaDatiAbbonatoPremium(AbbonatoPremium a) {
		// System.out.println(a.toString());
	// }
	
	public static void main(String args[]) {
		
		ArrayList<Abbonato> listaAbbonati = new ArrayList<>();
		
		for (int i = 1; i < 10; i++) {
			listaAbbonati.add(new Abbonato("", "", i*2, i*10));
			listaAbbonati.add(new AbbonatoPremium("", "", i*3, i*10));
		}
		
		System.out.println("Lista degli abbonati");
		for (Abbonato el: listaAbbonati) {
			stampaDatiAbbonato(el);
		}
		
		// System.out.println("Lista degli abbonati premium");
		// for (AbbonatoPremium el: listaAbbonatiPremium) {
			// stampaDatiAbbonatoPremium(el);
		// }
		
		for (Abbonato a: listaAbbonati) {
			
			if (a instanceof AbbonatoPremium) {
				System.out.println("L'abbonato premium " + listaAbbonati.indexOf(a) + " ha speso per il suo acquisto: " + a.acquista(200));
			}
			else {
				System.out.println("L'abbonato " + listaAbbonati.indexOf(a) + " ha speso per il suo acquisto: " + a.acquista(200));
			}
		}
		// System.out.println("L'abbonato 2 della lista ha speso per il suo acquisto: " + listaAbbonati.get(1).acquista(20));
		// System.out.println("L'abbonato 2 della lista abbonati ha speso per il suo acquisto: " + listaAbbonatiPremium.get(1).acquista(200));
	}
	
}