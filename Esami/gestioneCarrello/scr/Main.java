package lib.exe;
import lib.util.*;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Main {

    
    public static void main(String args[]) {

        Carrello carrello = new Carrello(); 
        Scanner scanner = new Scanner(System.in);

        int input = 0;

        do {

            try {

                stampaMenu();
                input = scanner.nextInt();

                switch(input) {

                    case 1:
                        aggiungiArticolo(carrello);
                        break;

                    case 2:
                        System.out.print("Inserisci l'id dell'articolo da rimuovere: ");
                        int id = scanner.nextInt();

                        carrello.remove(id);
                        break;
                    
                    case 3:
                        System.out.println();
                        carrello.visualizzaCarrello();
                        System.out.println("\nTotale: " + carrello.totale() + " €");
                        break;
                    
                    case 4:
                        System.out.println("\nTotale videogiochi: " + carrello.totaleVideogiochi() + " €");
                        break;
                    
                    case 5:
                        System.out.println("\nTotale libri: " + carrello.totaleLibri() + " €");
                        break;
                    
                    default: break;
                }



            }
            catch (InputMismatchException e) {
                System.out.println("Formato dati errato");
            }
            catch (EmptyChartException e) {
                System.out.println(e);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            } 


        } while (input != 0);

    }

    private static void stampaMenu() {

        System.out.print("1. per aggiungere un nuovo articolo\n" + 
                        "2. per rimuovere un articolo dal carrello\n" +
                        "3. per stampare visualizzare il carrello\n" +
                        "4. per vedere il prezzo totale dei videogiochi\n" +
                        "5. per vedere il prezzo totale dei libri\n" +
                        "0. per uscire\n> ");

    }

    private static void aggiungiArticolo(Carrello c) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("1. per aggiungere un libro\n2. per aggiungere un videogioco\n> ");
        try {

            int input = scanner.nextInt();

            System.out.print("Inserisci descrizione: ");
            String descrizione = scanner.next();

            System.out.print("Inserisci prezzo: ");
            double prezzo = scanner.nextDouble();

            switch(input) {

                case 1:
                    System.out.print("Inserisci titolo: ");
                    String titolo = scanner.next();

                    System.out.print("Inserisci autore: ");
                    String autore = scanner.next();

                    c.add(new Libro(titolo, autore, descrizione, prezzo));
                    break;
                
                case 2: 
                    System.out.print("Inserisci piattaforma: ");
                    String piattaforma = scanner.next();

                    c.add(new Videogioco(descrizione, piattaforma, prezzo));
                    break;
                
                default: break;
            }

        }
        catch (InputMismatchException e) {
            System.out.println("Formato dati errato");
        }
        catch (PriceException e) {
            System.out.println(e);
        }
    }

}