package prg.es03;

public class Dado {

    public int lancia() {
        double lancio = (Math.random() * 100 % 6) + 1;
        // System.out.println("Dado " + (int)lancio);
        return (int)lancio;
    }    

    

}
