package lib.utils;

public class EmptyRegisterException extends RuntimeException {

    public EmptyRegisterException(String message) {

        super(message);

    }

    @Override
    public String toString() {

        return getMessage();

    }

}