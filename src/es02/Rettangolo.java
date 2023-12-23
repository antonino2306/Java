/** La classe descrive un rettangolo con attributi base e altezza
	e 2 metodi che calcolano rispettivamente perimetro e area.
	Il costruttore prende in input base e altezza */

package prg.es02;

public class Rettangolo {
	public int base;
	public int altezza;
	
	public Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public int perimetro() {
		return (base + altezza)*2;
	}
	
	public int area() {
		return base * altezza;
	}
}