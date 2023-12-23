package prg.es06;

public class Square extends Rectangle {
	
	public Square() {
		
	}
	
	public Square(double lato, String color, boolean isFilled) {
		super(lato, lato, color, isFilled);
	}
	
	public void setLato(double lato) {
		this.setWidth(lato);
		this.setLength(lato);
	}
	
	public double getLato() {
		return getWidth();
	}
	
	// Perimetro e area si calcolano come per il rettangolo
	public String toString() {
		return "Width = " + getWidth() + "\nColor =" + getColor() + "\nIsFilled = " + getFill();
	}
}