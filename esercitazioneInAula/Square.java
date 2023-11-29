package lib;

public class Square extends Rectangle {
	
	public Square() {
		this(-1, 1);
	}
	
	public Square(double edge) {
		this(edge, "Black", true);
	}
	
	public Square(int id, double edge) {
		this(id, edge, "black", true);
	}
	
	public Square (int id, double edge, String color, boolean filled) {
		super(id, edge, edge, color, filled);
	}	
	
	public Square(double edge, String color, boolean filled) {
		super(edge, edge, color, filled);
	}
	
	public void draw() {
		System.out.println(toString());
	}
	
	// Non è necessario reimplementare scale, va bene quello della superclasse
	
	public String toString() {
		return "Square (" + getId() + ") " + "edge: " + getWidth() + " color: " + getColor() + " filled" + getFill();
	}
	
}