package lib.exe;
import lib.utils.*;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");
        List<Libro> raccolta = new LinkedList<>();

        int input = 0;

        do {

            try {

                System.out.println("1. per aggiungere un libro alla raccolta");
                System.out.println("2. per stampare la raccolta");
                System.out.print("> ");
                input = scanner.nextInt();

                switch(input) {
                    case 1: 
                        System.out.print("Inserisci titolo: ");
                        String titolo = scanner.next();

                        System.out.print("Inserisci autore: ");
                        String autore = scanner.next();

                        System.out.print("Inserisci numero capitoli: ");
                        int numeroCapitoli = scanner.nextInt();

                        System.out.print("Inserisci numero pagine: ");
                        int numeroPagine = scanner.nextInt();

                        raccolta.add(new Libro(titolo, autore, numeroCapitoli, numeroPagine));

                        break;

                    case 2:
                        for (Libro libro: raccolta) {
                            System.out.println(libro);
                        } 
                        break;
                    
                    default: break;

                }
                

            }
            catch (InvalidNumberException exc) {
                System.out.println(exc);
            }
            catch (InputMismatchException exc) {
                System.out.println("Input in formato errato. Termino il programma");
            }
            catch (Exception exc) {
                exc.printStackTrace();
            }
 
        } while (input != 0);


        int totalePagine = 0;
        for (Libro l: raccolta) {
            System.out.println(l);
            totalePagine += l.getNumeroPagine();
        }
        System.out.println("\nTotale pagine = " + totalePagine);


        

    }
}