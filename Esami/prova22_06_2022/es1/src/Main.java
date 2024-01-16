package lib.exe;
import lib.utils.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");
        List<Proiettore> lista = new ArrayList<>();

        int input = 0;

        do {

            try {

                
                    System.out.print("Inserisci modello: ");
                    String modello = scanner.next();

                    System.out.print("Inserisci dimensione: ");
                    int dimensione = scanner.nextInt();

                    System.out.print("Inserisci aula: ");
                    String aula = scanner.next();

                    System.out.print("Inserisci ore di accensione: ");
                    int oreDiAccensione = scanner.nextInt();

                    lista.add(new Proiettore(aula, modello, dimensione, oreDiAccensione));


                    System.out.println("Continuare ad inserire? Premi 1 per si 0 per no: ");
                    System.out.print("> ");
                    input = scanner.nextInt();

                

            }
            catch (InputMismatchException e) {
                System.out.println("Tipo di dato inserito non valido");
            }
            catch (InvalidNumberException e) {
                System.out.println(e);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }while (input != 0);


        for (Proiettore p: lista) {
            System.out.println(p);
        }


    }

}
