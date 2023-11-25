package lib;
import java.util.ArrayList;


public class GestoreFigure {
	
	private ArrayList<Circle> circles;
	private ArrayList<Rectangle> rectangles;
	private ArrayList<Square> squares;
	
	public GestoreFigure() {
		circles = new ArrayList<Circle>();
		rectangles = new ArrayList<Rectangle>();
		squares = new ArrayList<Square>();
		
	}
	
	public void add(Square s) {
		squares.add(s);
	}
	
	public void add(Rectangle r) {
		rectangles.add(r);
	}
	
	public void add(Circle c) {
		circles.add(c);
	}
	
	public void remove(int id) {
		for (int i = 0; i < circles.size(); i++) {
			if (id == circles.get(i).getId()) {
				circles.remove(i);
				break;
			}
		}
		
		for (int i = 0; i < rectangles.size(); i++) {
			if (id == rectangles.get(i).getId()) {
				rectangles.remove(i);
				break;
			}
		}
		
		for (int i = 0; i < squares.size(); i++) {
			if (id == squares.get(i).getId()) {
				squares.remove(i);
				break;
			}
		}
		
		
	}
	
	public void draw() {
		for (Circle c: circles) {
			c.draw();
		}
		
		for (Rectangle r: rectangles) {
			r.draw();
		}
		
		for (Square s: squares) {
			s.draw();
		}
	}
}