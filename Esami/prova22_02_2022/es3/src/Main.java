package lib.exe;
import lib.utils.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String args[]) {

        List<Dispositivo> l = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        l.add(new Televisore("lg", "oled", "spento"));
        l.add(new Televisore("samsung", "qled", "spento"));
        l.add(new Telefono("apple", "iphone 15", "spento", "5g"));

        int input = 0;

        try {

            do {

                for (Dispositivo d: l) {

                    System.out.println(d);

                }

                System.out.println("1 per accendere un dispositivo.\n2 per spegnere");
                input = scanner.nextInt();

                int id;
                
                switch(input) {
                    case 1: 
                        System.out.print("Inserisci id: ");
                        id = scanner.nextInt();
                        l.get(id).accendi();
                        break;
                    case 2:
                        System.out.print("Inserisci id: ");
                        id = scanner.nextInt();
                        l.get(id).spegni();
                        break;
                    
                    default: break;
                }

            } while (input != 0);
       
        }
        catch (InputMismatchException exc) {

            System.out.println("Input in formato errato");

        }


    }
}