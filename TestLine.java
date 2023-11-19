package prg.exe;
import prg.es06.Line;

public class TestLine {
	public static void main(String args[]) {
		Line retta = new Line(1,1,2,2);
		Line rettaVerticale = new Line(1, 1, 1, 2);
		Line rettaOrizzontale = new Line(1, 2, 2, 2);
		
		System.out.println(retta.toString());
		System.out.println(rettaVerticale.toString());
		System.out.println(rettaOrizzontale.toString());
	}
}