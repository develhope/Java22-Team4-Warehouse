import java.util.*;

public class Magazzino {
    private static List<Dispositivi> dispositiviList = new ArrayList<>();

    public static void aggiungiDispositivoMagazzino(Dispositivi dispositivi) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ciao magazziniere! Inserisci il tipo di dispositivo che vuoi inserire......\n");
        if (scanner.equals(Dispositivi.getTipoDispositivo())) {
            Dispositivi.setTipoDispositivo(//scanner.next());
            dispositiviList.add(dispositivi);
        }
        System.out.println("Digita l'ID del tuo dispositivo.....");
        dispositivi.setIdDispositivo(scanner.nextLine());
        System.out.println("Digita il modello del dispositivo.....");
        dispositivi.setModello(scanner.nextLine());
        System.out.println("Digita il produttore del dispositivo.....");
        dispositivi.setProduttore(scanner.nextLine());
        System.out.println("Digita la descrizione del dispositivo.....");
        dispositivi.setDescrizione(scanner.nextLine());
        System.out.println("Digita la dimensione del display....");
        dispositivi.setDimensioneDisplay(scanner.nextLine());
        System.out.println("Digita la dimensione dello spazio di archiviazione del dispositivo....");
        dispositivi.setSpazioArchiviazione(scanner.nextLine());
        System.out.println("Digita il prezzo di acquisto.....");
        dispositivi.setPrezzoAcquisto(scanner.nextLine());
        System.out.println("Digita il prezzo di vendita.....");
        dispositivi.setPrezzoVendita(scanner.nextLine());
        System.out.println("Grazie! A presto");
        scanner.close();
    }

    //
    // Un metodo per la stampa di tutti i dispositivi a magazzino.
    public void stampaDispositivi() {
        for (Dispositivi dispositivo : dispositiviList) {
            System.out.println(dispositivo);
        }
    }

    //Un metodo che permetta di fare la ricerca per tipo di dispositivo.
    public void trovaTipoDispositivo() {
        for (Dispositivi dispositivi : dispositiviList) {
            System.out.println("Il risultato della tua ricerca:\n" + dispositivi.getTipoDispositivo());
            if (dispositivi.getTipoDispositivo().equals(0)) {
                System.out.println("Purtroppo il dispositivo non è presente in magazzino");
            }
        }


//    //Un metodo che permetta di ricercare per produttore
//    public void trovaProduttore() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ciao! Ricerca il tuo prodotto per produttore:");
//// DA QUI MANCA TUTTA LA LOGICA DELLO SCANNER!!
//        for (Smartphone smartphone : dispositiviList ) {
//            System.out.println("Il produttore del tuo smartphone è:\n" + smartphone.getProduttore());
//            if(smartphone.getProduttore().isEmpty()){
//                System.out.println("Purtroppo non abbiamo disponibili di questo produttore in magazzino");
//            }
//        }
//        for(Tablet tablet: tabletsList){
//            System.out.println(tablet.getProduttore());
//            if(tablet.getProduttore().isEmpty()||equals(null)){
//                System.out.println("Purtroppo non abbiamo disponibili di questo produttore in magazzino");
//            }
//        }
//        for (Notebook notebook:notebooksList){
//            System.out.println(notebook.getProduttore());
//            if(notebook.getProduttore().isEmpty()){
//                System.out.println("Purtroppo non abbiamo disponibili di questo produttore in magazzino");
//            }
//        }
//
//
//        //Un metodo che permetta di ricercare per modello
//        public static void trovaModelloDispositivo () {
//            for (Dispositivi dispositivi : dispositiviList) {
//                if (dispositivi.getModello().isEmpty()) {
//                    System.out.println("Dispositivo non disponibile!");
//                }
//                System.out.println(dispositivi.getModello());
//            }
//        }
    }
}
/*Si suggerisce l’uso dell’input da tastiera per la selezione delle operazioni
da compiere (1. aggiunta a magazzino, 2. scarico merce da
 magazzino, 3. creazione carrello, 4. aggiunta elemento al carrello, ecc.)*/

//Dovrà resitutire la lista di dispositivi frutto della
//ricerca o un errore nel caso in cui la ricerca non produca risultati

