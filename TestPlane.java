package prg.exe;
import prg.es06.Plane;

public class TestPlane {
	public static void main(String args[]) {
		double p1[] = {1, 2, 3};
		double p2[] = {5, 3, 1};
		double p3[] = {2, 1, 4};
		
		Plane piano = new Plane(p1, p2, p3);
		
		System.out.println(piano.toString());
	}
}