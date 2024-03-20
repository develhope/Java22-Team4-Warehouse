import Dispositivi.Dispositivi;
import Magazzino.Magazzino;

import java.util.*;

public class Menu {
    Carrello carrello;
    Magazzino magazzino;
    Dispositivi dispositivo;
    Scanner scanner;

    public Menu(Carrello carrello, Magazzino magazzino, Scanner scanner,Dispositivi dispositivo) {
        this.carrello = carrello;
        this.magazzino = magazzino;
        this.scanner = scanner;
        this.dispositivo = dispositivo;
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
            System.out.println(e.getLocalizedMessage());
        }
    }

    private void gestisciCarrello(Scanner scanner) {

        System.out.println("Seleziona un'operazione:\n" +
                "a. aggiungi un dispositivo al carrello,\n" +
                "b. rimuovi un dispositivo dal carrello,\n" +
                "c. se vuoi rimovere tutti i prodotti dal carrello,\n" +
                "d. visualizza gli elementi del tuo carrello,\n" +
                "e. totale del carrello,\n");
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
        } catch (NoSuchElementException e){
            System.out.println(e.getLocalizedMessage());
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
        System.out.println("Inserisci il prezzo minimo e massimo del prodotto che cerchi:");
        double max = scanner.nextDouble();
        double min = scanner.nextDouble();
        List<Dispositivi> risultatoRicercaRange = magazzino.cercaPerRangePrezzo(magazzino.getListaDispositivi(),min,max);
        System.out.println(risultatoRicercaRange);
        if(risultatoRicercaRange.isEmpty()){
            System.out.println("La tua ricerca non ha prodotto risultati.\n");
            this.executeCaseG(scanner);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Premi invio per tornare al menù del magazzino");
        scanner.nextLine();
    }

    private void executeCaseF(Scanner scanner) {
        System.out.println("Inserisci il prezzo di acquisto che desideri cercare...");
        List<Dispositivi> risultatoRicercaPerPrezzoAcquisto = magazzino.cercaPerPrezzoAcquisto(magazzino.getListaDispositivi(), scanner.nextInt());
        System.out.println("Il risultato della tua ricerca: \n" + risultatoRicercaPerPrezzoAcquisto);
        if(risultatoRicercaPerPrezzoAcquisto.isEmpty()){
            System.out.println("La tua ricerca non ha prodotto risultati.\n");
            this.executedCaseE(scanner);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Premi invio per tornare al menù del magazzino");
        scanner.nextLine();
    }


    private void executedCaseE(Scanner scanner) {
        System.out.println("Inserisci il prezzo di vendita che desideri cercare...");
        List<Dispositivi> risultatoRicercaPerPrezzo = magazzino.cercaPerPrezzo(magazzino.getListaDispositivi(), scanner.nextInt());
        System.out.println("Il risultato della tua ricerca: \n" + risultatoRicercaPerPrezzo);
        if(risultatoRicercaPerPrezzo.isEmpty()){
            System.out.println("La tua ricerca non ha prodotto risultati.\n");
            this.executedCaseE(scanner);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Premi invio per tornare al menù del magazzino");
        scanner.nextLine();
    }
    private void executeCaseD(Scanner scanner) {
        System.out.println("Inserisci il nome del modello che desideri cercare...");
        String thisBrand = scanner.next();
        List<Dispositivi> dispositiviPerModello = magazzino.ricercaModello(thisBrand);
        System.out.println("Il risultato della tua ricerca: \n" + dispositiviPerModello);

        if (dispositiviPerModello.isEmpty()) {
            System.out.println("La tua ricerca non ha prodotto risultati.\n");
            this.executeCaseD(scanner);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Premi invio per tornare al menù del magazzino");
        scanner.nextLine();

    }
    private void executeCaseC(Scanner scanner) {
        System.out.println("Inserisci il nome del brand che desideri cercare...");
        String thisBrand = scanner.next();
        List<Dispositivi> dispositiviPerProduttore = magazzino.ricercaProduttore(thisBrand);
        System.out.println("I prodotti di questo produttore sono: \n" + dispositiviPerProduttore);

        if (dispositiviPerProduttore.isEmpty()) {
            System.out.println("La tua ricerca non ha prodotto risultati.\n");
            this.executeCaseC(scanner);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Premi invio per tornare al menù del magazzino");
        scanner.nextLine();
    }

    private void executeCaseB() {
        System.out.println("Il magazzino contiene: " + magazzino.getListaDispositivi().size() + " elementi");
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
                magazzino.aggiungiDispositiviMagazzino(nuovoDispositivo);
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

//TODO: TESTING, RIVEDERE METODI