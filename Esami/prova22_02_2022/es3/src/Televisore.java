package lib.utils;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Televisore extends Dispositivo {


    public Televisore(String marca, String modello, String stato) {

        super(marca, modello, stato);

    }

    @Override
    public void spegni() {

        if (getStato().equals("acceso")) {

            Scanner s = new Scanner(System.in);

            System.out.print("Dopo quanti minuti effetuare lo spegnimento: ");
            s.nextInt();

            setStato("spento");

        }

    }

}