import Dispositivi.Dispositivi;

import javax.imageio.stream.ImageInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public Menu(){
    }

    public void avviaMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean continua = true;


        while (continua) {
            System.out.println("Benvenuto nel menu principale:");
            System.out.println("1. Gestisci Carrello");
            System.out.println("2. Gestisci Magazzino");
            System.out.println("3. Esci");

            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    gestisciCarrello(scanner);
                    break;
                case 2:
                    gestisciMagazzino(scanner);
                    break;
                case 3:
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
                    break;
            }
            if(!continua){scanner.close();};
        }
    }

    private void gestisciCarrello(Scanner scanner) {

        System.out.println("Seleziona un'operazione:\n" +
                "a. aggiungi un dispositivo al carrello,\n" +
                "b. rimuovi un dispositivo dal carrello,\n" +
                "c. se vuoi rimovere tutti i prodotti dal carrello,\n" +
                "d. visualizza gli elementi del tuo carrello,\n" +
                "e. totale del carrello,\n" );
        Carrello carrello= new Carrello();
        Dispositivi dispositivo = new Dispositivi();

        String scelta = scanner.nextLine();

        switch (scelta) {
            case "a":
                carrello.aggiungiDispositivo(dispositivo);
                break;
            case "b":
                carrello.rimuoviDispositivo(dispositivo);
                break;
            case "c":
                carrello.svuotaCarrello();
                break;
            case "d":
                carrello.stampaElementiCarrello();
                break;
            case "e":
                carrello.calcolaTotale();
                break;
            default:
                System.out.println("Operazione non valida.");
                break;
        }
    }

    private void gestisciMagazzino(Scanner scanner) {
        Scanner scanner1 = new Scanner(System.in);
        boolean continua = true;
        while (continua) {
            System.out.println("Seleziona un'operazione:\n" +
                    "a. aggiungi un dispositivo al magazzino,\n" +
                    "b. visualizza tutti i dispositivi presenti nel magazzino,\n" +
                    "c. per effettuare una ricerca per produttore,\n" +
                    "d. per effettuare una ricerca per modello, \n" +
                    "e. per effettuare una ricerca per prezzo di vendita,\n" +
                    "f. per effettuare una ricerca per prezzo di acquisto,\n" +
                    "g. per effettuare una ricerca con un range di prezzo,\n" +
                    "h. per visualizzare il totale della spesa media");
            Magazzino magazzino1 = new Magazzino();
            String scelta = scanner.nextLine();

            switch (scelta) {
                case "a":
                    magazzino1.aggiungiDispositivi(scanner1);
                    break;
                case "b":
                    magazzino1.stampaDispositivi(magazzino1.listaDispositivi);
                    break;
                case "c":
                    magazzino1.ricercaProduttore(new ArrayList<>());
                    break;
                case "d":
                    magazzino1.ricercaModello(new ArrayList<>());
                    break;
                case "e":
                    magazzino1.cercaPerPrezzo(magazzino1.listaDispositivi, scanner.nextInt());
                    break;
                case "f":
                    magazzino1.cercaPerPrezzoAcquisto(magazzino1.listaDispositivi, scanner.nextInt());
                    break;
                case "g":
                    magazzino1.cercaPerRangePrezzo(magazzino1.listaDispositivi, scanner.nextInt(), scanner.nextInt());
                    break;
                case "h":
                    magazzino1.calcolaSpesaMedia(magazzino1.listaDispositivi);
                    break;
                case "esc":
                    continua = false;
                    break;

                default:
                    System.out.println("Operazione non valida.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.avviaMenu();
    }
}
