package lib;

public abstract class Shape implements Drawable, Scalable{
	
	private String color;
	private boolean filled;
	private int id;
		
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
	
	public int getId() {
		return id;
	}
	// Non è necessario definire i medoti delle interfacce perché
	// Shape è una classe astratta

}