import java.util.ArrayList;
import java.util.List;
import Dispositivi.*;
import Magazzino.Magazzino;

public class Carrello {
    public List<Dispositivi> listaCarrello;
    Magazzino magazzino = new Magazzino();
    Dispositivi dispositivo = new Dispositivi();
    Carrello carrello = new Carrello();
    public List<Dispositivi> getListaCarrello() {
        return this.listaCarrello;
    }
    public List<Dispositivi> aggiungiDispositivo(int id) {
        List<Dispositivi> listaCarrello = new ArrayList<>();
        for(Dispositivi dispositivo : magazzino.getListaDispositivi()){
            if(dispositivo.getId() == id){
                listaCarrello.add(dispositivo);
            }
        }
        return listaCarrello;
    }

    public List<Dispositivi> rimuoviDispositivoDalCarrello(String dispositivoDaRimuovere){
        if(dispositivoDaRimuovere.equalsIgnoreCase(dispositivo.getDispositivo())){
            listaCarrello.remove(dispositivo);
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

    public List<Dispositivi> svuotaCarrello() {
        listaCarrello.clear();
        return listaCarrello;
    }
}




