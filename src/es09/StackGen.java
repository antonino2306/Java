package prg.es09;
import java.util.EmptyStackException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class StackGen<T> {
	
	private final int MAX_SIZE = 10;
	private ArrayList<T> stack = new ArrayList<>();
	
	public StackGen() {
		
	}
	
	public StackGen(T element) {
		stack.add(element);
	}
	
	public StackGen(Iterator<T> elements) {
		int counter = 0;
		
		while (counter < MAX_SIZE && elements.hasNext()) {
			stack.add(elements.next());
			counter++;
		}
		
	}
	
	public ArrayList<T> getStack() {
		return stack;
	}
	
	public void push(T element) {
		if (stack.size() == MAX_SIZE) {
			throw new StackOverflowError();
		}
		stack.add(element);
	}
	
	public T pop() throws EmptyStackException {
		
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		
		T element = stack.get(stack.size() - 1);
		stack.remove(stack.size() - 1);
		
		return element;
		
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
		
		if (stk instanceof StackGen s) {
			
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