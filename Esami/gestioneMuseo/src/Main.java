package prg.exe;
import prg.util.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String args[]) {

        Museo uffizzi = new Museo("Uffizzi", "Piazzale degli Uffizzi 6, Firenze");
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");

        int input = 0;

        do {
            String titolo;
            try {

                stampaMenu();
                input = scanner.nextInt();

                switch(input) {

                    case 1:
                        aggiungiOpera(uffizzi);
                        break;
                    
                    case 2:
                        System.out.println("\n\n");
                        uffizzi.stampaListaOpere();
                        System.out.println("\n\n");
                        break;

                    case 3:
                        System.out.print("Inserisci titolo opera: ");
                        titolo = scanner.next();

                        uffizzi.rimuoviOpera(titolo);
                        break;

                    case 4:
                        System.out.print("Inserisci titolo opera: ");
                        titolo = scanner.next();

                        uffizzi.stampaOpera(titolo);
                        System.out.println("\n");
                        break;
                    
                    default: break;

                }

            }
            catch (InputMismatchException e) {
                System.out.println("Formato dei dati errato");
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
 
        } while(input != 0);


        

    }

    private static void stampaMenu() {

        System.out.print("1. per aggiungere un'opera\n" +
                            "2. per vedere l'elenco delle opere presenti nel museo\n" +
                            "3. per eliminare un'opera\n" +
                            "4. per cercare un'opera\n"+
                            "0. per uscire\n> ");

    }

    private static void aggiungiOpera(Museo m) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");

        String titolo, autore, dataDiCreazione;
        int input;


        try {

            System.out.print("1. per inserire una scultura\n" +
                                "2. per inserire un dipinto\n> ");

            input = sc.nextInt();
           
            System.out.print("Inerisci titolo: ");
            titolo = sc.next();

            System.out.print("Inerisci autore: ");
            autore = sc.next();

            System.out.print("Inerisci data creazione: ");
            dataDiCreazione = sc.next();

            switch(input) {
                case 1: 
                    System.out.print("Inserisci materiale: ");
                    String materiale = sc.next();

                    System.out.print("Inserisci altezza: ");
                    int altezza = sc.nextInt();

                    m.aggiungiOpera(new Scultura(titolo, autore, materiale, altezza, dataDiCreazione));
                    break;

                case 2:
                    System.out.print("Inserisci tecnica: ");
                    String tecnica = sc.next();

                    System.out.print("Inserisci lunghezza: ");
                    double lunghezza = sc.nextDouble();


                    System.out.print("Inserisci altezza: ");
                    double altezza2 = sc.nextDouble();

                    m.aggiungiOpera(new Dipinto(titolo, autore, tecnica, lunghezza, altezza2, dataDiCreazione));
                    break;
                
                default: break;
            }

        }
         catch (InputMismatchException e) {
            System.out.println("Formato dei dati errato");
        }
        catch (InvalidDimensionException e) {
            System.out.println(e);
        }


    }

}