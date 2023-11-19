package prg.es06;

// Rappresenta una retta nella forma y = mx + q
public class Line {
	
	private Point2D firstPoint = new Point2D();
	private Point2D secondPoint = new Point2D();
	private double angularCoefficient;
	private double q;
	
	public Line() {
		
	}
	
	public Line(double firstPointX, double firstPointY, double secondPointX, double secondPointY) {
		this.firstPoint.setCoordX(firstPointX);
		this.firstPoint.setCoordY(firstPointY);
		
		this.secondPoint.setCoordX(secondPointX);
		this.secondPoint.setCoordY(secondPointY);
		
		setAngularCoefficient();
		setQ();
	}
	
	private void setAngularCoefficient() {
		double deltaY = secondPoint.getCoordY() - firstPoint.getCoordY();
		double deltaX = secondPoint.getCoordX() - firstPoint.getCoordX();
		
		if (deltaX == 0) {
			angularCoefficient = Double.NaN;
		}
		else {
			angularCoefficient = deltaY / deltaX;
		}
	
	}
	
	public double getAngularCoefficient() {
		return angularCoefficient;
	}
	
	private void setQ() {
		
		q = secondPoint.getCoordY() - angularCoefficient * secondPoint.getCoordX(); 
		
	}
	
	public String toString() {
		
		if (Double.isNaN(angularCoefficient)) {
			return "x = " + firstPoint.getCoordX();
		}
		
		if (angularCoefficient == 0) {
			return "y = " + q;
		}
		
		return "y = " + angularCoefficient + "x + " + q;
	}
}