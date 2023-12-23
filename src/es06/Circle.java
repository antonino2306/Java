package prg.es06;

public class Circle extends Shape {
	private double radius;
	
	public Circle() {
		
	}
	
	public Circle(double radius, String color, boolean isFilled) {
		super(color, isFilled);
		this.setRadius(radius);
	}
	
	public void setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;
		}
		else {
			this.radius = 0;
		}
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double area() {
		return Math.PI * radius * radius;
	}
	
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	public String toString() {
		return "Radius = " + radius + "\nColor: " + this.getColor() + "\nIsFilled = " + this.getFill();
	}
}