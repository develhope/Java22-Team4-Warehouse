package Dispositivi;

import java.util.Objects;

public class Dispositivi {
    private String dispositivo;
    private String brand;
    private String modello;
    private String descrizione;
    private int display;
    private double memoria;
    private double prezzoAcquisto;
    private double prezzo;

    private long id;

    public Dispositivi(String dispositivo,
                         String brand,
                         int display,
                         String modello,
                         String descrizione,
                        double prezzo,
                         double memoria,
                         double prezzoAcquisto) {
        this.dispositivo = dispositivo;
        this.brand = brand;
        this.modello = modello;
        this.descrizione = descrizione;
        this.display = display;
        this.memoria = memoria;
        this.prezzoAcquisto = prezzoAcquisto;
        this.prezzo = prezzo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setDisplay(int display) {
        this.display = display;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public void setPrezzoAcquisto(double prezzoAcquisto) {
        this.prezzoAcquisto = prezzoAcquisto;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public String getBrand() {
        return brand;
    }

    public String getModello() {
        return modello;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getDisplay() {
        return display;
    }

    public double getMemoria() {
        return memoria;
    }

    public double getPrezzoAcquisto() {
        return prezzoAcquisto;
    }

    public double getPrezzo() {
        return prezzo;
    }


    @Override
    public String toString() {
        return
                "Device: " + dispositivo +
                        ", Brand: " + brand +
                        ", Modello: " + modello +
                        ", Descrizione: " + descrizione +
                        ", Display: " + display +
                        ", Memoria: " + memoria +
                        ", Prezzo d'Acquisto " + prezzoAcquisto +
                        ", Prezzo: " + prezzo +
                        ", Id: " + id + "\n";
    }


}