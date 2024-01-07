package lib.util;

public class InvalidDataException extends RuntimeException {

    public InvalidDataException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }

}