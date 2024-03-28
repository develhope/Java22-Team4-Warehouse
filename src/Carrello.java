import java.util.ArrayList;
import java.util.Iterator;
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

    //    public List<Dispositivi> rimuoviDispositivoDalCarrello(String dispositivoDaRimuovere) {
//        List<Dispositivi> listaRimozione = this.listaCarrello;
//        if (listaRimozione.size() > 0) {
//            for (Dispositivi dispositivo : listaRimozione) {
//                if (dispositivo.getDispositivo().equalsIgnoreCase(dispositivoDaRimuovere)) {
//                    listaRimozione.remove(dispositivo);
//                    magazzino.getListaDispositivi().add(dispositivo);
//                }
//            }
//        }
//        return listaRimozione;
//    }
    public List<Dispositivi> rimuoviDispositivoDalCarrello(String dispositivoDaRimuovere) {
        Iterator<Dispositivi> iteratoreRimozione = this.listaCarrello.iterator();
        while(iteratoreRimozione.hasNext()){
            Dispositivi dispositivo = iteratoreRimozione.next();
            if(dispositivo.getDispositivo().equalsIgnoreCase(dispositivoDaRimuovere)){
                iteratoreRimozione.remove();
                magazzino.getListaDispositivi().add(dispositivo);
            }
        }
        return this.listaCarrello;
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




