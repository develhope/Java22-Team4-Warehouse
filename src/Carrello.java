import java.util.ArrayList;
import java.util.List;
import Dispositivi.*;
import Magazzino.Magazzino;

public class Carrello {
    public List<Dispositivi> listaProdotti;

    public Carrello() {
        this.listaProdotti = new ArrayList<>();
    }
    Magazzino magazzino = new Magazzino();
    public String aggiungiDispositivo(Dispositivi dispositivo) {
        magazzino.getListaDispositivi().add(dispositivo);
        return "Dispositivo aggiunto al carrello: " + dispositivo.getModello();
    }

    public String rimuoviDispositivo(Dispositivi dispositivo) {
        if (listaProdotti.remove(dispositivo)) {
            return "Dispositivo rimosso dal carrello: " + dispositivo.getModello();
        } else {
            return "Il dispositivo non è presente nel carrello";
        }
    }

    public double calcolaTotale() {
        double totale = 0;
        for (Dispositivi dispositivo : listaProdotti) {
            totale += dispositivo.getPrezzoVendita();
        }
        return totale;
    }

    public String svuotaCarrello() {
        listaProdotti.clear();
        return "Carrello svuotato";
    }

    public List<String> stampaElementiCarrello() {
        List<String> modelliDispositivi = new ArrayList<>();

        if (listaProdotti.isEmpty()) {
            modelliDispositivi.add("Il carrello è vuoto");
        } else {
            modelliDispositivi.add("Elementi nel carrello:");
            for (Dispositivi dispositivo : listaProdotti) {
                modelliDispositivi.add(dispositivo.getModello());
            }
        }

        return modelliDispositivi;
    }
}




