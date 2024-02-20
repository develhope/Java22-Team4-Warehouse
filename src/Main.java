import Dispositivi.Dispositivi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Magazzino magazzino = new Magazzino();
        magazzino.aggiungiDispositivoMagazzino(new Scanner(System.in));
        System.out.println(magazzino.stampaDispositivi(magazzino.listaDispositivi));
    }
}