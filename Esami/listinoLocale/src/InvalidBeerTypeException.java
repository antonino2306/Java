package lib.util;

public class InvalidBeerTypeException extends RuntimeException {

    public InvalidBeerTypeException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}