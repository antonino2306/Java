package lib;

public class Rectangle extends Shape {
	private double width;
	private double length;
	
	public Rectangle() {
		this(-1, 1.0, 2.0);
	}
	
	public Rectangle(double width, double length) {
		this(width, length, "black", true);
	}
	
	public Rectangle(int id, double width, double length) {
		this(id, width, length, "black", true);
	}
	
	public Rectangle(int id, double width, double length, String color, boolean filled) {
		super(id, color, filled);
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	
	public void draw() {
		System.out.println(toString());
	}
	
	public void scale(double factor) {
		this.width *= factor;
		this.length *= factor;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
	
	public String toString() {
		return "Rectangle (" + getId() + ") " + "width: " + this.width + " length: " + this.length + " color: " + getColor() + " filled: " + getFill();
	}
	
	
}