public class Dispositivi {
    public enum TipoDispositivo{
        SMARTPHONE,
        TABLET,
        NOTEBOOK;
    }
    private static Enum TipoDispositivo;
    private String produttore;
    private String modello;
    private String descrizione;
    private String dimensioneDisplay;
    private String spazioArchiviazione;
    private String prezzoAcquisto;
    private String prezzoVendita;
    private String idDispositivo;
    public void Dispositivo(Enum TipoDispositivo, String produttore, String modello, String descrizione, String dimensioneDisplay, String spazioArchiviazione, String prezzoAcquisto, String prezzoVendita, String idDispositivo){
        this.TipoDispositivo = Dispositivi.TipoDispositivo;
        this.produttore = produttore;
        this.modello = modello;
        this.descrizione = descrizione;
        this.dimensioneDisplay = dimensioneDisplay;
        this.spazioArchiviazione = spazioArchiviazione;
        this.prezzoAcquisto = prezzoAcquisto;
        this.prezzoVendita = prezzoVendita;
        this.idDispositivo = idDispositivo;
    }

    public static Enum getTipoDispositivo() {
        return TipoDispositivo;
    }

    public static void setTipoDispositivo(String tipoDispositivo) {
        TipoDispositivo = tipoDispositivo;
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

    public String getDimensioneDisplay() {
        return dimensioneDisplay;
    }

    public void setDimensioneDisplay(String dimensioneDisplay) {
        this.dimensioneDisplay = dimensioneDisplay;
    }

    public String getSpazioArchiviazione() {
        return spazioArchiviazione;
    }

    public void setSpazioArchiviazione(String spazioArchiviazione) {
        this.spazioArchiviazione = spazioArchiviazione;
    }

    public String getPrezzoAcquisto() {
        return prezzoAcquisto;
    }

    public void setPrezzoAcquisto(String prezzoAcquisto) {
        this.prezzoAcquisto = prezzoAcquisto;
    }

    public String getPrezzoVendita() {
        return prezzoVendita;
    }

    public void setPrezzoVendita(String prezzoVendita) {
        this.prezzoVendita = prezzoVendita;
    }

    public String getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(String idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    @Override
    public String toString() {
        return "Dispositivi{" +
                "Tipo di dispositivo"+ Dispositivi.TipoDispositivo +
                "produttore='" + produttore + '\'' +
                ", modello='" + modello + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", dimensioneDisplay='" + dimensioneDisplay + '\'' +
                ", spazioArchiviazione='" + spazioArchiviazione + '\'' +
                ", prezzoAcquisto='" + prezzoAcquisto + '\'' +
                ", prezzoVendita='" + prezzoVendita + '\'' +
                ", idDispositivo='" + idDispositivo + '\'' +
                '}';
    }
}
