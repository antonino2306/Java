package prg.es03;

public class SommaMatrici {
    public static void main(String args[]) {
        double mat1[][] = new double[3][5];
        double mat2[][] = new double[3][5];
        double risultato[][] = new double[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                mat1[i][j] = Math.random() * 100;
                mat2[i][j] = Math.random() * 100;

                risultato[i][j] = mat1[i][j] + mat2[i][j];            
            }
        }

        System.out.println("Mat1");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(mat1[i][j] + " ");            
            }
            System.out.println();
        }

        System.out.println("Mat2");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(mat2[i][j] + " ");            
            }
            System.out.println();

        }

        System.out.println("Risultato");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(risultato[i][j] + " ");            
            }
            System.out.println();
        }
    }

}

