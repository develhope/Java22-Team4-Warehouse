package Magazzino;
import Dispositivi.Dispositivi;
import java.util.ArrayList;
import java.util.List;
public class Magazzino {
    private List<Dispositivi> listaDispositivi = new ArrayList<>();
    public List<Dispositivi> getListaDispositivi() {
        return this.listaDispositivi;
    }
    //Metodo che permette l'aggiunta dei dispositivi al magazzino
    public List<Dispositivi> aggiungiDispositiviMagazzino(Dispositivi nuovoDispositivo) {
        listaDispositivi.add(nuovoDispositivo);
        return listaDispositivi;
    }
    //metodo di ricerca per produttore
    public List<Dispositivi> ricercaProduttore(String produttore) {
        List<Dispositivi> listaRisultato = new ArrayList<>();
        for (Dispositivi dispositivo : listaDispositivi) {
            if(dispositivo.getBrand().equalsIgnoreCase(produttore)){
                listaRisultato.add(dispositivo);
            }
        }
        return listaRisultato;
    }
    //metodo di ricerca per modello
    public List<Dispositivi> ricercaModello(String produttore) {
        List<Dispositivi> listaRisultato = new ArrayList<>();
        for (Dispositivi dispositivo : listaDispositivi) {
            if(dispositivo.getModello().equalsIgnoreCase(produttore)){
                listaRisultato.add(dispositivo);
            }
        }
        return listaRisultato;
    }

    //metodo di ricerca per prezzo di vendita

    public List<Dispositivi> cercaPerPrezzo(List<Dispositivi> listaDispositivi, double prezzoDaCercare) {
        List<Dispositivi> dispositiviRicerca = new ArrayList<>();
        for (Dispositivi dispositivo : listaDispositivi) {
            if (dispositivo.getPrezzoVendita() == prezzoDaCercare) {
                dispositiviRicerca.add(dispositivo);
            }
        }
        return dispositiviRicerca;
    }

    //metodo di ricerca per prezzo d'acquisto
    public List<Dispositivi> cercaPerPrezzoAcquisto(List<Dispositivi> listaDispositivi, double prezzoAcquistoDaCercare) {
        List<Dispositivi> dispositiviRicerca = new ArrayList<>();
        for (Dispositivi dispositivo : listaDispositivi) {
            if (dispositivo.getPrezzoAcquisto() == prezzoAcquistoDaCercare) {
                dispositiviRicerca.add(dispositivo);
            }
        }
        return dispositiviRicerca;
    }
    //metodo di ricerca per range di prezzo
    public List<Dispositivi> cercaPerRangePrezzo(List<Dispositivi> listaDispositivi, double prezzoMin, double prezzoMax) {
        List<Dispositivi> dispotiviDiRicerca = new ArrayList<>();
        for (Dispositivi dispositivo : listaDispositivi) {
            double prezzoDispotivo = dispositivo.getPrezzoVendita();
            if (prezzoDispotivo >= prezzoMin && prezzoDispotivo <= prezzoMax) {
                dispotiviDiRicerca.add(dispositivo);
            }
        }
        return dispotiviDiRicerca;
    }
    //metodo di calcolo della spesa media
    public double calcolaSpesaMedia(List<Dispositivi> listaDispositivi) {
        if (listaDispositivi.isEmpty()) {
            return 0.0;
        }
        double totaleSpesa = 0;
        for (Dispositivi dispositivo : listaDispositivi) {
            totaleSpesa += dispositivo.getPrezzoVendita();
        }
        return totaleSpesa / listaDispositivi.size();
    }
    //metodo che riempie il magazzino di base
    public void riempiMagazzino() {
        Dispositivi dispositivo = new Dispositivi();
        dispositivo.setId(dispositivo.autoIncrementoID(listaDispositivi));
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
        dispositivo2.setId(dispositivo.autoIncrementoID(listaDispositivi));
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
        dispositivo3.setId(dispositivo3.autoIncrementoID(listaDispositivi));
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
