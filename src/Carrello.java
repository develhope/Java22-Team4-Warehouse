
import java.util.ArrayList;
import Dispositivi.Dispositivi;




public class Carrello {
    private ArrayList<Dispositivi> dispositivo = new ArrayList<>();

    public Carrello() {
        this.dispositivo = new ArrayList<>();
    }


    // Aggiungere al carrello
    public void aggiungiDispositivo(Dispositivi dispositivo) {
        this.dispositivo.add(dispositivo);
    }

    // Rimuove dal carrello tramite ID
    public void rimuoviDispositivoid(long id) {
        for (int i = 0; i < dispositivo.size(); i++) {
            if (dispositivo.get(i).getId() == id) {
                dispositivo.remove(i);
                break;
            }
        }
    }

    // Controlla se l'id esiste
    public boolean idesistente(long id) {
        for (Dispositivi device : dispositivo) {
            if (device.getId() == id) {
                return true;
            }
        }
        return false;
    }

    // Controlla se il carrello e' vuoto
    public boolean carrellovuoto() {
        if(dispositivo.isEmpty()) {
            return true;
        }
        return false;

    }


    //Ottieni prodotto da ID
    public Dispositivi cercaProdottoid(long id) {
        for (int i = 0; i < dispositivo.size(); i++) {
            if (dispositivo.get(i).getId() == id) {
                return dispositivo.get(i);
            }
        }
        return null;
    }

    // Calcolare prezzo finale
    public double prezzofinale() {
        double prezzoFinale = 0;
        for (Dispositivi dispositivo : dispositivo) {
            prezzoFinale += dispositivo.getPrezzo();
        }
        return prezzoFinale;
    }

    // Svuota carrello
    public void listavuota() {
        dispositivo.clear();
    }

    // Stampare elementi nel carrello
    public void tuttidispositivi() {
        if (dispositivo.isEmpty()) {
            System.out.println("Il carrello è vuoto!");
        } else {
            System.out.println("Questo è il carrello:");
            for (int i = 0; i < dispositivo.size(); i++) {
                System.out.print(dispositivo.get(i));
            }
        }


    }
    }

