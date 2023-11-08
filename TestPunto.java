package prg.exe;
import prg.es04.Punto;
import java.util.Scanner;

public class TestPunto {
	public static void main(String args[]) {

		Scanner keyInput = new Scanner(System.in);
		
		Punto punto1 = new Punto(keyInput.nextDouble(), keyInput.nextDouble());
		Punto punto2 = new Punto(keyInput.nextDouble(), keyInput.nextDouble());
		
		System.out.println("Distanza tra i punti = " + punto1.distanzaTraPunti(punto2));
		
		Punto puntoMedio = new Punto();
		
		double medioX = (punto1.getCoordX() + punto2.getCoordX()) / 2;
		double medioY = (punto1.getCoordY() + punto2.getCoordY()) / 2;
		
		puntoMedio.setCoordX(medioX);
		puntoMedio.setCoordY(medioY);
		
		System.out.println(puntoMedio.toString());
		
		if (punto1.equals(punto2)) {
			System.out.println("Uguali");
		}
		else {
			System.out.println("Diversi");
		}
	}
}