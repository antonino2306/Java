package prg.es06;

public class Point3D extends Point2D{
	
	private double z;
	
	public Point3D() {
		
	}
	
	public Point3D(double x, double y, double z) {
		super(x, y);
		setCoordZ(z);
	}
	
	public void setCoordZ(double z) {
		this.z = z;
	}
	
	public double getCoordZ() {
		return z;
	}
	
	public String toString() {
		return "(" + getCoordX() + ", " + getCoordY() + ", " + this.z + ")";
	}
}