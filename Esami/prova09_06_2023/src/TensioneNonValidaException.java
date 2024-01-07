package lib.util;

public class TensioneNonValidaException extends RuntimeException {

    public TensioneNonValidaException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}