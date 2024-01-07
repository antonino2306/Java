package lib.exe;
import lib.util.*;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Main {

    public static void main(String args[]) {

        Listino l = new Listino();
        Scanner scanner = new Scanner(System.in);

        int input = 0;

        do {

            stampaMenu();

            try {
                int id;
                input = scanner.nextInt();


                switch(input) { 

                    case 1:
                        aggiungiBevanda(l);
                        break;
                    case 2:
                        System.out.print("Inserisci codice: ");
                        id = scanner.nextInt();

                        l.remove(id);
                        break;
                    
                    case 3:
                        System.out.print("Inserisci codice: ");
                        id = scanner.nextInt();

                        l.stampaBevanda(id);
                        break;

                    case 4:
                        l.stampaListino();
                        break;
                    
                    case 5:
                        l.stampaBirreIPA();
                        break;

                    default: break;
                }

            }
            catch (InputMismatchException e) {
                System.out.println("Formato input errato");
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }


        } while (input != 0);


    }

    private static void stampaMenu() {

        System.out.print("1. per aggiungere una bevanda al listino\n" +
                            "2. per rimuovere una bevanda dal listino\n" + 
                            "3. per cercare una bevanda in base al codice\n" +
                            "4. per stampare l'intero listino\n" +
                            "5. per stampare le birre IPA\n" +
                            "> ");

    }

    private static void aggiungiBevanda(Listino l) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n1. per aggiungere vino\n" + 
                            "2. per aggiungere birra\n" +
                            "> ");

        try {

            int input = scanner.nextInt();

            System.out.print("Inserisci descrizione: ");
            String descrizione = scanner.next();

            System.out.print("Inserisci costo: ");
            double costo = scanner.nextDouble();

            switch(input) {

                case 1:
                    System.out.print("Inserisci anno: ");
                    int anno = scanner.nextInt();

                    l.add(new Vino(descrizione, costo, anno));
                    break;
                
                case 2:
                    System.out.print("Inserisci tipologia di birra: ");
                    String tipologia = scanner.next();

                    l.add(new Birra(descrizione, costo, tipologia));
                    break;

                default: break; 

            }

        }
        catch (InputMismatchException e) {
            System.out.println("Formato input errato");
        }
        catch (InvalidBeerTypeException | InvalidNumberException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    

    }

}