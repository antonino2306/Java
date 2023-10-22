package prg.exe;
import prg.es03.Calcolatrice;

public class TestMatematica {
    public static void main(String args[]) {
        Calcolatrice miaCalcolatrice = new Calcolatrice();

        double v1[] = miaCalcolatrice.generaVettore(3);
        double v2[] = miaCalcolatrice.generaVettore(3);
        double v3[] = miaCalcolatrice.generaVettore(5);

        miaCalcolatrice.stampaVettore(v1);
        miaCalcolatrice.stampaVettore(v2);
        miaCalcolatrice.stampaVettore(v3);

        double somma1[] = miaCalcolatrice.sommaVettori(v1,v2);
        double somma2[] = miaCalcolatrice.sommaVettori(v1, v3);
        double concatenati[] = miaCalcolatrice.concatenaVettori(v1, v3);

        miaCalcolatrice.stampaVettore(somma1);
        miaCalcolatrice.stampaVettore(somma2);
        miaCalcolatrice.stampaVettore(concatenati);

        double m1[][] = miaCalcolatrice.generaMatrice(3, 5);
        double m2[][] = miaCalcolatrice.generaMatrice(3, 5);
        double m3[][] = miaCalcolatrice.generaMatrice(3, 5);

        miaCalcolatrice.stampaMatrice(m1);
        miaCalcolatrice.stampaMatrice(m2);
        miaCalcolatrice.stampaMatrice(m3);


        double matNonRettangolare[][] = new double[3][];
        matNonRettangolare[0] = new double[5];
        matNonRettangolare[1] = new double[1];
        matNonRettangolare[2] = new double[3];


        double sommaMat1[][] = miaCalcolatrice.sommaMatrici(m1, m2);
        double sommaMat2[][] = miaCalcolatrice.sommaMatrici(m1, m3);
        double sommaMat3[][] = miaCalcolatrice.sommaMatrici(m1, matNonRettangolare);

        miaCalcolatrice.stampaMatrice(sommaMat1);
        miaCalcolatrice.stampaMatrice(sommaMat2);
        miaCalcolatrice.stampaMatrice(sommaMat3);
    }
}
