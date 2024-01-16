package prg.util;

public class AttributoNonValidoException extends RuntimeException {

    public AttributoNonValidoException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }

}