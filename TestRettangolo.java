package prg.exe;
import prg.es02.Rettangolo;

public class TestRettangolo {
	
	public static void main(String args[]) {
		Rettangolo r1 = new Rettangolo(10, 5);
		Rettangolo r2 = new Rettangolo(4, 2);
		
		System.out.println("r1 " + r1.perimetro() + " " + r1.area());
		System.out.println("r2 " + r2.perimetro() + " " + r2.area());
		
	}
}