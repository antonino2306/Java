package prg.es05.exe;
import prg.es05.Date;

public class ProvaDate {
	public static void main(String args[]) {
		Date data1 = new Date(174, 2003);
		Date data2 = new Date(23, 6, 2003);
		
		System.out.println(data1.getGiorno());
		System.out.println(data1.getGiornoFormatoAlternativo());
		System.out.println(data1.getMese());
		System.out.println(data1.getNomeMese());
		
		System.out.println(data2.getGiorno());
		System.out.println(data2.getGiornoFormatoAlternativo());
		System.out.println(data2.getMese());
		System.out.println(data2.getNomeMese());
		
		System.out.println(data1.equals(data2));
	}
}