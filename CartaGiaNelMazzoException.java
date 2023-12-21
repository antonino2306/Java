package prg.es10;


public class CartaGiaNelMazzoException extends Exception {
	
	public CartaGiaNelMazzoException() {
		super("La carta è già presente nel mazzo");
	}
	
	@Override
	public String toString() {
		return getMessage();
	}
}