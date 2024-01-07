package lib.utils;

public class TipologiaInesistenteException extends RuntimeException {

    public TipologiaInesistenteException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }

}