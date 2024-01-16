package prg.util;
import java.util.List;
import java.util.ArrayList;

public class Museo {

    private String nome, indirizzo;
    private List<OperaDArte> listaOpere = new ArrayList<>();

    public Museo(String nome, String indirizzo) {
        this(nome, indirizzo, new ArrayList<OperaDArte>());
    }

    public Museo(String nome, String indirizzo, List<OperaDArte> listaOpere) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.listaOpere.addAll(listaOpere);
    }

    public void aggiungiOpera(OperaDArte opera) {

        listaOpere.add(opera);

    }

    public void rimuoviOpera(String titolo) {

        for (OperaDArte opera: listaOpere) {
            if (opera.getTitolo().equals(titolo.toLowerCase())) {
                listaOpere.remove(opera);
            }
        }

    }

    public void stampaListaOpere() {
        for (OperaDArte o: listaOpere) {
            System.out.println(o);
        }
    }

    public void stampaOpera(String titolo) {
        
        for (OperaDArte opera: listaOpere) {
            if (opera.getTitolo().equals(titolo.toLowerCase())) {
                System.out.println(opera);
                break;
            }
        }
    }
}