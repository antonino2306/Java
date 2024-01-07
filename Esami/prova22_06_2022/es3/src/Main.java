package lib.exe;
import lib.utils.*;


public class Main {

    public static void main(String args[]) {

        Contenitore<Televisore> lista = new Contenitore<>();

        lista.add(new Televisore("Samsung", "oled", 55, 1000.00));
        lista.add(new Televisore("Lg", "qled", 70, 1300.00));
        lista.add(new Televisore("Samsung", "m5", 27, 200.00));
        lista.add(new Televisore("sony", "bravia", 45, 800.00));

        lista.printInOrdine();

    }

}