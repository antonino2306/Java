package prg.es10;

public class TestMazzo {
	public static void main(String args[]) {
		
		Mazzo m = new Mazzo();
		
		m.mescola();
		
		System.out.println(m);
		
		
		Carta pescata = m.pesca();
		System.out.println("Carta pescata: " + pescata);
		
		m.ordina();
		
		System.out.println(m);
		
		
		try {
			m.inserisciCarta(pescata);
		}
		catch (CartaGiaNelMazzoException | NullPointerException exc) {
			System.out.println(exc);
		}
		finally {
			System.out.println(m);
		}
		
		
	}
}