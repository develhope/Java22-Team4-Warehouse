import Dispositivi.Dispositivi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Magazzino magazzino = new Magazzino();
            magazzino.aggiungiDispositiviConWhile(new Scanner(System.in));
             System.out.println(magazzino.stampaDispositivi(magazzino.dispositiviList));
//        magazzino.aggiungiDispositivoMagazzino(new Scanner(System.in));
//        System.out.println(magazzino.stampaDispositivi(magazzino.listaDispositivi));
//        magazzino.aggiungiDispositivoMagazzino(new Scanner(System.in));
//        System.out.println(magazzino.stampaDispositivi(magazzino.listaDispositivi));
    }
}