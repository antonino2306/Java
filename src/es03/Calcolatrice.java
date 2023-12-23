package prg.es03;

public class Calcolatrice {
    
    public double[] generaVettore(int lunghezza) {
        double vettore[] = new double[lunghezza];

        for (int i = 0; i < lunghezza; i++) {
            vettore[i] = Math.random() * 100;
        }

        return vettore;
    }

    public double[] sommaVettori(double a[], double b[]) {
        
        if (a.length == b.length) {
            double somma[] = new double[a.length];

            for (int i = 0; i < somma.length; i++) {
                somma[i] = a[i] + b[i];
            }

            return somma;
        }

        return a;
    }

    public double[] concatenaVettori(double a[], double b[]) {
        
        double risultato[] = new double[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            risultato[i] = a[i];
        }

        for (int i = a.length, j = 0; i < risultato.length; i++, j++) {
            risultato[i] = b[j];
        }

        return risultato;
    }

    public void stampaVettore(double a[]) {
        for (double tmp: a) {
            System.out.print(tmp + " ");
        }
        System.out.println("\n\n");
    }

    public double[][] generaMatrice(int righe, int colonne) {
        double matrice[][] = new double[righe][colonne];

        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                matrice[i][j] = Math.random() * 100;
            }
        }

        return matrice;
    }

    public double[][] sommaMatrici(double a[][], double b[][]) {
        
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i].length != b[i].length) {
                    return a;
                }
            }
        }

        double somma[][] = new double[a.length][a[0].length]; 

        for (int i = 0; i < somma.length; i++) {
            for (int j = 0; j < somma[i].length; j++) {
                somma[i][j] = a[i][j] + b[i][j];
            }
        }
        
        return somma;
    }

    public void stampaMatrice(double mat[][]) {
         /*for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }*/
        
		for (double[] riga: mat) {
			for (double cella: riga) {
				System.out.print(cella + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
    }
}

