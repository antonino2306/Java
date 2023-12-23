package prg.es06;

// equazione nella forma ax + by + cz + d = 0;
public class Plane {
	
	private Point3D p1;
	private Point3D p2;
	private Point3D p3;
	private double a, b, c, d;
	
	public Plane() {
		
	}
	
	public Plane(double p1[], double p2[], double p3[]) {
		this.p1 = new Point3D(p1[0], p1[1], p1[2]);
		this.p2 = new Point3D(p2[0], p2[1], p2[2]);
		this.p3 = new Point3D(p3[0], p3[1], p3[2]);
		calculateCoeff();
		
	}
	
	private void calculateCoeff() {
		double deltaY21 = p2.getCoordY() - p1.getCoordY();
		double deltaY31 = p3.getCoordY() - p1.getCoordY();
		
		double deltaZ21 = p2.getCoordZ() - p1.getCoordZ();
		double deltaZ31 = p3.getCoordZ() - p1.getCoordZ();
		
		double deltaX21 = p2.getCoordX() - p1.getCoordX();
		double deltaX31 = p3.getCoordX() - p1.getCoordX();
		
		a = deltaY21 * deltaZ31 - deltaY31 * deltaZ21;
		b = deltaX21 * deltaZ31 - deltaX31 * deltaZ21;
		c = deltaX21 * deltaY31 - deltaX31 * deltaY21;
		
		
		d = -p1.getCoordX()*a +p1.getCoordY()*b - p1.getCoordZ()*c;
	}
	
	public String toString() {
		return a + "x " + b + "y " + c + "z " + d; 
	}
	
}