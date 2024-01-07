package lib.exe;
import lib.util.*;

public class Main {
    public static void main(String args[]) {

       GestoreProdotti gestore = new GestoreProdotti();


        try {

            gestore.add(new Smartphone("iphone 15", 899.90, 12, "ios"));
            gestore.add(new Smartphone("iphone se", 599.90, 12, "ios"));
            gestore.add(new Smartphone("s23 ultra", 700.00, 12, "android"));
            gestore.add(new Elettronica("forno", 500, 220));
            gestore.add(new Elettronica("forno", 500, 120));
            

       }
       catch (CostoNonValidoException | TensioneNonValidaException | SistemaInesistenteException exc) {
            System.out.println(exc);
       }
       finally {
        System.out.println("numero di dispositivi IOS: " + gestore.contaIOS());
        System.out.println("numero di dispositivi alimentati a 220V : " + gestore.contaProdottiAlimentati220());
        gestore.stampaLista();
       }


    }
}