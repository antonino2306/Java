package lib.utils;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class Contenitore {

    private HashMap<String, MacchinaCaffe> catalogo = new HashMap<>();

    public Contenitore() {

    }

    public Contenitore (Iterator<MacchinaCaffe> i) {

        while (i.hasNext()) {
            MacchinaCaffe value = i.next();

            String key = value.getModello();

            catalogo.put(key, value);
        }

    }

    public void add(MacchinaCaffe m) {

        catalogo.put(m.getModello(), m);
        
    }

    public void remove(String modello) {

        catalogo.remove(modello.toLowerCase());

    }

    public List<MacchinaCaffe> restituisciPerTipo(String tipologia) {

        List<MacchinaCaffe> l = new LinkedList<>();

        for (String modello : catalogo.keySet()) {

            if (catalogo.get(modello).getTipologia().equals(tipologia.toLowerCase())) {
                l.add(catalogo.get(modello));
            }

        }

        return l;

    }


}
