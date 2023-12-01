package lib;
import java.util.List;
import java.util.LinkedList;

public class Main2 {
	
	public static void main(String args[]) {
		List<Drawable> schermo = new LinkedList<Drawable>();
		
		schermo.add(new Circle(3.2));
		schermo.add(new Square(2));
		schermo.add(new Rectangle(4.2, 4.1));
		
		for (Drawable d: schermo) {
			d.draw();
		}
		
	}
	
}