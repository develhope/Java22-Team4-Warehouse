package Magazzino;
import Dispositivi.Dispositivi;
import java.util.ArrayList;
import java.util.List;

public class Magazzino {

    public List<Dispositivi> listaDispositivi = new ArrayList<>();

    public List<Dispositivi> aggiungiDispositivi( Dispositivi nuovoDispositivo) {
        listaDispositivi.add(nuovoDispositivo);
        return listaDispositivi;
}

public List<Dispositivi> stampaDispositivi(List<Dispositivi> listaDispositivi) {
    return listaDispositivi;
}
//TODO: CAMBIO NOME METODO - SOSTITUZIONE METODO CON UNO SEMPLIFICATO CHE HA SOLO GETBRAND
public List<String> ricercaProduttore(List<Dispositivi> listaDispositivi) {
    String risposta = "";
    List<String> listaProduttori = new ArrayList<>();
    for (Dispositivi dispositivo : listaDispositivi) {
        if (dispositivo.getBrand().equalsIgnoreCase(risposta)) {
            listaProduttori.add(dispositivo.getBrand());
        } else {
            return null;
        }
    }
    return listaProduttori;
}

public List<Dispositivi> ricercaModello(List<Dispositivi> listaDispositivi) {
    for (Dispositivi dispositivo : listaDispositivi) {
        if (dispositivo.getModello() == null) {
            System.out.println("il dispositivo non è disponibile");
        }
        System.out.println(dispositivo.getModello());
    }
return listaDispositivi;
    }


public List<Dispositivi> cercaPerPrezzo(List<Dispositivi> listaDispositivi, double prezzoDaCercare) {
    List<Dispositivi> dispositiviRicerca = new ArrayList<>();
    for (Dispositivi dispositivo : listaDispositivi) {
        if (dispositivo.getPrezzoVendita() == prezzoDaCercare) {
            dispositiviRicerca.add(dispositivo);
        }
    }
    if (dispositiviRicerca.isEmpty()) {
        System.out.println("Nessun dispositivo trovato con il prezzo specificato.");

    }
    return dispositiviRicerca;
}

public List<Dispositivi> cercaPerPrezzoAcquisto(List<Dispositivi> listaDispositivi, double prezzoAcquistoDaCercare) {
    List<Dispositivi> dispositiviRicerca = new ArrayList<>();
    for (Dispositivi dispositivo : listaDispositivi) {
        if (dispositivo.getPrezzoVendita() == prezzoAcquistoDaCercare) {
            dispositiviRicerca.add(dispositivo);
        }
    }
    if (dispositiviRicerca.isEmpty()) {
        System.out.println("Nessun dispositivo trovato con il prezzo di acquisto specificato.");
    }
    return dispositiviRicerca;
}

public List<Dispositivi> cercaPerRangePrezzo(List<Dispositivi> listaDispositivi, double prezzoMin, double prezzoMax) {
    List<Dispositivi> dispotiviDiRicerca = new ArrayList<>();
    for (Dispositivi dispositivo : listaDispositivi) {
        double prezzoDispotivo = dispositivo.getPrezzoVendita();
        if (prezzoDispotivo >= prezzoMin && prezzoDispotivo <= prezzoMax) {
            dispotiviDiRicerca.add(dispositivo);
        }
    }

    if (dispotiviDiRicerca.isEmpty()) {
        System.out.println("Nessun dispositivo trovato nel range di prezzo specificato.");

    }
    return dispotiviDiRicerca;
}


public double calcolaSpesaMedia(List<Dispositivi> listaDispositivi) {
    if (listaDispositivi.isEmpty()) {
        System.out.println("La lista dei dispositivi è vuota, impossibile calcolare la spesa media.");
        return 0.0;
    }
    double totaleSpesa = 0;
    for (Dispositivi dispositivo : listaDispositivi) {
        totaleSpesa += dispositivo.getPrezzoVendita();
    }

    return totaleSpesa / listaDispositivi.size();

}

}
