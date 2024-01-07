package prg.lib;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Computer implements Spegnimento {

    private static int counter = 0;
    private int id;
    private String modello;
    private String tipologia;
    private List<String> tipi = Arrays.asList("laptop", "desktop"); 

    public Computer() {
        this("-", "laptop");
    }


    public Computer(String modello, String tipologia) {
        id = counter++;
        this.modello = modello;
        setTipologia(tipologia);
    }

    private void setTipologia(String tipologia) {
        if (tipi.contains(tipologia.toLowerCase())) {
            this.tipologia = tipologia.toLowerCase();
        }
        else {
            this.tipologia = "laptop";
        }
    }

    @Override
    public String toString() {
        return id + " " + modello + " " + tipologia;
    }

    @Override
    public void spegni() {

        Scanner s = new Scanner(System.in);

        System.out.println("Sei sicuro? ");
        String risposta = s.next();
    }

}