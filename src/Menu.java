import Dispositivi.Dispositivi;
import Magazzino.Magazzino;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

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
            avviaMenu();
        }
    }

    private void gestisciCarrello(Scanner scanner) {

        System.out.println("""
                Seleziona un'operazione:
                a. esegui una ricerca per produttore,
                b. aggiungi un dispositivo al carrello tramite id,
                c. rimuovi un dispositivo dal carrello,
                d. se vuoi rimovere tutti i prodotti dal carrello,
                e. visualizza gli elementi del tuo carrello,
                f. totale del carrello,
                g. per tornare al menù principale.
                """);
        String scelta = scanner.next();
        switch (scelta) {
            case "a":
                caseA();
                break;
            case "b":
                caseB(scanner);
                break;
            case "c":
                caseC();
                break;
            case "d":
                caseD();
                break;
            case "e":
                caseE();
                break;
            case "f":
                carrello.calcolaTotale();
                break;
            case "g":
                avviaMenu();
            default:
                System.out.println("Operazione non valida.");
                break;
        }
    }

    private void caseA(){
        System.out.println("Digita il nome del produttore che vuoi cercare");
        String thisBrand = scanner.nextLine();
        List<Dispositivi> listaProduttori = carrello.ricercaPerProduttore(magazzino.getListaDispositivi(),thisBrand);
        if(listaProduttori.isEmpty()){
            System.out.println("La tua ricerca non ha prodotto risultati.");
            backToCarrello(scanner);
        }else{
            System.out.println("Gli elementi della tua ricerca sono: \n" + listaProduttori);
            backToCarrello(scanner);
        }
    }

    private void caseB(Scanner scanner) {
        System.out.println("Digita l'id del prodotto che vuoi aggiungere al tuo carrello: ");
        int id = scanner.nextInt();
        List<Dispositivi> listaCarrello = carrello.aggiungiDispositivo(magazzino.getListaDispositivi(),id);
        if (listaCarrello.isEmpty()) {
            System.out.println("La tua ricerca non ha prodotto risultati.\n");
            backToCarrello(scanner);
        } else {
            System.out.println("Ho aggiunto questi prodotti al tuo carrello: \n" + listaCarrello);
            backToCarrello(scanner);
        }
    }
    private void caseC(){
        System.out.println("Digita il tipo di dispositivo che vuoi rimuovere....");
        String daRimuovere = scanner.nextLine();
        List<Dispositivi> listaRimozione = carrello.rimuoviDispositivoDalCarrello(daRimuovere);
        if(listaRimozione.isEmpty()){
            System.out.println("Il carrello ora è vuoto....");
            backToCarrello(scanner);
        }else {
            System.out.println(" Gli elementi rimossi sono: " + listaRimozione);
            sleepMode();
            System.out.println("\n Attualmente nel tuo carrello sono presenti questi prodotti:\n" + carrello.getListaCarrello());
        }
    }
    private void caseD() {
        carrello.svuotaCarrello(carrello.getListaCarrello());
        System.out.println("Il carrello ora è vuoto.");
    }

    private void caseE() {
        List<Dispositivi> listaCarrello = carrello.getListaCarrello();
        if (listaCarrello.isEmpty()) {
            System.out.println("Il tuo carrello è vuoto");
            backToMenu(scanner);
        }else{
            System.out.println("Il carrello contiene: " + listaCarrello.size() + " elementi");
            System.out.println(listaCarrello);
        }
    }

    private void gestisciMagazzino(Scanner scanner) {

        boolean continua = true;
        try {
            while (continua) {
                System.out.println("""
                        Seleziona un'operazione:
                        a. aggiungi un dispositivo al magazzino,
                        b. visualizza tutti i dispositivi presenti nel magazzino,
                        c. per effettuare una ricerca per produttore,
                        d. per effettuare una ricerca per modello,\s
                        e. per effettuare una ricerca per prezzo di vendita,
                        f. per effettuare una ricerca per prezzo di acquisto,
                        g. per effettuare una ricerca con un range di prezzo,
                        h. per visualizzare il totale della spesa media
                        i. per tornare al menù principale""");
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
                    case "i":
                        esc(!continua);
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

    private void esc(boolean continua){
        if(!continua){
            avviaMenu();
        }
    }
    private static void sleepMode() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private static void backToMenu(Scanner scanner) {
        sleepMode();
        System.out.println("Premi invio per tornare al menù del magazzino");
        scanner.nextLine();
    }
    private void backToCarrello(Scanner scanner){
        sleepMode();
        System.out.println("Premi invio per tornare al menù del carrello");
        scanner.nextLine();
        gestisciCarrello(scanner);
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
        double max = 0;
        double min = 0;
        min = scanner.nextDouble();
        max = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ricerca dispositivi nel range: " + min + " - " + max);
        List<Dispositivi> risultatoRicercaRange = magazzino.cercaPerRangePrezzo(magazzino.getListaDispositivi(),min,max);
        if(risultatoRicercaRange.isEmpty()){
            System.out.println("La tua ricerca non ha prodotto risultati.\n");
            this.executeCaseG(scanner);
        }else{
            System.out.println(risultatoRicercaRange);
            backToMenu(scanner);
        }

    }

    private void executeCaseF(Scanner scanner) {
        System.out.println("Inserisci il prezzo di acquisto che desideri cercare...");
        List<Dispositivi> risultatoRicercaPerPrezzoAcquisto = magazzino.cercaPerPrezzoAcquisto(magazzino.getListaDispositivi(), scanner.nextInt());
        if(risultatoRicercaPerPrezzoAcquisto.isEmpty()){
            System.out.println("La tua ricerca non ha prodotto risultati.\n");
            this.executedCaseE(scanner);
        }else{
            System.out.println("Il risultato della tua ricerca: \n" + risultatoRicercaPerPrezzoAcquisto);
            backToMenu(scanner);
        }

    }


    private void executedCaseE(Scanner scanner) {
        System.out.println("Inserisci il prezzo di vendita che desideri cercare...");
        List<Dispositivi> risultatoRicercaPerPrezzo = magazzino.cercaPerPrezzo(magazzino.getListaDispositivi(), scanner.nextInt());
        if(risultatoRicercaPerPrezzo.isEmpty()){
            System.out.println("La tua ricerca non ha prodotto risultati.\n");
            this.executedCaseE(scanner);
        }else{
            System.out.println("Il risultato della tua ricerca: \n" + risultatoRicercaPerPrezzo);
            backToMenu(scanner);
        }

    }
    private void executeCaseD(Scanner scanner) {
        System.out.println("Inserisci il nome del modello che desideri cercare...");
        String thisBrand = scanner.next();
        List<Dispositivi> dispositiviPerModello = magazzino.ricercaModello(thisBrand);
        if (dispositiviPerModello.isEmpty()) {
            System.out.println("La tua ricerca non ha prodotto risultati.\n");
            this.executeCaseD(scanner);
        }else{
            System.out.println("Il risultato della tua ricerca: \n" + dispositiviPerModello);
            backToMenu(scanner);
        }
    }



    private void executeCaseC(Scanner scanner) {
        System.out.println("Inserisci il nome del brand che desideri cercare...");
        String thisBrand = scanner.next();
        List<Dispositivi> dispositiviPerProduttore = magazzino.ricercaProduttore(thisBrand);
        if (dispositiviPerProduttore.isEmpty()) {
            System.out.println("La tua ricerca non ha prodotto risultati.\n");
            this.executeCaseC(scanner);
        } else {
            System.out.println("I prodotti di questo produttore sono: \n" + dispositiviPerProduttore);
            backToMenu(scanner);
        }
    }

    private void executeCaseB() {
        System.out.println("Il magazzino contiene: " + magazzino.getListaDispositivi().size() + " elementi");
        System.out.println(magazzino.getListaDispositivi());
        if (magazzino.getListaDispositivi().isEmpty()) {
            System.out.println("Il magazzino è vuoto");
            backToMenu(scanner);
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
