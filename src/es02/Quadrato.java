/** Classe con attributo lato, un costruttore che prende in input il lato e due metodi per perimetro e area*/
package prg.es02;

public class Quadrato {
	public int lato;
	
	public Quadrato(int l) {
		lato = l;
	}
	
	public int perimetro() {
		return 4*lato;
	}
	
	public int area() {
		return lato*lato;
	}
}