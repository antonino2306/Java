package prg.lib;

public class CapacitaErrataException extends RuntimeException {

    public CapacitaErrataException(String msg) {
        super(msg);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}