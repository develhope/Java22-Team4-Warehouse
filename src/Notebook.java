public class Notebook{

    private String tipoDispositivo;
    private String produttore;
    private String modello;
    private String descrizione;
    private double dimensioneDisplay;
    private double dimensioneArchiviazione;
    private double prezzoAcquisto;
    private double prezzoVendita;
    private int idDispositivo;
    public Notebook(String tipoDispositivo, String produttore, String modello, String descrizione,
                            double dimensioneDisplay, double dimensioneArchiviazione, double prezzoAcquisto,
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

    // Metodi getter e setter per gli attributi
    public String getTipoDispositivo() {
        return tipoDispositivo;
    }

    public void setTipoDispositivo(String tipoDispositivo) {
        this.tipoDispositivo = tipoDispositivo;
    }

    public String getProduttore() {
        return produttore;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
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

    public double getDimensioneDisplay() {
        return dimensioneDisplay;
    }

    public void setDimensioneDisplay(double dimensioneDisplay) {
        this.dimensioneDisplay = dimensioneDisplay;
    }

    public double getDimensioneArchiviazione() {
        return dimensioneArchiviazione;
    }

    public void setDimensioneArchiviazione(double dimensioneArchiviazione) {
        this.dimensioneArchiviazione = dimensioneArchiviazione;
    }

    public double getPrezzoAcquisto() {
        return prezzoAcquisto;
    }

    public void setPrezzoAcquisto(double prezzoAcquisto) {
        this.prezzoAcquisto = prezzoAcquisto;
    }

    public double getPrezzoVendita() {
        return prezzoVendita;
    }

    public void setPrezzoVendita(double prezzoVendita) {
        this.prezzoVendita = prezzoVendita;
    }

    public int getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(int idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    @Override
    public String toString() {
        return "Notebook{" +
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


