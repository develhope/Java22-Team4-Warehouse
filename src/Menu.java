import Dispositivi.Dispositivi;
import Magazzino.Magazzino;

import java.util.*;

public class Menu {
    Carrello carrello = new Carrello();
    Magazzino magazzino = new Magazzino();
    Scanner scanner = new Scanner(System.in);

    public Menu(Carrello carrello, Magazzino magazzino, Scanner scanner) {
        this.carrello = carrello;
        this.magazzino = magazzino;
        this.scanner = scanner;

    }

    public void avviaMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean continua = true;
        try {
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
                if (!continua) {
                    scanner.close();
                }
            }
        } catch (NoSuchElementException e) {
        }
    }

    private void gestisciCarrello(Scanner scanner) {

        System.out.println("Seleziona un'operazione:\n" +
                "a. aggiungi un dispositivo al carrello,\n" +
                "b. rimuovi un dispositivo dal carrello,\n" +
                "c. se vuoi rimovere tutti i prodotti dal carrello,\n" +
                "d. visualizza gli elementi del tuo carrello,\n" +
                "e. totale del carrello,\n");
        Carrello carrello = new Carrello();
        Dispositivi dispositivo = new Dispositivi();

        String scelta = scanner.next();

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

        boolean continua = true;
        try {
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
                String scelta = scanner.next().toLowerCase();

                switch (scelta) {
                    case "a":
                        executeCaseA(scanner);
                        break;

                    case "b":
                        executeCaseB();
                        break;
                    case "c":
                        executeCaseC(scanner);
                        break;
                    case "d":
                        executeCaseD(scanner);
                        break;
                    case "e":
                        executedCaseE(scanner);
                        break;
                    case "f":
                        executeCaseF(scanner);
                        break;
                    case "g":
                        executeCaseG(scanner);
                        break;
                    case "h":
                        executeCaseH();

                        break;
                    case "esc":
                        continua = false;
                        break;

                    default:
                        System.out.println("Operazione non valida.");
                        break;
                }
            }
            while (continua) ;
        } finally {
            System.out.println("Grazie e buona giornata!");
        }
    }

    private void executeCaseH() {
        double spesaMedia = magazzino.calcolaSpesaMedia(magazzino.getListaDispositivi());
        if (spesaMedia == 0.0) {
            System.out.println("Impossibile calcolare la spesa media, nessun dispositivo presente.");
        } else {
            System.out.println("La spesa media dei dispositivi è: " + spesaMedia);
        }
    }

    private void executeCaseG(Scanner scanner) {
        System.out.println("Inserisci il prezzo minimo del range:");
        double min = scanner.nextDouble();
        System.out.println("Inserisci il prezzo massimo del range:");
        double max = scanner.nextDouble();
        magazzino.cercaPerRangePrezzo(magazzino.getListaDispositivi(), min, max);
    }

    private void executeCaseF(Scanner scanner) {
        System.out.println("Inserisci il prezzo di acquisto che desideri cercare...");
        magazzino.cercaPerPrezzoAcquisto(magazzino.getListaDispositivi(), scanner.nextInt());
    }

    private List<Dispositivi> executeCaseD(Scanner scanner) {
        return magazzino.ricercaModello(scanner.nextLine());
    }

    private void executedCaseE(Scanner scanner) {
        System.out.println("Inserisci il prezzo di vendita che desideri cercare...");
        magazzino.cercaPerPrezzo(magazzino.getListaDispositivi(), scanner.nextInt());
    }

    private void executeCaseC(Scanner scanner) {
        System.out.println("Inserisci il nome del brand che desideri cercare...");
        String thisBrand = scanner.next();
        magazzino.ricercaProduttore(thisBrand);
        Dispositivi dispositivo = new Dispositivi();
        if(thisBrand.equalsIgnoreCase(dispositivo.getBrand())){
            System.out.println("I prodotti di questo produttore sono: \n" + magazzino.ricercaProduttore(thisBrand));
        }
        else if (magazzino.getListaDispositivi().isEmpty()) {
            System.out.println("Il magazzino al momento è vuoto");
        } else {
            System.out.println("La tua ricerca non ha prodotto risultati.\n" + "Inserisci nuovamente il brand: ");
            magazzino.ricercaProduttore(thisBrand);
        }
        try {
            // Aggiungi un ritardo di 1 secondo (1000 millisecondi)
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Premi invio per tornare al menù del magazzino");
    }

    private void executeCaseB() {
        magazzino.stampaDispositivi(magazzino.getListaDispositivi());
        System.out.println("La lista di dispositivi contiene: " + magazzino.getListaDispositivi().size() + " elementi");
        System.out.println(magazzino.getListaDispositivi());
        if (magazzino.getListaDispositivi().isEmpty()) {
            System.out.println("Il magazzino è vuoto");
        }
    }

    private void executeCaseA(Scanner scanner) {
        String risposta;
        try {
            do {
                Dispositivi nuovoDispositivo = new Dispositivi();
                System.out.println("Inserisci il tipo di dispositivo che vuoi aggiungere:");
                nuovoDispositivo.setDispositivo(scanner.nextLine());
                System.out.print("Inserisci il brand del dispositivo: ");
                nuovoDispositivo.setBrand(scanner.nextLine());
                System.out.print("Inserisci il modello del dispositivo: ");
                nuovoDispositivo.setModello(scanner.nextLine());
                System.out.println("Inserisci una breve descrizione del dispositivo: ");
                nuovoDispositivo.setDescrizione(scanner.nextLine());
                System.out.println("Inserisci la dimensione del display: ");
                nuovoDispositivo.setDisplay(scanner.nextLine());
                System.out.println("Inserisci lo spazio di archiviazione del dispositivo:");
                nuovoDispositivo.setMemoria(scanner.nextLine());
                System.out.print("Inserisci il prezzo di acquisto del dispositivo: ");
                nuovoDispositivo.setPrezzoAcquisto(scanner.nextDouble());
                System.out.println("Inserisci il prezzo di vendita al dettaglio del dispositivo:");
                nuovoDispositivo.setPrezzoVendita(scanner.nextDouble());
                nuovoDispositivo.setId(nuovoDispositivo.autoIncrementoID(magazzino.getListaDispositivi()));
                magazzino.aggiungiDispositivi(nuovoDispositivo);
                System.out.print("Desideri aggiungere un altro dispositivo? (sì/no): ");
                risposta = scanner.next();
            } while (risposta.equalsIgnoreCase("si"));
            if (risposta.equalsIgnoreCase("no")) {
            }
        }catch (NumberFormatException e){
            System.out.println("Ops, hai digitato una lettera. Reinserisci il valore prestando attenzione a digitare solo cifre.");
        }
    }
}

//TODO: AGGIUNGERE COMMENTI AI METODI, SPOSTARE PRINTLN, TESTING.