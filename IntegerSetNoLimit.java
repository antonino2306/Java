package prg.es06;
import java.util.ArrayList;

public class IntegerSetNoLimit {
	private ArrayList<Integer> insieme = new ArrayList<Integer>();
	
	public IntegerSetNoLimit() {
		
	}
	
	public IntegerSetNoLimit(int s[]) {
		this.setInsieme(s);
	}
	
	public void setInsieme(int s[]) {
		for (Integer elemento: s) {
			insieme.add(elemento);
		}
	}
	
	public ArrayList<Integer> getInsieme() {
		return insieme;
	}
	
	public void insertElement(int elemento) {
		insieme.add(elemento);
	}
	
	public void deleteElement(int elemento) {
		
		if (insieme.contains(elemento)) {
			insieme.remove(insieme.indexOf(elemento));
		}
		else {
			System.out.println("Elemento non presente nella lista");
		}
		
	}
	
	public String toString() {
		
		if (insieme.isEmpty()) {
			return "-";	
		}
		
		StringBuilder output = new StringBuilder();
		
		for (Integer elemento: insieme) {
			output.append(elemento + " ");
		}
		
		return output.toString();
		
		
	}
	
	public IntegerSetNoLimit unionOfIntegerSet(IntegerSetNoLimit altroInsieme) {
		
		IntegerSetNoLimit unione = new IntegerSetNoLimit();
		
		for (int i = 0; i < insieme.size(); i++) {
			unione.insertElement(insieme.get(i));
		}
		
		ArrayList<Integer> valoriUnione = unione.getInsieme();
		ArrayList<Integer> valoriAltroInsieme = altroInsieme.getInsieme();
		
		for (int i = 0; i < valoriAltroInsieme.size(); i++) {
			if (!valoriUnione.contains(valoriAltroInsieme.get(i))) {
				unione.insertElement(valoriAltroInsieme.get(i));
			}
		}
		
		
		return unione;
	}
	
	public IntegerSetNoLimit intersectionOfIntegerSet(IntegerSetNoLimit altroInsieme) {
		
		IntegerSetNoLimit intersezione = new IntegerSetNoLimit();
		
		ArrayList<Integer> valoriAltroInsieme = altroInsieme.getInsieme();
		
		if (!insieme.isEmpty() && !valoriAltroInsieme.isEmpty()) {
			if (insieme.size() < valoriAltroInsieme.size()) {
				for (int i = 0; i < insieme.size(); i++) {
					if (valoriAltroInsieme.contains(insieme.get(i))) {
						intersezione.insertElement(insieme.get(i));
					}
				}
			}
			else {
				for (int i = 0; i < valoriAltroInsieme.size(); i++) {
					if (insieme.contains(valoriAltroInsieme.get(i))) {
						intersezione.insertElement(valoriAltroInsieme.get(i));
					}
				}
			}			
		}
		
		
		return intersezione;
	}
}