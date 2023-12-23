package prg.es06;

public class Point2D {
	private double x;
	private double y;
	
	public Point2D() {
		
	}
	
	public Point2D(double x, double y) {
		setCoordX(x);
		setCoordY(y);
	}
	
	public void setCoordX(double x) {
		this.x = x;
	}
	
	public void setCoordY(double y) {
		this.y = y;
	}
	
	public double getCoordX() {
		return x;
	}
	
	public double getCoordY() {
		return y;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}