package prg.es06;
import java.util.InputMismatchException;

public class IntegerSet {
	private boolean insieme[] = new boolean[100];
	
	public IntegerSet() {
		
	}
	
	public IntegerSet(int s[]) {
		this.setInsieme(s);
	}
	
	public void insertElement(boolean valore, int indice) {
		this.insieme[indice] = valore;
	}
	
	public void setInsieme(int s[]) throws InputMismatchException{
		
		for (int i = 0; i < s.length; i++) {
			if (s[i] >= 0 && s[i] <= 99) {
				this.insieme[s[i]] = true;
			}
			else {
				throw new InputMismatchException("I valori devono essere compresi tra 0 e 99");
			}
		}
		
	}
	
	public boolean[] getInsieme() {
		return insieme;
	}
	
	
	public IntegerSet unionOfIntegerSet(IntegerSet altroInsieme) {
		IntegerSet insiemeUnione = new IntegerSet();
		
		boolean valoriAltroInsieme[] = altroInsieme.getInsieme();
		
		for (int i = 0; i < insieme.length; i++) {
			if (this.insieme[i] || valoriAltroInsieme[i]) {
				insiemeUnione.insertElement(true, i);
			}
			else {
				insiemeUnione.insertElement(false,i);
			}
		}
		
		return insiemeUnione;
	}
	
	public IntegerSet intersectionOfintegerSet(IntegerSet altroInsieme) {
		
		IntegerSet insiemeIntersezione = new IntegerSet();
		
		boolean valoriAltroInsieme[] = altroInsieme.getInsieme();
		
		for (int i = 0; i < insieme.length; i++) {
			if (this.insieme[i] && valoriAltroInsieme[i]) {
				insiemeIntersezione.insertElement(true, i);
			}
			else {
				insiemeIntersezione.insertElement(false, i);
			}
		}
		
		return insiemeIntersezione;
		
	}
	
	public void deleteElement(int elemento) {
		if (elemento >= 0 && elemento <= 99) {
			this.insieme[elemento] = false;
		}
	}
	
	public String toString() {
		StringBuilder output = new StringBuilder();
		
		for (int i = 0; i < insieme.length; i++) {
			if (insieme[i] == true) {
				output.append(i + " ");
			}
		}
		
		if (output.length() > 0) {
			return output.toString();
		}
		else {
			return "-";
		}
		
	}
	
	
	
}