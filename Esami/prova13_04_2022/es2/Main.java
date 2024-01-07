package prg.exe;
import prg.lib.*;
import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String args[]) {

        List<Spegnimento> lista = new ArrayList<>();

        lista.add(new Televisore("samsung oled", 44));
        lista.add(new Computer("macbook", "laptop"));
        lista.add(new Computer("imac", "desktop"));

        for (Spegnimento s: lista) {

            s.spegni();

        }

    }
}