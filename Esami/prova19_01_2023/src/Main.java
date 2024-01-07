package lib.exe;
import lib.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String args[]) {

        List<Video> libreriaMultimediale = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        try {

            libreriaMultimediale.add(new Film("Napoleon", 180, false));
            libreriaMultimediale.add(new Film("Wonka", 140, false));
            libreriaMultimediale.add(new Film("Avengers Endgame", 180, false));
            libreriaMultimediale.add(new SerieTv("Invincible", 40, 12, false));
            libreriaMultimediale.add(new SerieTv("One piece", 1080, 1090, false));
            libreriaMultimediale.add(new SerieTv("Black Clover", 170, 168, false));

        } 
        catch (NumeroNonValidoException exc) {
            System.out.println(exc);
        }


        int input = 0, id;

        do {
            try {

                for (Video v: libreriaMultimediale) {
                    System.out.println(v);
                }

                System.out.println();


                stampaMenu();
                input = scanner.nextInt();



                switch(input) {
                    
                    case 1:
                        System.out.print("Inserisci id: ");
                        id = scanner.nextInt();

                        libreriaMultimediale.get(id).play();
                        break;

                    case 2:
                        System.out.print("Inserisci id: ");
                        id = scanner.nextInt();

                        libreriaMultimediale.get(id).pause();
                        break;

                    default: break;
                        

                }


            }
            catch (InputMismatchException exc) {
                System.out.println("Input in formato errato");
            }
            catch (NumeroNonValidoException | RiproduzioneGiaInCorsoException exc) {
                System.out.println(exc);
            }
            catch (Exception exc) {
                exc.printStackTrace();
            }

        } while (input != 0);
    }

    private static void stampaMenu() {
        System.out.println("1. per riprodurre");
        System.out.println("2. per mettere in pausa");
        System.out.print("> ");
    }
}