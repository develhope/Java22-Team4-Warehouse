
import java.util.*;

public class Magazzino {
    private List<Smartphone> smartphoneList = new ArrayList<>();
    private List<Notebook> notebooksList = new ArrayList<>();
    private List<Tablet> tabletsList = new ArrayList<>();


    public void aggiungiSmartphone(Smartphone smartphone) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ciao magazziniere! Inserisci il tipo di dispositivo che vuoi inserire......\n");
        if(scanner.equals("Smartphone".equalsIgnoreCase("smartphone"))) {
            smartphone.setTipoDispositivo(scanner.nextLine());
            smartphoneList.add(smartphone);
        }
        System.out.println("Digita l'ID di 4 cifre del tuo dispositivo.....");
        smartphone.setIdDispositivo(scanner.nextInt());
        System.out.println("Digita il modello del dispositivo.....");
        smartphone.setModello(scanner.nextLine());
        System.out.println("Digita il produttore del dispositivo.....");
        smartphone.setProduttore(scanner.nextLine());
        System.out.println("Digita la descrizione del dispositivo.....");
        smartphone.setDescrizione(scanner.nextLine());
        System.out.println("Digita la dimensione del display in questo formato: 00.0.....");
        smartphone.setDimensioneDisplay(scanner.nextDouble());
        System.out.println("Digita la dimensione dello spazio di archiviazione del dispositivo usando solo le cifre.....");
        smartphone.setSpazioArchiviazione(scanner.nextInt());
        System.out.println("Digita il prezzo di acquisto in questo formato: 00.0.....");
        smartphone.setPrezzoAcquisto(scanner.nextDouble());
        System.out.println("Digita il prezzo di vendita in questo formato: 00.0.....");
        smartphone.setPrezzoVendita(scanner.nextDouble());
        System.out.println("Grazie! A presto");
        scanner.close();
    }
    public void aggiungiNotebook(Notebook notebook) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ciao magazziniere! Inserisci il tipo di dispositivo che vuoi inserire......\n");
        if(scanner.equals("Notebook".equalsIgnoreCase("notebook"))) {
            notebook.setTipoDispositivo(scanner.nextLine());
            notebooksList.add(notebook);
        }
        System.out.println("Digita l'ID di 4 cifre del tuo dispositivo.....");
        notebook.setIdDispositivo(scanner.nextInt());
        System.out.println("Digita il modello del dispositivo.....");
        notebook.setModello(scanner.nextLine());
        System.out.println("Digita il produttore del dispositivo.....");
        notebook.setProduttore(scanner.nextLine());
        System.out.println("Digita la descrizione del dispositivo.....");
        notebook.setDescrizione(scanner.nextLine());
        System.out.println("Digita la dimensione del display in questo formato: 00.0.....");
        notebook.setDimensioneDisplay(scanner.nextDouble());
        System.out.println("Digita la dimensione dello spazio di archiviazione del dispositivo usando solo le cifre.....");
        notebook.setSpazioArchiviazione(scanner.nextInt());
        System.out.println("Digita il prezzo di acquisto in questo formato: 00.0.....");
        notebook.setPrezzoAcquisto(scanner.nextDouble());
        System.out.println("Digita il prezzo di vendita in questo formato: 00.0.....");
        notebook.setPrezzoVendita(scanner.nextDouble());
        System.out.println("Grazie! A presto");
        scanner.close();
    }
    public void aggiungiTablet(Tablet tablet) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ciao magazziniere! Inserisci il tipo di dispositivo che vuoi inserire......\n");
        if(scanner.equals("Tablet".equalsIgnoreCase("tablet"))) {
            tablet.setTipoDispositivo(scanner.nextLine());
            tabletsList.add(tablet);
        }
        System.out.println("Digita l'ID di 4 cifre del tuo dispositivo.....");
        tablet.setIdDispositivo(scanner.nextInt());
        System.out.println("Digita il modello del dispositivo.....");
        tablet.setModello(scanner.nextLine());
        System.out.println("Digita il produttore del dispositivo.....");
        tablet.setProduttore(scanner.nextLine());
        System.out.println("Digita la descrizione del dispositivo.....");
        tablet.setDescrizione(scanner.nextLine());
        System.out.println("Digita la dimensione del display in questo formato: 00.0.....");
        tablet.setDimensioneDisplay(scanner.nextDouble());
        System.out.println("Digita la dimensione dello spazio di archiviazione del dispositivo usando solo le cifre.....");
        tablet.setSpazioArchiviazione(scanner.nextInt());
        System.out.println("Digita il prezzo di acquisto in questo formato: 00.0.....");
        tablet.setPrezzoAcquisto(scanner.nextDouble());
        System.out.println("Digita il prezzo di vendita in questo formato: 00.0.....");
        tablet.setPrezzoVendita(scanner.nextDouble());
        System.out.println("Grazie! A presto");
        scanner.close();
    }
