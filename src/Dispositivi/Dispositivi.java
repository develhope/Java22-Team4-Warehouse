package Dispositivi;

import java.util.Scanner;

public class Dispositivi {

    private String tipoDispositivo;
    private String brand;
    private String modello;
    private String descrizione;
    private String display;
    private double memoria;
    private double prezzoAcquisto;
    private double prezzo;

    private long id;

    public Dispositivi(String tipoDispositivo,
                       String brand,
                       String display,
                       String modello,
                       String descrizione,
                       double prezzo,
                       double memoria,
                       double prezzoAcquisto) {
        this.tipoDispositivo = tipoDispositivo;
        this.brand = brand;
        this.modello = modello;
        this.descrizione = descrizione;
        this.display = display;
        this.memoria = memoria;
        this.prezzoAcquisto = prezzoAcquisto;
        this.prezzo = prezzo;
    }
    public Dispositivi(Scanner scanner){
        this.tipoDispositivo = scanner.next();
        this.brand = scanner.next();
        this.modello = scanner.next();
        this.descrizione = scanner.next();
        this.display = String.valueOf(Integer.parseInt(scanner.next()));
        this.memoria = Double.parseDouble(scanner.next());
        this.prezzoAcquisto = Double.parseDouble(scanner.next());
        this.prezzo = Double.parseDouble(scanner.next());
    }

    public Dispositivi() {}



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipoDispositivo() {
        return tipoDispositivo;
    }

    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }

    public void setTipoDispositivo(String tipoDispositivo) {
        this.tipoDispositivo = tipoDispositivo;
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

    public void setDisplay(String display) {
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
        return tipoDispositivo;
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

    public String getDisplay() {
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
                "Device: " + tipoDispositivo +
                        ", Brand: " + brand +
                        ", Modello: " + modello +
                        ", Descrizione: " + descrizione +
                        ", Display: " + display + " pollici" +
                        ", Memoria: " + memoria + " GB" +
                        ", Prezzo d'Acquisto " + prezzoAcquisto + " Euro" +
                        ", Prezzo: " + prezzo + " Euro" +
                        ", Id: " + id + "\n";
    }


}