package Dispositivi;

import java.util.Scanner;
import java.util.UUID;

public class Dispositivi {
    private String dispositivo;
    private String brand;
    private String modello;
    private String descrizione;
    private String display;
    private String memoria;
    private Double prezzoAcquisto;
    private Double prezzoVendita;

    private String id;

    public Dispositivi(String dispositivo,
                         String brand,
                         String display,
                         String modello,
                         String descrizione,
                        double prezzoVendita,
                         String memoria,
                         double prezzoAcquisto) {
        this.id = UUID.randomUUID().toString();
        this.dispositivo = dispositivo;
        this.brand = brand;
        this.modello = modello;
        this.descrizione = descrizione;
        this.display = display;
        this.memoria = memoria;
        this.prezzoAcquisto = prezzoAcquisto;
        this.prezzoVendita = prezzoVendita;
    }
    public Dispositivi(Scanner scanner){
        this.id = UUID.randomUUID().toString();
        this.dispositivo = scanner.next();
        this.brand = scanner.next();
        this.modello = scanner.next();
        this.descrizione = scanner.next();
        this.display = scanner.next();
        this.memoria = scanner.next();
        this.prezzoAcquisto = Double.valueOf(scanner.next());
        this.prezzoVendita = Double.valueOf(scanner.next());
    }

    public Dispositivi() {}

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public Double getPrezzoAcquisto() {
        return prezzoAcquisto;
    }

    public void setPrezzoAcquisto(Double prezzoAcquisto) {
        this.prezzoAcquisto = prezzoAcquisto;
    }

    public Double getPrezzoVendita() {
        return prezzoVendita;
    }

    public void setPrezzoVendita(Double prezzoVendita) {
        this.prezzoVendita = prezzoVendita;
    }
//Autoincremento dell'id
    public String getId() {
        return id;
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
                        ", Prezzo d'Acquisto: " + prezzoAcquisto +" Euro " +
                        ", Prezzo di Vendita: " + prezzoVendita + " Euro "+
                        ", Id: " + id + "\n";
    }
}