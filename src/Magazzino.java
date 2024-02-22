import Dispositivi.Dispositivi;

import java.util.ArrayList;
import java.util.List;

public class Magazzino {

    private List<Dispositivi> listaDispositivi = new ArrayList<>();

    //un metodo che aggiunge i dispositivi a magazzino
    public void aggiungiDispositivoMagazzino(Dispositivi dispositivi) {
        listaDispositivi.add(dispositivi);
    }

    //Un metodo che stampa i dispositivi del magazzino
    public List<Dispositivi> stampaDispositivi(List<Dispositivi> listaDispositivi) {
        for (Dispositivi dispositivo : listaDispositivi) {
            if (dispositivo.getDispositivo().equals(null)) {
                System.out.println("il dispositivo non è disponibile");
            }
        }
        return listaDispositivi;
    }

    //Un metodo che esegue una ricerca per produttore e genera un messaggio se il dispositivo non è presente
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

    /* Un metodo che permetta la ricerca per prezzo di vendita
      o un errore nel caso in cui la ricerca non produca risultati.*/
    public ArrayList<Dispositivi> cercaPerPrezzo(ArrayList<Dispositivi> listaDispositivi, double prezzoDaCercare) {
        ArrayList<Dispositivi> dispositiviRicerca = new ArrayList<>();
        for (Dispositivi dispositivo : listaDispositivi) {
            if (dispositivo.getPrezzo() == prezzoDaCercare) {
                dispositiviRicerca.add(dispositivo);
            }
        }
        return dispositiviRicerca;
    }


    /* Un metodo che permetta la ricerca per prezzo di vendita
      Dovrà resitutire la lista di dispositivi frutto della ricerca
      o un errore nel caso in cui la ricerca non produca risultati.*/
    public ArrayList<Dispositivi> cercaPerPrezzo(ArrayList<Dispositivi> listaDispositivi, double prezzoDaCercare) {
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

    public ArrayList<Dispositivi> cercaPerPrezzoAcquisto(ArrayList<Dispositivi> listaDispositivi, double prezzoAcquistoDaCercare) {
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
    public  ArrayList<Dispositivi> cercaPerRangePrezzo(ArrayList<Dispositivi> listaDispositivi, double prezzoMin, double prezzoMax){
        ArrayList<Dispositivi> dispotiviDiRicerca = new ArrayList<>();
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


    }

    public static double calcolaSpesaMedia(ArrayList<Dispositivi> listaDispositivi) {
    public static double calcolaSpesaMedia(ArrayList<Dispositivi> listaDispositivi){
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

    @Override
    public String toString() {
        return "Magazzino{" +
                "listaDispositivi=" + listaDispositivi +
                '}';
    }
}









