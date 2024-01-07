package lib.util;

public class SistemaInesistenteException extends RuntimeException {

    public SistemaInesistenteException(String message) {
        super(message);

    }

    @Override
    public String toString() {
        return getMessage();
    }

}