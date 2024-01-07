package lib.util;

public class RiproduzioneGiaInCorsoException extends RuntimeException {

    public RiproduzioneGiaInCorsoException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }

}