package Magazzino;

import Dispositivi.Dispositivi;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Magazzino {

    public List<Dispositivi> listaDispositivi = new ArrayList<>();

    public List<Dispositivi> aggiungiDispositivi(Dispositivi nuovoDispositivo) {
        listaDispositivi.add(nuovoDispositivo);
        return listaDispositivi;
    }

    public List<Dispositivi> stampaDispositivi(List<Dispositivi> listaDispositivi) {
        return listaDispositivi;
    }

    public List<Dispositivi> ricercaProduttore(String produttore) {
        List<Dispositivi> listaRisultato = new ArrayList<>();
        for (Dispositivi dispositivo : listaDispositivi) {
            if(dispositivo.getBrand().equalsIgnoreCase(produttore)){
                listaRisultato.add(dispositivo);
            }
        }
        return listaRisultato;
    }

    public List<Dispositivi> ricercaModello(String produttore) {
        List<Dispositivi> listaRisultato = new ArrayList<>();
        for (Dispositivi dispositivo : listaDispositivi) {
            if(dispositivo.getModello().equalsIgnoreCase(produttore)){
                listaRisultato.add(dispositivo);
            }
        }
        return listaRisultato;
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
