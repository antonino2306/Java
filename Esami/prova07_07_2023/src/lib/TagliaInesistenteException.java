package prg.lib;

public class TagliaInesistenteException extends RuntimeException {
    
    public TagliaInesistenteException(String message) {
        super(message);
    }

    @Override 
    public String toString() {
        return getMessage();
    }

}