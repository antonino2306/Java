package prg.exe;
import prg.es06.IntegerSetNoLimit;

public class ProvaInsiemi {
	public static void main(String args[]) {
		int dati1[] = {12, 23, 45};
		int dati2[] = {22, 12, 21};
		IntegerSetNoLimit insieme1 = new IntegerSetNoLimit(dati1);
		IntegerSetNoLimit insiemeVuoto = new IntegerSetNoLimit();
		IntegerSetNoLimit insieme2 = new IntegerSetNoLimit(dati2);
		
		System.out.println(insieme1.toString());
		System.out.println(insiemeVuoto.toString());
		
		IntegerSetNoLimit unione = insieme1.unionOfIntegerSet(insiemeVuoto);
		IntegerSetNoLimit intersezione = insieme1.intersectionOfIntegerSet(insiemeVuoto);
		
		System.out.println(unione.toString());
		System.out.println(intersezione.toString());
		
		IntegerSetNoLimit unione2 = insieme1.unionOfIntegerSet(insieme2);
		IntegerSetNoLimit intersezione2 = insieme1.intersectionOfIntegerSet(insieme2);
		
		System.out.println(unione2.toString());
		System.out.println(intersezione2.toString());
		
		insieme1.deleteElement(23);
		
		System.out.println(insieme1.toString());	
		
		
		
		
	}
}