package prg.es02.exe;
import prg.es02.Quadrato;

public class TestQuadrato {
	
	public static void main(String args[]) {
		Quadrato poligono1 = new Quadrato(6);

		Quadrato q[] = new Quadrato[3];

		for (int i = 0; i < 3; i++) {
			q[i] = new Quadrato(i+1);
		}

		for (int i = 0; i < 3; i++) {
			System.out.println(q[i].lato + " " + q[i].perimetro() + " " + q[i].area());

		}
		
		System.out.println(poligono1.perimetro());
		System.out.println(poligono1.area());
	}
}