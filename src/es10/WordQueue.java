package prg.es10.exe;
import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class WordQueue {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		Deque<String> q = new LinkedList<>();
		String word;
		
		while(true) {
			
			word = input.next();
			
			q.addFirst(word);
			
			if (word.endsWith(".")) {
				break;
			}
			
		}
		
		
		try {
			
			while(true) {
				System.out.print(q.removeFirst() + " ");
			}
			
		}
		catch (NoSuchElementException exc) {
			;
		}
		
		
	}
}