package prg.es09;
import prg.es05.Razionale;
import java.util.Comparator;

public class ComparatorRazionaliNumeratore implements Comparator<Razionale> {
	
	
	public int compare(Razionale r1, Razionale r2) throws NullPointerException {
		
		if (r1 == null || r2 == null) {
			throw new NullPointerException();
		}
		
		if (r1.getNumeratore() == r2.getNumeratore()) {
			return 0;
		}
		
		if (r1.getNumeratore() > r2.getNumeratore()) {
			return 1;
		}
		
		return -1;
	}
	
}