package prg.es04;
import java.lang.Math;

public class Punto {
	private double x;
	private double y;
	
	public Punto() {
		this(-1, -1);
	}
	
	public Punto(double x, double y) {
		this.setCoordX(x);
		this.setCoordY(y);
	}
	
	public void setCoordX(double x) {
		this.x = x;
	}
	
	public void setCoordY(double y) {
		this.y = y;
	}
	
	public double getCoordX() {
		return this.x;
	}
	
	public double getCoordY() {
		return this.y;
	}
	
	public double distanzaTraPunti(Punto p) {
		return Math.hypot(Math.abs(this.x - p.getCoordX()), Math.abs(this.y - p.getCoordY()));
	}
	
	@Override
	public String toString() {
		return "x: " + this.x + " y. " + this.y;
	}
	
	public boolean equals(Punto p) {
		if (distanzaTraPunti(p) <= 0.000001) {
			return true;
		}
		return false;
	}
	
}