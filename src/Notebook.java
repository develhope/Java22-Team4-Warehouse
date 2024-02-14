public class Notebook {
        private String tipoDispositivo;
        private String produttore;
        private String modello;
        private String descrizione;
        private String dimensioneDisplay;
        private String spazioArchiviazione;
        private String prezzoAcquisto;
        private String prezzoVendita;
        private String idDispositivo;
        public Notebook(String tipoDispositivo,String produttore, String modello,String descrizione,String dimensioneDisplay,String spazioArchiviazione,String prezzoAcquisto,String prezzoVendita, String idDispositivo){
            this.tipoDispositivo = tipoDispositivo;
            this.produttore = produttore;
            this.modello = modello;
            this.descrizione = descrizione;
            this.dimensioneDisplay = dimensioneDisplay;
            this.spazioArchiviazione = spazioArchiviazione;
            this.prezzoAcquisto = prezzoAcquisto;
            this.prezzoVendita = prezzoVendita;
            this.idDispositivo = idDispositivo;
        }

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
            return "Notebook{" +
                    "tipoDispositivo='" + tipoDispositivo + '\'' +
                    ", produttore='" + produttore + '\'' +
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
