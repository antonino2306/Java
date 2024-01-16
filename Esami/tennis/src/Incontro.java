package prg.util;
import java.util.ArrayList;
import java.util.List;

public class Incontro {

    private Giocatore g1, g2;
    private List<Set> listaSet = new ArrayList<>();

    public Incontro() {
        this(new Giocatore("Mario", "Rossi", 1), new Giocatore("Luca", "Neri", 2));
    }

    public Incontro(Giocatore g1, Giocatore g2) {
        this.g1 = g1;
        this.g2 = g2;
        
        for (int i = 0; i < 3; i++) {
            listaSet.add(new Set());
        }
    }

    public void simulaIncontro() {

        int setG1 = 0, setG2 = 0;
        boolean vittoria = false;
        int i = 1;
        for (Set set: listaSet) {

            int vincitore = set.simulaSet();

            if (vincitore == 1) {
                setG1++;
                System.out.println("Simulazione set" + i + ": vince " + g1);
                i++;
            }
            else if (vincitore == -1) {
                setG2++;
                System.out.println("Simulazione set" + i + ": vince " + g2);
                i++;
            }

            
            if (setG1 >= 2) {
                System.out.println("Vince la partita: " + g1);
                break;
            }
            else if (setG2 >= 2) {
                System.out.println("Vince la partita: " + g2);
                break;
            } 

        }

        stampaRisultatiSet();

    }

    private void stampaRisultatiSet() {
        int i = 1;
        for (Set s: listaSet) {
            System.out.println("Set " + i + ": " + s);
            i++;
        }
    }
}