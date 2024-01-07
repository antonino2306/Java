package lib.util;

public class PriceException extends Exception {

    public PriceException(String message) {

        super(message);

    }

    @Override
    public String toString() {

        return getMessage();

    }

}