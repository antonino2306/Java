package prg.exe;
import prg.util.*;

public class Main {

    public static void main(String args[]) {

        Partita nuovaParita = new Partita(new Umano("Antonino"), new Umano("Goku"));

        nuovaParita.gioca();

    }
}