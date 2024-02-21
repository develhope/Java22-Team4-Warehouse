import Dispositivi.Dispositivi;
import java.util.Scanner;
import Dispositivi.Smartphone;

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


        Carrello carrello = new Carrello();

        // Aggiungere al carrello
        System.out.println("Inserisci l'ID del dispositivo da aggiungere al carrello:");
        long idDaAggiungere = scanner.nextLong();

        carrello.aggiungiDispositivo(dispositivo);

        // Rimuovere dal carrello tramite ID
        System.out.println("Inserisci l'ID del dispositivo da rimuovere dal carrello:");
        long idDaRimuovere = scanner.nextLong();
        carrello.rimuoviDispositivoid(1);

        // Controllare se l'ID esiste
        System.out.println("Inserisci l'ID da verificare:");
        long idDaVerificare = scanner.nextLong();
        boolean idEsistente = carrello.idesistente(idDaVerificare);
        System.out.println("L'ID esiste nel carrello? " + idEsistente);

        // Controllare se il carrello è vuoto
        boolean carrelloVuoto = carrello.carrellovuoto();
        System.out.println("Il carrello è vuoto? " + carrelloVuoto);

        // Ottenere prodotto da ID
        System.out.println("Inserisci l'ID del dispositivo da cercare:");
        long idDaCercare = scanner.nextLong();
        Dispositivi dispositivoTrovato = carrello.cercaProdottoid(1);
        System.out.println("Dispositivo trovato: " + dispositivoTrovato);

        // Calcolare prezzo finale
        double prezzoFinale = carrello.prezzofinale();
        System.out.println("Prezzo finale: " + prezzoFinale);

        // Svuotare carrello
        carrello.listavuota();
        System.out.println("Il carrello è stato svuotato!");

        // Stampare elementi nel carrello
        carrello.tuttidispositivi();
    }
}
