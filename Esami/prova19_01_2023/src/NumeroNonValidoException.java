package lib.util;

public class NumeroNonValidoException extends RuntimeException {

    public NumeroNonValidoException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }

}