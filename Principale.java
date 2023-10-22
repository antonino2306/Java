package prg.exe;
import prg.es03.Persona;

public class Principale {
    public static void main(String args[]) {
        Persona persona1 = new Persona("Antonino", "Randazzo", 20);
        Persona persona2 = new Persona("Antonino", "Randazzo", 21);
        Persona persona3 = persona1;

        if (persona1.equals(persona2)) {
            System.out.println("Uguali");
        }

        persona3.toString_();

        persona3.nome = "Giuseppe";

        persona1.toString_();

    }    
}
