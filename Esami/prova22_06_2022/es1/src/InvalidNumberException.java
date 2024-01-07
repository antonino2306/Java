package lib.utils;

public class InvalidNumberException extends RuntimeException {

    public InvalidNumberException(String message) {

        super(message);

    }

    @Override
    public String toString() {
        return getMessage();
    }

}