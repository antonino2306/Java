package prg.exe;
import prg.lib.*;

public class Main {
    public static void main(String args[]) {

        GestoreTelefoni gestore = new GestoreTelefoni();

        gestore.add(new Telefono("apple", "iphone 15", "5G"));
        gestore.add(new Telefono("apple", "iphone 12", "4G"));
        gestore.add(new Telefono("apple", "iphone 14", "5G"));
        gestore.add(new Telefono("samsung", "s23", "5G"));
        gestore.add(new Telefono("samsung", "s4", "4G"));
        gestore.add(new Telefono("samsung", "s3", "3G"));
        gestore.add(new Telefono("apple", "iphone 4", "3G"));

        gestore.stampaOrdinatiPerRete();

        gestore.remove("iphone 15");

        System.out.println();

        gestore.stampaOrdinatiPerRete();

    }
}