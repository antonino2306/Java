package prg.util;

public class InvalidDimensionException extends RuntimeException {

    public InvalidDimensionException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}