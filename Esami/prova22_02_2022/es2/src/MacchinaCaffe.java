package lib.utils;

public class MacchinaCaffe {
    
    private String marca, modello, tipologia;
    private String[] tipi = {"cialde", "capsule"};

    public MacchinaCaffe() {

    }

    public MacchinaCaffe(String marca, String modello, String tipologia) {
        this.marca = marca.toLowerCase();
        this.modello = modello.toLowerCase();

        setTipologia(tipologia);
    }

    private void setTipologia(String tipologia) {

        for (String s: tipi) {
            if (s.equals(tipologia.toLowerCase())) {
                this.tipologia = tipologia.toLowerCase();
                return;
            }
        }

        throw new TipologiaInesistenteException("Il tipo di macchina inserito non esiste");

    }

    public String getTipologia() {
        return tipologia;
    }

    public String getModello() {
        return modello;
    } 

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }

        if (obj instanceof MacchinaCaffe m) {

            if (m.hashCode() == this.hashCode()) {
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
    public String toString() {

        return marca + " " + modello + " " + tipologia;

    }
}