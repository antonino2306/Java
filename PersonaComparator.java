package prg.es10;
import java.util.Comparator;
import prg.es03.Persona;

public class PersonaComparator  implements Comparator<Persona>{
    public int compare(Persona p1, Persona p2) {
		
        return p1.getNome().compareTo(p2.getNome());
    }

}