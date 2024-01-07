package lib.util;
import java.util.List;
import java.util.ArrayList;

public class Listino {

    private List<Bevanda> listino = new ArrayList<>();

    public Listino() {

    }

    public void add(Bevanda b) {

        listino.add(b);

    }

    public void remove(int id) {

        for (Bevanda b: listino) {
            if (b.getCodice() == id) {
                listino.remove(b);
            }
        }

    }

    public void stampaBevanda(int id) {

        for (Bevanda b: listino) {

            if (b.getCodice() == id) {
                System.out.println(b);
            }

        }

    }

    public void stampaListino() {

        for (Bevanda b: listino) {

            System.out.println(b);

        }

    }

    public void stampaBirreIPA() {

        for (Bevanda b: listino) {

            if (b instanceof Birra birra) {

                if (birra.getTipologia().equals("ipa")) {
                    System.out.println(birra);
                }

            }

        }

    }

}