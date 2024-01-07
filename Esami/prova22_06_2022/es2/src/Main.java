package lib.exe;
import lib.utils.*;
import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String args[]) {

        Map<Integer, Elettrodomestico> catalogo = new HashMap<>();

        catalogo.put(0, new Frigorifero("a+", 990.99, -4, 190));
        catalogo.put(1, new Frigorifero("a", 790.99, -10, 190));
        catalogo.put(2, new Lavatrice("wh700", 10, "b", 530.99));
        catalogo.put(3, new Lavatrice("w70020", 5, "a++", 830.99));
        catalogo.put(4, new Lavatrice("wh7004", 15, "b-", 1530.99));

        for (int key: catalogo.keySet()) {

            System.out.println(catalogo.get(key));

        }
        

    }

}