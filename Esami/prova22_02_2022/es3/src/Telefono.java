package lib.utils;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Telefono extends Dispositivo {

    private String rete;
    private List<String> retiPossibili = Arrays.asList("3G", "4G", "5G");

      public Telefono(String marca, String modello, String stato, String rete) {

        super(marca, modello, stato);
        setRete(rete);
    }

    private void setRete(String rete) {

        if (retiPossibili.contains(rete.toUpperCase())) {
            this.rete = rete;
        }
        else {
            this.rete = "3G";
        }

    }

    @Override
    public void spegni() {

        if (getStato().equals("acceso")) {

            Scanner s = new Scanner(System.in);

            System.out.print("Sicuro? y/n: ");
            

            if (s.next().toLowerCase().equals("y")) {
                setStato("spento");
            }
            

        }

    }


}