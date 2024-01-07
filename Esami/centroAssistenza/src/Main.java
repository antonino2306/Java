package lib.exe;
import lib.utils.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String args[]) {

        Gestore centroRiparazione = new Gestore();

        Scanner scanner = new Scanner(System.in);

        int input = 0;

        do {

            try {

                stampaMenu();
                input = scanner.nextInt();

                switch(input) {

                    case 1:
                        aggiungiProdotto(centroRiparazione);
                        break;
                    
                    case 2:
                        centroRiparazione.ripara("Riparazione del prodotto");
                        break;
                    
                    case 3:
                        
                        System.out.print("Inserisci nome cliente: ");
                        String nome = scanner.next();

                        System.out.print("Inserisci cognome cliente: ");
                        String cognome = scanner.next();

                        System.out.print("Inserisci id riparazione: ");
                        int idRiparazione = scanner.nextInt();

                        Prodotto p = centroRiparazione.consegnaProdottoRiparato(idRiparazione, nome, cognome);
                        break;               

                }

            }
            catch(InputMismatchException e){
                System.out.println("Formato errato dei dati in input");
                break;
            }
            catch(InvalidDataException | EmptyRegisterException e) {
                System.out.println(e);
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Prodotti da riparare:");
            centroRiparazione.stampaProdottiDaRiparare();

            System.out.println("\n\nProdotti riparati:");
            centroRiparazione.stampaProdottiRiparati();
        } while(input != 0);
       
    }

    private static void stampaMenu() {

        System.out.print("1. per accettare un dispositivo per la riparazione\n"+
                            "2. per riparare un prodotto\n" +
                            "3. per consegnare il prodotto riparato\n> ");

    }

    private static void aggiungiProdotto(Gestore c) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Inserisci nome cliente: ");
            String nome = scanner.next();

            System.out.print("Inserisci cognome cliente: ");
            String cognome = scanner.next();

            System.out.print("Inserisci descrizione guasto: ");
            String descrizione = scanner.next();

            c.aggiungiProdottoDaRiparare(new Prodotto(nome, cognome, descrizione));

        }
        catch(InputMismatchException e){
            System.out.println("Formato errato dei dati in input");
        }
        catch(InvalidDataException e) {
            System.out.println(e);
        }

    }
}