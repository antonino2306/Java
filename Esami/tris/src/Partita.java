package prg.util;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Partita {

    private Giocatore p1, p2;
    private char[][] griglia = new char[3][3];


    public Partita(Giocatore p1) {
        this.p1 = p1;
        p2 = new Computer();
    }

    public Partita(Giocatore p1, Giocatore p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    private void inizializzaGriglia() {
        for (int i = 0; i < griglia.length; i++) {
            for (int j = 0; j < griglia[i].length; j++) {
                griglia[i][j] = ' ';
            }
        }
    }

    private void stampaGriglia() {
        for (int i = 0; i < griglia.length; i++) {
            for (int j = 0; j < griglia[i].length; j++) {
                if (j == 2) {
                    System.out.print(griglia[i][j]);
                }
                else {
                    System.out.print(griglia[i][j] + "|");
                }
            }
            System.out.println();
        }
    }

    private boolean controllaGriglia(char c) {
        int contaSimboli = 0;

        if (griglia[0][0] == c && griglia[1][1] == c && griglia[2][2] == c) {
            return true;
        }


        if (griglia[0][2] == c && griglia[1][1] == c && griglia[2][0] == c) {
            return true;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // System.out.println(i + "," + j + " = " + griglia[i][j]);
                if (griglia[i][j] == c) {
                    contaSimboli++;
                }
                else {
                    break;
                }
            }

            if (contaSimboli == 3) {
                return true;
            }
            contaSimboli = 0;
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // System.out.println(j + "," + i + " = " + griglia[j][i]);
                if (griglia[j][i] == c) {
                    contaSimboli++;
                }
                else {
                    break;
                }
            }

            if (contaSimboli == 3) {
                return true;
            }
            contaSimboli = 0;
        }

        return false;

    }


    public void gioca() {

        Scanner scanner = new Scanner(System.in);

        inizializzaGriglia();
        System.out.println(p1.getNome() + ": X");
        System.out.println(p2.getNome() + ": O");
        int riga, colonna;

        while(true) {
            
            stampaGriglia();

            try {

                System.out.println("turno di " + p1.getNome());
                System.out.print("Inserisci riga in cui inserire il simbolo: ");
                riga = scanner.nextInt();

                System.out.print("Inserisci colonna in cui inserire il simbolo: ");
                colonna = scanner.nextInt();

                if (griglia[riga][colonna] == 'X' || griglia[riga][colonna] == 'O') {
                    throw new CellaOccupataException("La cella in questione contiene già un simbolo");
                }

                griglia[riga][colonna] = 'X';

                stampaGriglia();

                if (controllaGriglia('X')) {
                    System.out.println("Vince " + p1.getNome());
                    p1.incrementaContatoreVittorie();
                    break;
                }


                if (p2 instanceof Computer com) {
                    do {

                        riga = (int)(Math.random() * 100 % 3);
                        colonna = (int)(Math.random() * 100 % 3);

                    } while (griglia[riga][colonna] != ' ');

                    griglia[riga][colonna] = 'O';
                }
                else {
                    System.out.println("turno di " + p2.getNome());
                    System.out.print("Inserisci riga in cui inserire il simbolo: ");
                    riga = scanner.nextInt();

                    System.out.print("Inserisci colonna in cui inserire il simbolo: ");
                    colonna = scanner.nextInt();

                    if (griglia[riga][colonna] == 'X' || griglia[riga][colonna] == 'O') {
                        throw new CellaOccupataException("La cella in questione contiene già un simbolo");
                    }

                    griglia[riga][colonna] = 'O';
                }

                if (controllaGriglia('O')) {
                    System.out.println("Vince " + p2.getNome());
                    p2.incrementaContatoreVittorie();
                    break;
               }

            }
            catch (InputMismatchException e) {
                System.out.println("Errore in input");
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Indici fuori dalla griglia");
            }
            catch(CellaOccupataException e) {
                System.out.println(e);
            }

        }
    }


}