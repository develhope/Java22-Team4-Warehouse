import java.util.ArrayList;
import java.util.List;

import Dispositivi.*;
import Magazzino.*;

public class Carrello {
    public List<Dispositivi> listaCarrello = new ArrayList<>();
    Magazzino magazzino = new Magazzino();
    Dispositivi dispositivo = new Dispositivi();

    public List<Dispositivi> getListaCarrello() {
        return this.listaCarrello;
    }

    public List<Dispositivi> ricercaPerProduttore(List<Dispositivi> listaDispositivi, String nomeProduttore) {
        List<Dispositivi> listaProduttori = new ArrayList<>();
        for (Dispositivi dispositivo : listaDispositivi) {
            if (dispositivo.getBrand().equalsIgnoreCase(nomeProduttore)) {
                listaProduttori.add(dispositivo);
            }
        }
        return listaProduttori;
    }

    public List<Dispositivi> aggiungiDispositivo(List<Dispositivi> listaDispositivi, int id) {
        for (Dispositivi dispositivo : listaDispositivi) {
            if (dispositivo.getId() == id) {
                listaCarrello.add(dispositivo);
                magazzino.getListaDispositivi().remove(dispositivo);
            }
        }
        return listaCarrello;
    }

    public List<Dispositivi> rimuoviDispositivoDalCarrello(List<Dispositivi> listaDispositivi, String dispositivoDaRimuovere) {
        for (Dispositivi dispositivo : listaDispositivi) {
            if (dispositivo.getDispositivo().equalsIgnoreCase(dispositivoDaRimuovere)) {
                listaCarrello.remove(dispositivo);
                magazzino.getListaDispositivi().add(dispositivo);
            }
        }
        return listaCarrello;
    }

    public double calcolaTotale() {
        double totale = 0;
        for (Dispositivi dispositivo : listaCarrello) {
            totale += dispositivo.getPrezzoVendita();
        }
        return totale;
    }

    public List<Dispositivi> svuotaCarrello(List<Dispositivi> listaCarrello) {
        listaCarrello.clear();
        return listaCarrello;
    }
}




