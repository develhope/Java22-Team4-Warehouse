import Dispositivi.Dispositivi;
import Dispositivi.Operazione;

import java.util.ArrayList;
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
        }

        scanner.close();
    }

    private void gestisciCarrello(Scanner scanner) {
        System.out.println("Operazioni disponibili sul Carrello:");
        for (Operazione operazione : Operazione.values()) {
            System.out.println(operazione);
        }
        System.out.println("Seleziona un'operazione:");
        Carrello carrello= new Carrello();
        Dispositivi dispositivo = new Dispositivi();

        Operazione scelta = Operazione.valueOf(scanner.next());

        switch (scelta) {
            case AGGIUNGI_AL_CARRELLO:
                carrello.aggiungiDispositivo(dispositivo);
                break;
            case RIMUOVI_DAL_CARRELLO:
                carrello.rimuoviDispositivo(dispositivo);
                break;
            case VERIFICA_CARRELLO_VUOTO:
                carrello.svuotaCarrello();
                break;
            case CERCA_PRODOTTO_NEL_CARRELLO:
                carrello.stampaElementiCarrello();
                break;
            case CALCOLA_PREZZO_FINALE:
                carrello.calcolaTotale();
                break;
            default:
                System.out.println("Operazione non valida.");
                break;
        }
    }

    private void gestisciMagazzino(Scanner scanner) {
        System.out.println("Operazioni disponibili sul Magazzino:");
        for (Operazione operazione : Operazione.values()) {
            System.out.println(operazione);
        }
        System.out.println("Seleziona un'operazione:");
Magazzino magazzino1 = new Magazzino();
        Operazione scelta = Operazione.valueOf(scanner.next());

        switch (scelta) {
            case AGGIUNGI_AL_MAGAZZINO:
                magazzino1.aggiungiDispositivi(scanner);
                break;
            case STAMPA_ELEMENTI_MAGAZZINO:
                magazzino1.stampaDispositivi(new ArrayList<>());
                break;
            // Altre operazioni sul magazzino
            default:
                System.out.println("Operazione non valida.");
                break;
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.avviaMenu();
    }
}

