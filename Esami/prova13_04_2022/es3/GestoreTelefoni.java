package prg.lib;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.Arrays;

public class GestoreTelefoni {

    private Map<String, Telefono> lista = new HashMap<>();

    public GestoreTelefoni() {

    }

    public void add(Telefono t) {
        lista.put(t.getModello(), t);
    }

    public void remove(String modello) {
        lista.remove(modello);
    }

    public void stampaOrdinatiPerRete() {

        Collection<Telefono> tmp = lista.values();
        Telefono[] arr = tmp.toArray(new Telefono[0]);

        Arrays.sort(arr, null);


        for (Telefono t: arr) {
            System.out.println(t);
        }

    }

}