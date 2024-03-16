package Magazzino;
import Dispositivi.Dispositivi;
import java.util.ArrayList;
import java.util.List;

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

    public void riempiMagazzino() {
        Dispositivi dispositivo = new Dispositivi();
        dispositivo.setId(1);
        dispositivo.setBrand("Samsung");
        dispositivo.setDispositivo("Tablet");
        dispositivo.setModello("Galaxy");
        dispositivo.setDisplay("9 pollici");
        dispositivo.setMemoria("125 GB");
        dispositivo.setDescrizione("Grigio");
        dispositivo.setPrezzoAcquisto(799.00);
        dispositivo.setPrezzoVendita(900.00);
        this.listaDispositivi.add(dispositivo);
        Dispositivi dispositivo2 = new Dispositivi();
        dispositivo2.setId(2);
        dispositivo2.setBrand("Apple");
        dispositivo2.setDispositivo("Smartphone");
        dispositivo2.setModello("iPhone 12");
        dispositivo2.setDisplay("9 pollici");
        dispositivo2.setMemoria("125 GB");
        dispositivo2.setDescrizione("bianco");
        dispositivo2.setPrezzoAcquisto(899.00);
        dispositivo2.setPrezzoVendita(1900.00);
        this.listaDispositivi.add(dispositivo2);
        Dispositivi dispositivo3 = new Dispositivi();
        dispositivo3.setId(3);
        dispositivo3.setBrand("Asus");
        dispositivo3.setDispositivo("Notebook");
        dispositivo3.setModello("Laptop");
        dispositivo3.setDisplay("14 pollici");
        dispositivo3.setMemoria("16 GB");
        dispositivo3.setDescrizione("Grigio");
        dispositivo3.setPrezzoAcquisto(799.00);
        dispositivo3.setPrezzoVendita(999.00);
        this.listaDispositivi.add(dispositivo3);
    }
}
