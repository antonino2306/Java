package prg.exe;
import prg.es06.Circle;
import prg.es06.Rectangle;
import prg.es06.Square;

public class TestShape {
	public static void main(String args[]) {
		
		Circle cerchio = new Circle(2.33, "red", true);
		Rectangle rettangolo = new Rectangle(10, 14, "blue", false);
		Square quadrato = new Square(5, "white", true);
		
		System.out.println(cerchio.toString());
		System.out.println(rettangolo.toString());
		System.out.println(quadrato.toString());
		
		
		System.out.println(cerchio.area());
		System.out.println(rettangolo.perimeter());
		System.out.println(quadrato.area());
		
	}
}