package lib.util;
import java.util.List;
import java.util.Arrays;

public class Smartphone extends Elettronica{
    private String sistema;
    private List<String> listaSistemi = Arrays.asList("ios", "android");

    public Smartphone() {
        this("-", 0, 12, "ios");
    }

    public Smartphone(String descrizione, double costo, int tensioneDiAlimentazione, String sistema) {
        super(descrizione, costo, tensioneDiAlimentazione);
        setSistema(sistema);
    }

    private void setSistema(String sistema) {
        if (!listaSistemi.contains(sistema.toLowerCase())) {
            throw new SistemaInesistenteException("Questo sistema operativo non esiste");
        }

        this.sistema = sistema.toLowerCase();
    }

    public String getSistema() {
        return sistema;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj instanceof Smartphone s) {

            System.out.println(this.hashCode() + " | " + s.hashCode());

            if (this.hashCode() == s.hashCode()) {

                return true;
            }

        }    

        return false;
    }


    @Override
    public String toString() {
        return super.toString() + " sistema operativo: " + sistema;
    }

}