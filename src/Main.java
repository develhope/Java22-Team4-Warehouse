import Dispositivi.Dispositivi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Magazzino magazzino = new Magazzino();
        Scanner scanner = new Scanner(System.in);
        Dispositivi dispositivo = new Dispositivi(scanner);

        System.out.println("Ciao magazziniere! Inserisci il tipo di dispositivo che vuoi inserire...");
        dispositivo.setTipoDispositivo(scanner.nextLine());
        System.out.println("Digita l'ID del tuo dispositivo.....");
        dispositivo.setId(Long.parseLong(scanner.nextLine()));
        System.out.println("Digita il modello del dispositivo.....");
        dispositivo.setModello(scanner.nextLine());
        System.out.println("Digita il produttore del dispositivo.....");
        dispositivo.setBrand(scanner.nextLine());
        System.out.println("Digita la descrizione del dispositivo.....");
        dispositivo.setDescrizione(scanner.nextLine());
        System.out.println("Digita la dimensione del display....");
        dispositivo.setDisplay(String.valueOf(Integer.parseInt(scanner.nextLine())));
        System.out.println("Digita la dimensione dello spazio di archiviazione del dispositivo....");
        dispositivo.setMemoria(Integer.parseInt(scanner.nextLine()));
        System.out.println("Digita il prezzo di acquisto.....");
        dispositivo.setPrezzoAcquisto(Double.parseDouble(scanner.nextLine()));
        System.out.println("Digita il prezzo di vendita.....");
        dispositivo.setPrezzo(Double.parseDouble(scanner.nextLine()));
        System.out.println("Grazie! A presto");
        scanner.close();

        magazzino.aggiungiDispositivoMagazzino(dispositivo);
        magazzino.stampaDispositivi(magazzino.listaDispositivi);

    }
}