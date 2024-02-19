package Dispositivi;

public class Tablet extends Dispositivi{
    public Tablet(String dispositivo, String brand, int display, String modello, String descrizione, double prezzo, double memoria, double prezzoAcquisto) {
        super(dispositivo, brand, String.valueOf(display), modello, descrizione, prezzo, memoria, prezzoAcquisto);
    }
}
