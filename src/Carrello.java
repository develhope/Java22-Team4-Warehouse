import java.util.ArrayList;
import java.util.List;
import Dispositivi.*;

public class Carrello {
    public List<Dispositivi> listaDispositivi;

    public Carrello() {
        this.listaDispositivi = new ArrayList<>();
    }

    public void aggiungiDispositivo(Dispositivi dispositivo) {
        listaDispositivi.add(dispositivo);
        System.out.println("Dispositivo aggiunto al carrello: " + dispositivo.getModello());
    }

    public void rimuoviDispositivo(Dispositivi dispositivo) {
        if (listaDispositivi.remove(dispositivo)) {
            System.out.println("Dispositivo rimosso dal carrello: " + dispositivo.getModello());
        } else {
            System.out.println("Il dispositivo non è presente nel carrello");
        }
    }

    public double calcolaTotale() {
        double totale = 0;
        for (Dispositivi dispositivo : listaDispositivi) {
            totale += dispositivo.getPrezzo();
        }
        return totale;
    }

    public void svuotaCarrello() {
        listaDispositivi.clear();
        System.out.println("Carrello svuotato");
    }

    public void stampaElementiCarrello() {
        if (listaDispositivi.isEmpty()) {
            System.out.println("Il carrello è vuoto");
        } else {
            System.out.println("Elementi nel carrello:");
            for (Dispositivi dispositivo : listaDispositivi) {
                System.out.println(dispositivo.getModello());
            }
        }
    }
}


