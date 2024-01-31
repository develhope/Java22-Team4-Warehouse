public class Smartphone {
    private String tipoDispositivo;
    private String produttore;
    private String modello;
    private String descrizione;
    double dimensioneDisplay;
    int dimensioneArchiviazione;
    double prezzoAcquisto;
    double prezzoVendita;
    int idDispositivo;
    public Smartphone(String tipoDispositivo, String produttore, String modello, String descrizione,
                      double dimensioneDisplay, int dimensioneArchiviazione, double prezzoAcquisto,
                      double prezzoVendita, int idDispositivo) {
        this.tipoDispositivo = tipoDispositivo;
        this.produttore = produttore;
        this.modello = modello;
        this.descrizione = descrizione;
        this.dimensioneDisplay = dimensioneDisplay;
        this.dimensioneArchiviazione = dimensioneArchiviazione;
        this.prezzoAcquisto = prezzoAcquisto;
        this.prezzoVendita = prezzoVendita;
        this.idDispositivo = idDispositivo;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "tipoDispositivo='" + tipoDispositivo + '\'' +
                ", produttore='" + produttore + '\'' +
                ", modello='" + modello + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", dimensioneDisplay=" + dimensioneDisplay +
                ", dimensioneArchiviazione=" + dimensioneArchiviazione +
                ", prezzoAcquisto=" + prezzoAcquisto +
                ", prezzoVendita=" + prezzoVendita +
                ", idDispositivo=" + idDispositivo +
                '}';
    }
}

