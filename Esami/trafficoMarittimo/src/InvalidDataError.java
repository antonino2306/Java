package prg.util;

public class InvalidDataError extends RuntimeException {

    public InvalidDataError(String message) {

        super(message);

    }

    @Override
    public String toString() {

        return getMessage();

    }

    

}