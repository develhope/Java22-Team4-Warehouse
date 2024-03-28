import Dispositivi.Dispositivi;
import Magazzino.Magazzino;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Carrello carrello = new Carrello();
        Magazzino magazzino = new Magazzino();
        Scanner scanner = new Scanner(System.in);
        Dispositivi dispositivo = new Dispositivi();
        Menu menu = new Menu(carrello,magazzino,scanner,dispositivo);
        magazzino.riempiMagazzino();
        menu.avviaMenu();
    }
}
