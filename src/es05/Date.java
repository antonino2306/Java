package prg.es05;

public class Date {
	private int giorno;
	private int giornoFormatoAlternativo;
	private int mese;
	private int anno;
	private String nomeMese;
	private String mesi[] = {"Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", 
								"Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre"};
	private int giorniMese[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public Date() {
		this.setGiornoFormatoClassico(1);
		this.setGiornoFormatoAlternativo(1);
		this.setNomeMese("Gennaio");
		this.setMeseNumero(1);
		this.setAnno(0);
	}
	
	public Date(int giorno, int mese, int anno) {
		this.setMeseNumero(mese);
		this.setGiornoFormatoClassico(giorno);
		this.setAnno(anno);
	}
	
	public Date(int giornoFormatoAlternativo, int anno) {
		this.setGiornoFormatoAlternativo(giornoFormatoAlternativo);
		this.setAnno(anno);
	}
	
	public Date(int giorno, String nomeMese, int anno) {
		this.setNomeMese(nomeMese);
		this.setGiornoFormatoClassico(giorno);	
		this.setAnno(anno);
	}
	
	public void setGiornoFormatoClassico(int giorno) {
		if (giorno > 0 && giorno < 32) {
			this.giorno = giorno;
			this.convertiGiornoFormatoAlternativo();
		}
		
	}
	
	public int getGiorno() {
		return this.giorno;
	}
	
	public void setGiornoFormatoAlternativo(int giorno) {
		if (giorno > 0 && giorno <= 365) {
			this.giornoFormatoAlternativo = giorno;
			this.convertiGiornoFormatoClassico();
		}
		
	}
	
	public int getGiornoFormatoAlternativo() {
		return this.giornoFormatoAlternativo;
	}
	
	public void setMeseNumero(int mese) {
		if (mese > 0 && mese <= 12) {
			this.mese = mese;
		}
		this.nomeMese = mesi[mese-1];
	}
	
	public void setNomeMese(String nomeMese) {
		
		for (int i = 0; i < mesi.length; i++) {
			if (nomeMese.equals(mesi[i]));
			this.mese = i+1;
		}
		
		this.nomeMese = nomeMese;
	}
	
	public int getMese() {
		return mese;
	}

	public String getNomeMese() {
		return mesi[this.mese-1];
	}
	
	public void setAnno(int anno) {
		this.anno = anno;
	}
	
	public int getAnno() {
		return anno;
	}
	
	
	public String toString() {
		return this.giorno + " " + this.nomeMese + " " + this.anno;
	}
	
	public boolean equals(Date d) {
		if (this.giorno == d.getGiorno() && this.mese == d.getMese() && this.anno == d.getAnno()) {
			return true;
		}
		
		return false;
	}
	
	private void convertiGiornoFormatoAlternativo() {
		
		for (int i = 0; i < this.mese - 1; i++) {
			this.giornoFormatoAlternativo += giorniMese[i]; 
		}
		this.giornoFormatoAlternativo += this.giorno;
		
	}
	
	private void convertiGiornoFormatoClassico() {
		if (this.giornoFormatoAlternativo > 31) {
			
			int contatoreMese = 0, contatoreGiorni = 0;
			
			for (int i = 0; i < giorniMese.length; i++) {
				if (contatoreGiorni >= this.giornoFormatoAlternativo) {
					int differenzaGiorni = contatoreGiorni - this.giornoFormatoAlternativo;
					this.giorno = giorniMese[contatoreMese-1] - differenzaGiorni;
					this.mese = contatoreMese;
					this.nomeMese = mesi[contatoreMese-1];
				}
				else {
					contatoreGiorni += giorniMese[i];
					contatoreMese++;
				}
			}
			
		}
		else {
			this.giorno = this.giornoFormatoAlternativo;
			this.mese = 1;
			this.nomeMese = mesi[mese - 1]; 
		}
	}
	
	
}