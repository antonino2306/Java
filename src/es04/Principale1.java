package prg.es04.exe;
import prg.es03.Persona;
import java.util.ArrayList;

public class Principale1 {
	public static void main(String args[]) {
		ArrayList<Persona> miaLista = new ArrayList<>();
		
		Persona p1 = new Persona("Antonino", "Randazzo", 20);
		Persona p2 = new Persona("Giuseppe", "Bonafede", 20);
		Persona p3 = new Persona("Nicolo", "Multato", 53);
		
		miaLista.add(p1);
		miaLista.add(p2);
		miaLista.add(p3);
		
		System.out.println("La lista ha " + miaLista.size() + " elementi");
		
		System.out.println(miaLista.get(2));
		miaLista.remove(2);
		
		for (int i = 0; i < miaLista.size(); i++) {
			System.out.println(miaLista.get(i));
		}
		
		for (Persona el : miaLista) {
			System.out.println(el);
		}
		
		miaLista.clear();
		
		System.out.println("La lista ha " + miaLista.size() + " elementi");
		
	}
}