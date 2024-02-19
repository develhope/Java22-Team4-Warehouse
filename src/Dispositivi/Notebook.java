package Dispositivi;

public class Notebook extends Dispositivi{
    public Notebook(String dispositivo, String brand, int display, String modello, String descrizione, double prezzo, double memoria, double prezzoAcquisto) {
        super(dispositivo, brand, String.valueOf(display), modello, descrizione, prezzo, memoria, prezzoAcquisto);
    }
}
