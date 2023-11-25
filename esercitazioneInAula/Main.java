package lib;

public class Main {
	public static void main(String args[]) {
		GestoreFigure g = new GestoreFigure();
		/*
		System.out.println(new Circle(1, 3.5));
		System.out.println(new Square(2, 2));
		System.out.println(new Circle(3, 3.5, "red", false));
		System.out.println(new Square(4, 5.5, "blue", true));
		*/
		
		
		
		g.add(new Circle(1, 3.5));
		g.add(new Square(2, 2));
		g.add(new Rectangle(3, 3.2, 4.5));
		g.add(new Square(4, 1));
		
		
		System.out.println("-----------------");
		g.draw();
		g.remove(2);
		System.out.println("-----------------");
		g.draw();
		g.remove(1);
		System.out.println("-----------------");
		g.draw();
		
	}
}