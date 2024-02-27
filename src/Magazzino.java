import Dispositivi.Dispositivi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Magazzino {

    protected List<Dispositivi> listaDispositivi = new ArrayList<>();

    public void aggiungiDispositivi(Scanner scanner) {

        String risposta;

        do {
            Dispositivi nuovoDispositivo = new Dispositivi();
            System.out.println("Inserisci il tipo di dispositivo che vuoi aggiungere:");
            nuovoDispositivo.setTipoDispositivo(scanner.nextLine());
            System.out.print("Inserisci il brand del dispositivo: ");
            nuovoDispositivo.setBrand(scanner.nextLine());
            System.out.print("Inserisci il modello del dispositivo: ");
            nuovoDispositivo.setModello(scanner.nextLine());
            //ATTENZIONE! aggiungere exception per ogni parametro che prende un numero, se si digita per sbaglio una lettera da NumberFormatException
            System.out.print("Inserisci il prezzo di acquisto del dispositivo: ");
            nuovoDispositivo.setPrezzoAcquisto(Double.parseDouble(scanner.nextLine()));
            System.out.println("Inserisci il prezzo di vendita del dispositivo: ");
            nuovoDispositivo.setPrezzoAcquisto(Double.parseDouble(scanner.nextLine()));
            System.out.println("Inserisci l' ID del dispositivo: ");
            nuovoDispositivo.setId(scanner.nextInt());
            System.out.println("Inserisci lo spazio di archiviazione: ");
            nuovoDispositivo.setMemoria(scanner.nextInt());
            System.out.println("Inserisci da dimensione del display:");
            nuovoDispositivo.setDisplay(scanner.nextInt());
            listaDispositivi.add(nuovoDispositivo);
            System.out.print("Desideri aggiungere un altro dispositivo? (sì/no): ");
            risposta = scanner.nextLine();
        } while (risposta.equalsIgnoreCase("si"));
        if (risposta.equals("no")) {
            scanner.close();
        }
    }
    public List<Dispositivi> stampaDispositivi(List<Dispositivi> listaDispositivi) {
        for (Dispositivi dispositivo : listaDispositivi) {
            if (dispositivo.getDispositivo() == null) {
                System.out.println("il dispositivo non è disponibile");
            }
            System.out.println("Totale dispositivi presenti: "+listaDispositivi.size());
        }
        return listaDispositivi;
    }

    public void ricercaProduttore(List<Dispositivi> listaDispositivi) {
        for (Dispositivi dispositivo : listaDispositivi) {
            if (dispositivo.getBrand() == null) {
                System.out.println("il dispositivo non è disponibile");
            }
            System.out.println(dispositivo.getBrand());
        }
    }

    public void ricercaModello(List<Dispositivi> listaDispositivi) {
        for (Dispositivi dispositivo : listaDispositivi) {
            if (dispositivo.getModello() == null) {
                System.out.println("il dispositivo non è disponibile");
            }
            System.out.println(dispositivo.getModello());
        }
    }

    /* Un metodo che permetta la ricerca per prezzo di vendita*/

    public List<Dispositivi> cercaPerPrezzo(List<Dispositivi> listaDispositivi, double prezzoDaCercare) {
        ArrayList<Dispositivi> dispositiviRicerca = new ArrayList<>();
        for (Dispositivi dispositivo : listaDispositivi) {
            if (dispositivo.getPrezzo() == prezzoDaCercare) {
                dispositiviRicerca.add(dispositivo);
            }
        }
        if (dispositiviRicerca.isEmpty()) {
            System.out.println("Nessun dispositivo trovato con il prezzo specificato.");

        }
        return dispositiviRicerca;
    }

    public List<Dispositivi> cercaPerPrezzoAcquisto(List<Dispositivi> listaDispositivi, double prezzoAcquistoDaCercare) {
        ArrayList<Dispositivi> dispositiviRicerca = new ArrayList<>();
        for (Dispositivi dispositivo : listaDispositivi) {
            if (dispositivo.getPrezzo() == prezzoAcquistoDaCercare) {
                dispositiviRicerca.add(dispositivo);
            }
        }
        if (dispositiviRicerca.isEmpty()) {
            System.out.println("Nessun dispositivo trovato con il prezzo di acquisto specificato.");
        }
        return dispositiviRicerca;
    }
    public  List<Dispositivi> cercaPerRangePrezzo(List<Dispositivi> listaDispositivi, double prezzoMin, double prezzoMax){
        List<Dispositivi> dispotiviDiRicerca = new ArrayList<>();
        for(Dispositivi dispositivo : listaDispositivi) {
            double prezzoDispotivo = dispositivo.getPrezzo();
            if (prezzoDispotivo >= prezzoMin && prezzoDispotivo <= prezzoMax) {
                dispotiviDiRicerca.add(dispositivo);
            }
        }

        if (dispotiviDiRicerca.isEmpty()) {
            System.out.println("Nessun dispositivo trovato nel range di prezzo specificato.");

        }
        return dispotiviDiRicerca;
    }


    public double calcolaSpesaMedia(List<Dispositivi> listaDispositivi){
        if (listaDispositivi.isEmpty()) {
            System.out.println("La lista dei dispositivi è vuota, impossibile calcolare la spesa media.");
            return 0.0;
        }
        double totaleSpesa = 0;
        for (Dispositivi dispositivo : listaDispositivi) {
            totaleSpesa += dispositivo.getPrezzo();
        }

        return totaleSpesa / listaDispositivi.size();

    }

}
