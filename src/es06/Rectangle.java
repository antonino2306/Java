package prg.es06;

public class Rectangle extends Shape {
	private double width;
	private double length;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double width, double length, String color, boolean isFilled) {
		super(color, isFilled);
		this.setWidth(width);
		this.setLength(length);
	}
	
	public void setWidth(double width) {
		if (width > 0) {
			this.width = width;
		}
		else {
			this.width = 0;
		}
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setLength(double length) {
		if (length > 0) {
			this.length = length;
		}
		else {
			this.length = 0;
		}
	}
	
	public double area() {
		return width * length;
	}
	
	public double perimeter() {
		return 2 * (width + length);
	}
	
	public String toString() {
		return "Width = " + width + "\nLenght = " + length + "\nColor =" + getColor() + "\nIsFilled = " + getFill();
	}
}