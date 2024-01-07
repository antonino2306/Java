package prg.exe;

import prg.lib.*;
import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.InputMismatchException;
import java.util.Map;

public class Main {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        GestoreMagazzino magazzino = new GestoreMagazzino();
        int input = 0;

        do {
            String nome, taglia, colore, marchio;
            int quantita, giorno, mese, anno, tipo, id;
            stampaMenu();

            try {
                input = scanner.nextInt();

                switch (input) {

                    case 1:

                        System.out.print("Nome prodotto: ");
                        nome = scanner.next();

                        System.out.print("Quantità: ");
                        quantita = scanner.nextInt();

                        stampaMenuTipoProdotto();

                        tipo = scanner.nextInt();

                        switch (tipo) {
                            case 1: 
                                System.out.print("Marchio: ");
                                marchio = scanner.next();
                                
                                magazzino.inserisciProdotto(new Elettronica(nome, quantita, marchio));
                                break;
                            
                            case 2:
                                System.out.print("Taglia: ");
                                taglia = scanner.next();

                                System.out.print("Colore: ");
                                colore = scanner.next();

                                magazzino.inserisciProdotto(new Abbigliamento(nome, quantita, taglia, colore));
                                break;

                            case 3: 
                                System.out.print("Inserisci data di scandenza (GG/MM/AAAA): ");
                                giorno = scanner.nextInt();
                                mese = scanner.nextInt();
                                anno = scanner.nextInt();

                                magazzino.inserisciProdotto(new Alimentare(nome, quantita, new GregorianCalendar(anno, mese-1, giorno)));
                                break;
                        }

                        break;
                    
                    
                    
                    case 2: 
                    
                        System.out.print("Inserisci id prodotto: ");
                        id = scanner.nextInt();

                        System.out.print("Inserisci nuova quantità: ");
                        quantita = scanner.nextInt();

                        magazzino.aggiornaQuantita(id, quantita);
                    
                        break;
                    case 3: 
                    
                        System.out.print("Inserisci id prodotto: ");
                        id = scanner.nextInt();

                        System.out.println(magazzino.ricercaProdotto(id));
                    
                        break;

                    case 4:
                        Iterator<Prodotto> i = magazzino.elencoMagazzino();

                        while (i.hasNext()) {
                            System.out.println(i.next());
                        }

                        break;
                    
                    case 5:
                        System.out.println("Totale prodotti in magazzino: " + magazzino.totaleProdotti());
                        break;

                    case 6:
                        Map<String, Integer> m = magazzino.totaleProdottiPerTipo();

                        for (String k: m.keySet()) {
                            System.out.println(k + ": " + m.get(k));
                        }

                        break;
                    default: break;



                }

            }
            catch (IndexOutOfBoundsException | TagliaInesistenteException exc) {
                System.out.println(exc.getMessage());
            }
            catch (InputMismatchException exc) {
                System.out.println("Input in formato errato");
                scanner.next();
            }
            catch (Exception exc) {
                exc.printStackTrace();
            }


        } while (input != 0);

    }

    public static void stampaMenu() {
        System.out.println("Premi 1 per inserire un nuovo prodotto");
        System.out.println("Premi 2 per aggiornare la quantità di un prodotto");
        System.out.println("Premi 3 per cercare un prodotto");
        System.out.println("Premi 4 per vedere tutti i prodotti");
        System.out.println("Premi 5 per vedere il numero di prodotti in magazzino");
        System.out.println("Premi 6 per vedere il numero di prodotti per categoria");
        System.out.println("Premi 0 per uscire");
        System.out.print("> ");
    }

    public static void stampaMenuTipoProdotto() {
        System.out.println("1. Elettronica");
        System.out.println("2. Abbigliamento");
        System.out.println("3. Alimentare");
        System.out.print("> ");

    }
}