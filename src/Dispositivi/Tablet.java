package Dispositivi;

public class Tablet extends Dispositivi{
    public Tablet(String tipoDispositivo, String brand, int display, String modello, String descrizione, double prezzo, double memoria, double prezzoAcquisto) {
        super(tipoDispositivo, brand, Integer.parseInt(String.valueOf(display)), modello, descrizione, prezzo, memoria, prezzoAcquisto);
    }
}
