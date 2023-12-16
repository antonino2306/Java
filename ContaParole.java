package prg.es09;
import java.util.TreeMap;

public class ContaParole {
	
	public static void main(String args[]) {
		
		// La TreeMap memorizza direttamente le chiavi secondo il loro ordine naturale
		TreeMap<String, Integer> frequenze = new TreeMap<>();
		
		String testo = "Scrivete un programma che, utilizzando il metodo split su una stringa contenente il testo di questo esercizio "
					+ "(lo potete incollare direttamente nel codice quando create la stringa), determina il numero totale di parole " +
					"presenti nel testo e la parola che compare con maggiore frequenza. Potreste anche pensare di utilizzare " + 
					"una Map<String, Integer> per memorizzare la frequenza di ciascuna parola utilizzando la parola stessa " +
					"come chiave. Stampate, infine, la frequenza di ciascuna parola mostrando le parole in ordine alfabetico";
		
		// Le [] servono per racchiudere l'insieme di carattere che fungono da separatori nella stringa
		String testoDiviso[] = testo.split("[ ,.<>()]");
		
		
		for (String str: testoDiviso) {
			
			if (frequenze.containsKey(str.toLowerCase())) {
				// Se l'elemento è presente aggiorno il valore
				int valore = frequenze.get(str);
				frequenze.replace(str, valore, ++valore);
			}
			
			else {
				frequenze.put(str.toLowerCase(), 1);
			}
			
		}
		
		System.out.println(frequenze.toString());
		
	}
}