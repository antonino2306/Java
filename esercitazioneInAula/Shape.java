package lib;

public abstract class Shape implements Drawable, Scalable{
	
	private String color;
	private boolean filled;
	private int id;
	private static int counter = 0;
		
	public Shape() {
		this(-1, "black", true);
	}

	public Shape(int id) {
		this(id, "black", true);
	}

	public Shape(int id, String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		this.id = id;
	}
	
	public Shape(String color, boolean filled) {
		this.id = counter;
		counter++;
		
		this.color = color;
		this.filled = filled;
	}
	
	public int getId() {
		return id;
	}
	
	public String getColor() {
		return color;
	}
	
	public boolean getFill() {
		return filled;
	}
	// Non è necessario definire i medoti delle interfacce perché
	// Shape è una classe astratta

}