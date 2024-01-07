package lib.util;

public class EmptyChartException extends RuntimeException {

    public EmptyChartException(String message) {

        super(message);

    }

    @Override
    public String toString() {

        return getMessage();

    }

}