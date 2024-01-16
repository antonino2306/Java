package prg.util;

public class PosizioneImpossibileException extends RuntimeException {

    public PosizioneImpossibileException(String message) {

        super(message);

    }

    @Override
    public String toString() {

        return getMessage();

    }

    

}