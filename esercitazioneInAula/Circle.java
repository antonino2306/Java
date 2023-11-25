package lib;

public class Circle extends Shape {
	private double radius;
	
	public Circle() {
		this(-1, 1.0);
	}
	
	public Circle(int id, double radius) {
		this(id, radius, "black", true);
	}
	
	public Circle(int id, double radius, String color, boolean filled) {
		super(id, color, filled);
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println(toString());
	}
	
	public void scale(double factor) {
		this.radius *= factor;
	}
	
	public String toString() {
		return "Circle (" + getId() + ")" + " radius: " + this.radius;
	}
}