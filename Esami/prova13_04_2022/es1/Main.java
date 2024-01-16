package prg.exe;
import prg.lib.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    
    public static void main(String args[]) {

        List<Lavatrice> lista = new ArrayList<>();
        int input = 0;

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");


        do {

            String marca, modello;
            int capacitaCarico;

            stampaMenu();

            try {

                input = scanner.nextInt();


                switch(input) {

                    case 1:
                        System.out.print("Inserisci marca: ");
                        marca = scanner.next();

                        System.out.print("Inserisci modello: ");
                        modello = scanner.next();

                        System.out.print("Inserisci capacità di carico: ");
                        capacitaCarico = scanner.nextInt();

                        lista.add(new Lavatrice(marca, modello, capacitaCarico));
                        
                        break;

                    case 2:
                        for (Lavatrice l: lista) {
                            System.out.println(l);
                        }

                    default: break;
                }


            }
            catch (InputMismatchException exc) {
                System.out.println("Input in formato errato");
                continue;
            }
            catch (CapacitaErrataException exc) {
                System.out.println(exc);
            }
            catch (Exception exc) {
                System.out.println(exc.getMessage());
            }





        } while (input != 0);



    }

    public static void stampaMenu() {
        System.out.println("Premi 1 per inserire una nuova lavatrice");
        System.out.println("Premi 2 per stampare i dettagli di tutte le lavatrici inserite");
        System.out.print("> ");
    }
}