package prg.es06;

public class Shape {
	private String color;
	private boolean isFilled;
	
	public Shape() {
		
	}
	
	public Shape(String color, boolean isFilled) {
		this.setColor(color);
		this.setFill(isFilled);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setFill(boolean isFilled) {
		this.isFilled = isFilled;
	}
	
	public boolean getFill() {
		return this.isFilled;
	}
}