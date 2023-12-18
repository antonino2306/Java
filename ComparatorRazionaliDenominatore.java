package prg.es09;
import prg.es05.Razionale;
import java.util.Comparator;

public class ComparatorRazionaliDenominatore implements Comparator<Razionale> {
	
	public int compare(Razionale r1, Razionale r2) throws NullPointerException {
		
		if (r1 == null || r2 == null) {
			throw new NullPointerException();
		}
		
		if (r1.getDenominatore() == r2.getDenominatore()) {
			return 0;
		}
		
		if (r1.getDenominatore() > r2.getDenominatore()) {
			return 1;
		}
		
		return -1;
	}
	
}