package prg.exe;
import prg.es03.Dado;

public class TestDado {
    public static void main(String args[]) {
        Dado primoDado = new Dado();
        Dado secondoDado = new Dado();

        int risultati[] = new int[13];

        for (int i = 0; i < 100; i++) {
            int sommaLanci = primoDado.lancia() + secondoDado.lancia();

            if (sommaLanci == 12) {
                System.out.println("Esito lancio: 12");
            }

            risultati[sommaLanci]++;

        }

        int max = risultati[2];
        int maxIndex = 2;
        
        for (int i = 3; i < 13; i++) {
            if (risultati[i] > max) {
                max = risultati[i];
                maxIndex = i;
            }

            // System.out.println(risultati[i]);
        }

        System.out.println("La combinazione che si ripete più frequentemente è: " + maxIndex);

    
    }    
}