//
   // Un metodo per la stampa di tutti i dispositivi a magazzino.
    public void stampaDispositivi() {
        System.out.println(smartphoneList);
        System.out.println(notebooksList);
        System.out.println(tabletsList);
    }

    //Un metodo che permetta di fare la ricerca per tipo di dispositivo.
    public void trovaTipoDispositivo(){
        for (Smartphone smartphone : smartphoneList) {
            System.out.println("Il risultato della tua ricerca:\n" + smartphone.getTipoDispositivo());
            if(smartphone.getTipoDispositivo().isEmpty()){
                System.out.println("Purtroppo il dispositivo non è presente in magazzino");
            }
        }
        for(Tablet tablet: tabletsList){
            System.out.println("Il risultato della tua ricerca:\n" + tablet.getTipoDispositivo());
            if(tablet.getTipoDispositivo().isEmpty()){
                System.out.println("Purtroppo il dispositivo non è presente in magazzino");
            }
        }
        for (Notebook notebook:notebooksList){
            System.out.println("Il risultato della tua ricerca:\n" + notebook.getTipoDispositivo());
            if(notebook.getTipoDispositivo().isEmpty()){
                System.out.println("Purtroppo il dispositivo non è presente in magazzino");
            }
        }
    }
    //Un metodo che permetta di ricercare per produttore
    public void trovaProduttore() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ciao! Ricerca il tuo prodotto per produttore:");
//QUI MANCA TUTTA LA LOGICA!!
        for (Smartphone smartphone : smartphoneList ) {
            System.out.println("Il produttore del tuo smartphone è:\n" + smartphone.getProduttore());
            if(smartphone.getProduttore().isEmpty()){
                System.out.println("Purtroppo non abbiamo disponibili di questo produttore in magazzino");
            }
        }
        for(Tablet tablet: tabletsList){
            System.out.println(tablet.getProduttore());
            if(tablet.getProduttore().isEmpty()||equals(null)){
                System.out.println("Purtroppo non abbiamo disponibili di questo produttore in magazzino");
            }
        }
        for (Notebook notebook:notebooksList){
            System.out.println(notebook.getProduttore());
            if(notebook.getProduttore().isEmpty()){
                System.out.println("Purtroppo non abbiamo disponibili di questo produttore in magazzino");
            }
        }
    }

    //Un metodo che permetta di ricercare per modello
    public void trovaModelloDispositivo() {

        for (Smartphone smartphone : smartphoneList) {
            if(smartphone.getModello().isEmpty()){
                System.out.println("Dispositivo non disponibile!");
            }
            System.out.println(smartphone.getModello());
        }
        for(Tablet tablet: tabletsList){
            if(tabletsList.isEmpty()){
                System.out.println("Dispositivo non disponibile!");
            }
            System.out.println(tablet.getModello());
        }
        for (Notebook notebook:notebooksList){
            if(notebooksList.isEmpty()){
                System.out.println("Dispositivo non disponibile!");
            }
            System.out.println(notebook.getModello());
        }
    }
}
/*Si suggerisce l’uso dell’input da tastiera per la selezione delle operazioni
da compiere (1. aggiunta a magazzino, 2. scarico merce da
 magazzino, 3. creazione carrello, 4. aggiunta elemento al carrello, ecc.)*/

//Dovrà resitutire la lista di dispositivi frutto della
//ricerca o un errore nel caso in cui la ricerca non produca risultati

