package prg.util;

public class CellaOccupataException extends RuntimeException {
    public CellaOccupataException(String message) {
        super(message);
    }

    @Override 
    public String toString() {
        return getMessage();
    }
}