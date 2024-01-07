package lib.util;

public class CostoNonValidoException extends RuntimeException {

    public CostoNonValidoException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}