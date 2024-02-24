import java.util.ArrayList;
import java.util.List;
import Dispositivi.*;

public class Carrello {
    private List<Dispositivi> listaProdotti;

    public Carrello() {
        this.listaProdotti = new ArrayList<>();
    }

    public void aggiungiDispositivo(Dispositivi dispositivo) {
        listaProdotti.add(dispositivo);
        System.out.println("Dispositivo aggiunto al carrello: " + dispositivo.getModello());
    }

    public void rimuoviDispositivo(Dispositivi dispositivo) {
        if (listaProdotti.remove(dispositivo)) {
            System.out.println("Dispositivo rimosso dal carrello: " + dispositivo.getModello());
        } else {
            System.out.println("Il dispositivo non è presente nel carrello");
        }
    }

    public double calcolaTotale() {
        double totale = 0;
        for (Dispositivi dispositivo : listaProdotti) {
            totale += dispositivo.getPrezzo();
        }
        return totale;
    }

    public void svuotaCarrello() {
        listaProdotti.clear();
        System.out.println("Carrello svuotato");
    }

    public void stampaElementiCarrello() {
        if (listaProdotti.isEmpty()) {
            System.out.println("Il carrello è vuoto");
        } else {
            System.out.println("Elementi nel carrello:");
            for (Dispositivi dispositivo : listaProdotti) {
                System.out.println(dispositivo.getModello());
            }
        }
    }
}


