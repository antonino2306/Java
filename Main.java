package prg.es08;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]) {
		
		ArrayList<Veicolo> veicoli = new ArrayList<>();
		
		veicoli.add(new Bicicletta("bmx", 10, 0, 0));
		veicoli.add(new Automobile("EL926KR", 0, 0, 70, 80, 20, 20));
		veicoli.add(new Ciclomotore(193124, 0, 0, 30, 54, 10, 10));
		
		
		System.out.println("Posizioni iniziali");
		for (Veicolo v: veicoli) {
			System.out.println(v.toString());
		}
		System.out.println();
		
		
		for (int i = 1; i < 10; i++) {
			
			for (Veicolo v: veicoli) {
				v.muovi(i);
				System.out.println(v.toString());
				
			}
			System.out.println("-----------------------------");
			
		}
		
	}
}