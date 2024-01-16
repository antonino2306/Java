package prg.util;
import java.util.LinkedList;
import java.util.ArrayList;

public class Set {

    LinkedList<ArrayList<Integer>> risultatiParziali = new LinkedList<>();

    public Set() {

        ArrayList<Integer> punteggioIniziale = new ArrayList<>();
        punteggioIniziale.add(0);
        punteggioIniziale.add(0);
        risultatiParziali.add(punteggioIniziale);

    }

    public void aggiornaPunteggio(int indiceGiocatore) {
        // devo usare due arrayList perché getLast ritorna il reference
        // quindi se lo modifico cambia anche il valore in risultatiParziali
        ArrayList<Integer> ultimoRisultato = risultatiParziali.getLast();
        ArrayList<Integer> punteggioAggiornato = new ArrayList<>();

        if (indiceGiocatore == 0) {
            punteggioAggiornato.add(ultimoRisultato.get(0) + 1);
            punteggioAggiornato.add(ultimoRisultato.get(1));
        }
        else {
            punteggioAggiornato.add(ultimoRisultato.get(0));
            punteggioAggiornato.add(ultimoRisultato.get(1) + 1);
        }

        risultatiParziali.add(punteggioAggiornato);
    }

    public ArrayList<Integer> getPunteggioAttuale() {
        return risultatiParziali.getLast();
    }

    public int simulaSet() {
        boolean vittoria = false;

        while(!vittoria) {
            int punto = ((int)(Math.random() * 100)) % 2;
            this.aggiornaPunteggio(punto);

            if (controllaPossibileVittoria() == 1) {
                return 1;
            }
            else if (controllaPossibileVittoria() == -1) {
                return -1;
            }
            
        }

        return 0;
    }

    private int controllaPossibileVittoria() {
        ArrayList<Integer> ultimoPunteggio = this.getPunteggioAttuale();

        int punteggioG1 = ultimoPunteggio.get(0);
        int punteggioG2 = ultimoPunteggio.get(1);

        if (punteggioG1 >= 6 && punteggioG1 - punteggioG2 >= 2) {
            // Indica la vittoria del giocatore 1
            return 1;
        }
        
        if (punteggioG2 >= 6 && punteggioG2 - punteggioG1 >= 2) {
            // Indica la vittoria del giocatore 2
            return -1;
        }

        return 0;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (ArrayList<Integer> punteggio: risultatiParziali) {
            sb.append(punteggio.get(0) + "-" + punteggio.get(1) + ", ");
        }

        return sb.toString();
    }

    


}