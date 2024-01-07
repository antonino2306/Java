package lib.exe;
import lib.util.*;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        Registro registroTransazioni = new Registro();
        List<Articolo> listaArticoli = Arrays.asList(new Articolo("PS5", 499.99),
                                                        new Articolo("Macbook air", 1300.00),
                                                        new Articolo("One piece vol. 1", 4.5),
                                                        new Articolo("Frigorifero", 599.00),
                                                        new Articolo("Zaino", 29.99));

        int input = 0;

        do {

            try {
                String nomeCliente, cognomeCliente;
                Iterator<Transazione> i;
                double importo;

                stampaMenu();
                input = scanner.nextInt();

                switch(input) {

                    case 1:
                        System.out.print("Inserisci nome del cliente: ");
                        nomeCliente = scanner.next();

                        System.out.print("Inserisci cognome del cliente: ");
                        cognomeCliente = scanner.next();

                        System.out.print("Inserisci codice articolo: ");
                        int codiceArticolo = scanner.nextInt();

                        Articolo a = null;

                        for (Articolo art: listaArticoli) {

                            if (art.getCodice() == codiceArticolo) {
                                a = art;
                            }

                        }

                        if (a == null) {
                            throw new ArticoloNonInListaException("L'articolo non è nella lista");
                        }

                        System.out.print("Inserisci la quantità di articoli: ");
                        int quantitaArticoli = scanner.nextInt();

                        registroTransazioni.aggiungiTransazione(nomeCliente, cognomeCliente, a, quantitaArticoli);
                        break;

                    case 2:
                        double totale = registroTransazioni.getTotaleVenduto();
                        System.out.println("Totale venduto: " + totale);
                        break;
                    
                    case 3:
                        System.out.print("Inserire l'importo massimo: ");
                        importo = scanner.nextDouble();

                        i = registroTransazioni.getTransazioniMinoriDiValore(importo);

                        while(i.hasNext()) {

                            System.out.println(i.next() + "\n\n");

                        }
                        break;

                    case 4: 

                        System.out.print("Inserire l'importo minimo: ");
                        importo = scanner.nextDouble();

                        i = registroTransazioni.getTransazioniMaggioriDiValore(importo);

                        while(i.hasNext()) {

                            System.out.println(i.next() + "\n\n");

                        }
                        break;

                    case 5:
                        System.out.print("Inserisci nome del cliente: ");
                        nomeCliente = scanner.next();

                        System.out.print("Inserisci cognome del cliente: ");
                        cognomeCliente = scanner.next();

                        System.out.println(registroTransazioni.getTotaleTransazioniCliente(nomeCliente, cognomeCliente));
                        break;

                    default: break;

                }   

            }
            catch (InputMismatchException e) {
                System.out.println("Formato dei dati in input errato");
            
            }
            catch (ArticoloNonInListaException e) {
                System.out.println(e);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }


        } while (input != 0);

    }

    private static void stampaMenu() {

        System.out.print("1. inserisci una nuova transazione\n" +
                            "2. visualizza il totale venduto\n"+
                            "3. visualizza transazioni minori di un certo importo\n" +
                            "4. visualizza transazioni maggiori di un certo importo\n" + 
                            "5. visualizza il totale speso da un cliente\n" +
                            "0. esci\n> ");

    }

}