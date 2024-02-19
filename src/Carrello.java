import Dispositivi.Dispositivi;

import java.util.ArrayList;



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
    public boolean containsDeviceById(long id) {
        for (Dispositivi device : dispositivo) {
            if (device.getId() == id) {
                return true;
            }
        }
        return false;
    }

    // Controlla se il carrello e' vuoto
    public boolean isEmpty() {
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
    public double getFinalPrice() {
        double prezzoFinale = 0;
        for (Dispositivi dispositivo : dispositivo) {
            prezzoFinale += dispositivo.getPrezzo();
        }
        return prezzoFinale;
    }

    // Svuota carrello
    public void emptyList() {
        dispositivo.clear();
    }

    // Stampare elementi nel carrello
    public void printAllDevices() {
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