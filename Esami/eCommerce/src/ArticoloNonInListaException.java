package lib.util;

public class ArticoloNonInListaException extends RuntimeException {

    public ArticoloNonInListaException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }

}