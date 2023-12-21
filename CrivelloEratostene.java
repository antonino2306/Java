package prg.es10;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Iterator;

public class CrivelloEratostene {
	
	public static void main(String args[]) {
		
		SortedSet<Integer> insieme = new TreeSet<>();
		
		for (int i = 2; i <= 50; i++) {
			insieme.add(i);
		}
		
		
		for (int i = 2; i <= (int)Math.sqrt(50); i++) {
			Iterator<Integer> iter = insieme.iterator();
		
			while (iter.hasNext()) {
				int n = iter.next();
				if (n != i && n % i == 0) {
					iter.remove();
				}
			}
		}
		
		Iterator<Integer> i = insieme.iterator();
		
		while (i.hasNext()) {
			
			System.out.print(i.next() + " ");
			
		}
		
		
	}
	
}