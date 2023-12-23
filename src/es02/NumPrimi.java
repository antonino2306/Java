package prg.es02.exe;

public class NumPrimi {
	public static void main(String args[]) {
		boolean isPrime;
		
		for (int i = 2; i <= 100; i++) {
			isPrime = true;
			for (int j = i - 1; j >= 2 && isPrime; j--) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				System.out.println(i);
			}
		}
	}
}