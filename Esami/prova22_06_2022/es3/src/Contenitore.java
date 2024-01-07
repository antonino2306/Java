package lib.utils;
import java.util.List;
import java.util.ArrayList;

public class Contenitore<T> {

    List<T> lista = new ArrayList<>();

    public Contenitore() {

    }

    public void add(T el) {

        lista.add(el);

    }

    public void printInOrdine() {

        lista.sort(null);

        for (T el: lista) {
            System.out.println(el);
        }

    }


}