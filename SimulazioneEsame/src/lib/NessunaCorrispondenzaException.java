package prg.lib;

public class NessunaCorrispondenzaException extends RuntimeException {

    public NessunaCorrispondenzaException() {
        super("Non esiste un' appartamento con questa descrizione");
    }

    @Override
    public String toString() {
        return getMessage();
    }
}