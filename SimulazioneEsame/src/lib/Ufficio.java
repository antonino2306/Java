package prg.lib;

public class Ufficio extends Appartamento {
	
	private boolean luceEmergenza;
	
	public Ufficio() {
		super();
		luceEmergenza = false;
	}

	public Ufficio(String descrizione, int numeroStanze, boolean luceEmergenza) {
		super(descrizione, numeroStanze);
		this.luceEmergenza = luceEmergenza;
	}
	
	public Ufficio(int numeroStanze, boolean luceEmergenza) {
		super("", numeroStanze);
		this.luceEmergenza = luceEmergenza;
	}
 	
	public void accendiLuciEmergenza() {
		luceEmergenza = true;
	}
	
	public void spegniLuceEmergenza() {
		luceEmergenza = false;
	}
	
	@Override
	public void spegniTutto() {
		super.spegniTutto();
		luceEmergenza = false;
	}
	
	@Override 
	public void accendiTutto() {
		super.accendiTutto();
		luceEmergenza = true;
	}
	
	@Override 
	public String toString() {
		return super.toString() + " luceEmergenza: " + luceEmergenza;
	}
}