package prg.lib;
import java.util.List;
import java.util.Arrays;

public class Telefono implements Comparable<Telefono> {

    private String marca;
    private String modello;
    private String rete;
    private List<String> retiPossibili = Arrays.asList("3G", "4G", "5G");

    public Telefono() {

        this("-", "-", "3G");

    }

    public Telefono(String marca, String modello, String rete) {
        this.marca = marca;
        this.modello = modello;
        setRete(rete);
    }

    private void setRete(String rete) {

        if (retiPossibili.contains(rete.toUpperCase())) {

            this.rete = rete.toUpperCase();

        }
        else {
            this.rete = "3G";
        }

    }

    public String getRete() {
        return rete;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    @Override
    public String toString() {
        return marca + " " + modello + " " + rete;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }

        if (obj instanceof Telefono t) {

            if (this.hashCode() == modello.hashCode()) {
                return true;
            }

        }
        
        return false;

    }

    @Override 
    public int hashCode() {
        return marca.hashCode() + modello.hashCode();
    }

    @Override
    public int compareTo(Telefono t) {

        return rete.compareTo(t.getRete());

    }

}