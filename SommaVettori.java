package prg.es03;

public class SommaVettori {
    public static void main(String args[]) {
        double vettore1[] = new double[10];
        double vettore2[] = new double[10];
        double risultato[] = new double[10];

        for (int i = 0; i < 10; i++) {
            vettore1[i] = Math.random() * 1000;            
            vettore2[i] = Math.random() * 1000;

            risultato[i] = vettore1[i] + vettore2[i];
        }

        System.out.println("Vettore 1");
        for (double tmp: vettore1){
            System.out.print(tmp + " ");
        }
        System.out.println();

        System.out.println("Vettore 2");
        for (double tmp: vettore2){
            System.out.print(tmp + " ");
        }
        System.out.println();

        System.out.println("Risultato");
        for (double tmp: risultato){
            System.out.print(tmp + " ");
        }
    }
}
