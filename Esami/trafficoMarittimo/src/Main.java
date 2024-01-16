package prg.exe;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Iterator;
import prg.util.*;

public class Main {

    public static void main(String args[]) {

        Porto p = new Porto();

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");

        int input = 0;

        do {

            try {

                stampaMenu();
                input = scanner.nextInt();

                switch(input) {

                    case 1: 
                        aggiungiNave(p);
                    break;
                    case 2: 
                        System.out.print("Inserisci codice nave: ");
                        String codice = scanner.next();
                        p.rimuovi(codice);
                    break;
                    case 3: 
                        p.muoviNavi();
                    break;
                    case 4: 
                        Iterator<Nave> i = p.getListaNavi();

                        while(i.hasNext()) {

                            System.out.println(i.next());

                        }

                    break;
                    case 5: 
                        p.verificaCollisioni();
                    break;

                    default: break;

                }


            } catch (InputMismatchException e) {
                System.out.println("Formato dei dati in input errato");
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } while (input != 0);

    }

    private static void stampaMenu() {

        System.out.print("1. per aggiungere un nuovo natante\n" +
                        "2. per rimuovere un natante\n" +
                        "3. per fare avanzare i natanti\n" + 
                        "4. per stampare lo stato di tutte le navi\n" +
                        "5. per verificare la presenza di potenziali collisioni\n"+
                        "0. per terminare il programma\n> ");

    }

    private static void aggiungiNave(Porto p) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");


        try {


            System.out.print("Inserisci il codice della nave: ");
            String codice = sc.next();

            System.out.print("Inserisci coordinata x: ");
            double x = sc.nextDouble();


            System.out.print("Inserisci coordinata y: ");
            double y = sc.nextDouble();


            System.out.print("Inserisci velocità : ");
            double velocita = sc.nextDouble();


            System.out.print("Inserisci direzione in gradi (0 - 359): ");
            int direzione = sc.nextInt();


            System.out.print("Inserisci lunghezza: ");
            double lunghezza = sc.nextDouble();


            System.out.print("Inserisci larghezza: ");
            double larghezza = sc.nextDouble();

            System.out.print("Inserisci numero passeggeri: ");
            int numeroPasseggeri = sc.nextInt();

            p.aggiungi(new Nave(codice, x, y, velocita, direzione, lunghezza, larghezza, numeroPasseggeri));

        }
        catch (InputMismatchException e) {
            System.out.println("Formato dei dati in input errato");
        }
        catch (InvalidDataError | PosizioneImpossibileException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}