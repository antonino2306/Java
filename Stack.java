package prg.es09;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Arrays;

public class Stack {
	private final int MAX_SIZE = 10;
	private ArrayList<String> stack = new ArrayList<>();
	
	public Stack() {
	
	}
	
	public Stack(String... elements) {
		
		for (String str: elements) {
			if (stack.size() == 10) {
				break;
			}
			stack.add(str);
		}
	}
	
	public Stack(Iterator<String> elements) {
		int counter = 0;
		
		while (counter < 10 && elements.hasNext()) {
			stack.add(elements.next());
			counter++;
		}
	}
	
	public ArrayList<String> getStack() {
		return stack;
	}
	
	public void push(String str) {
		if (stack.size() == MAX_SIZE) {
			throw new StackOverflowError();
		}
		stack.add(str);
	}
	
	public String pop() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		String str = stack.get(stack.size() - 1);
		stack.remove(stack.size() - 1);
		return str;
	}
	
	public boolean isEmpty() {
		if (stack.size() == 0) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if (stack.size() == MAX_SIZE) {
			return true;
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		return Arrays.toString(stack.toArray(new String[0]));
	}
	
	@Override
	public boolean equals(Object stk) {
		
		if (stk == null) {
			return false;
		}
		
		if (stk instanceof Stack s) {
			
			if (this.isEmpty()) {
				
				if (s.isEmpty()) {
					return true;
				}
				else {
					return false;
				}
			}
			
			for (int i = 0; i < stack.size(); i++) {
				if (!stack.get(i).equals(s.getStack().get(i))) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}