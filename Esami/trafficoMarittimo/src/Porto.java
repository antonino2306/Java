package prg.util;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Porto {

    private List<Nave> listaNavi = new ArrayList<>();
    private final double DISTANZA_LIMITE = 3.00;

    public Porto() {

    }

    public void aggiungi(Nave n) {
        double x = n.getCoordinate().get(0);
        double y = n.getCoordinate().get(1);

        for (Nave n1: listaNavi) {

            if (n1.getCodice().equals(n.getCodice())) {
                throw new InvalidDataError("Impossibile che ci siano due navi con lo stesso codice");
            }

            if (n1.getCoordinate().get(0) == x && n1.getCoordinate().get(1) == y) {
                throw new PosizioneImpossibileException("Impossibile che due navi si trovino alle stesse coordinate");
            }
        }

        listaNavi.add(n);
    }

    public void rimuovi(String codice) {

        for (Nave n: listaNavi) {
            if (n.getCodice().equals(codice.toLowerCase())) {
                listaNavi.remove(n);
            }
        }

    }

    private double calcolaDistanza(Nave n1, Nave n2) {

        List<Double> coord1 = n1.getCoordinate();
        List<Double> coord2 = n2.getCoordinate();

        double dx = coord1.get(0) - coord2.get(0);
        double dy = coord1.get(1) - coord2.get(1);
        System.out.println(Math.sqrt(dx*dx + dy*dy));
        return Math.sqrt(dx*dx + dy*dy);

    }

    public boolean verificaCollisioni() {
        boolean collisione = false;
        for (Nave n: listaNavi) {

            for (Nave n1: listaNavi) {

                if (n1.getCodice().equals(n.getCodice())) {
                    continue;
                }

                if (calcolaDistanza(n, n1) < 3) {
                    System.out.println("Possibile collisione tra nave " + n.getCodice() + " e nave " + n1.getCodice());
                    collisione = true;
                }

            }
        }

        return collisione;
    }

    public void muoviNave(String codice) {

        for (Nave n: listaNavi) {
            if (n.getCodice().equals(codice.toLowerCase())) {

                n.avanza();

            }
        }

    }

    public Iterator<Nave> getListaNavi() {
        return listaNavi.iterator();
    }

    public void muoviNavi() {

        if (verificaCollisioni()) {
            System.out.println("Possibilità di collisioni per sicurezza le navi staranno ferme");
            return;
        }

        for (Nave n: listaNavi) {
            n.avanza();
        }
    }

}