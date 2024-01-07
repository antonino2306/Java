package lib.utils;

public class Libro {

    private String titolo;
    private String autore;
    private int numeroPagine;
    private int numeroCapitoli;

    public Libro() {

    }

    public Libro(String titolo, String autore, int numeroCapitoli, int numeroPagine) throws InvalidNumberException{

        this.titolo = titolo;
        this.autore = autore;

        setNumeroCapitoli(numeroCapitoli);
        setNumeroPagine(numeroPagine);

    }

    private void setNumeroCapitoli(int numeroCapitoli) throws InvalidNumberException{
        
        if (numeroCapitoli < 0) {
            throw new InvalidNumberException("Il libro deve avere almeno un capitolo");
        }

        this.numeroCapitoli = numeroCapitoli;

    }

    private void setNumeroPagine(int numeroPagine) throws InvalidNumberException {
        if (numeroPagine < 0) {
            throw new InvalidNumberException("Il numero di pagine deve essere > 0");
        }

        if (numeroPagine < numeroCapitoli) {
            throw new InvalidNumberException("Numero di pagine non valido. Non possono esistere capitoli con 0 pagine");
        }

        this.numeroPagine = numeroPagine;
    }

    public int mediaPaginePerCapitolo() {
        return (int)(numeroPagine / numeroCapitoli);
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    @Override
    public String toString() {
        return titolo + " by " + autore + ". " + numeroCapitoli + " capitoli, " + numeroPagine + " pagine";
    }

}