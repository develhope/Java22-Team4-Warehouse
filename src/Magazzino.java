import Dispositivi.Dispositivi;

import java.util.ArrayList;
import java.util.List;

public class Magazzino {

    private List<Dispositivi> listaDispositivi = new ArrayList<>();

    public void aggiungiDispositivoMagazzino(Dispositivi dispositivi){
        listaDispositivi.add(dispositivi);
    }

    public List<Dispositivi> stampaDispositivi(List<Dispositivi> listaDispositivi){
        for(Dispositivi dispositivo: listaDispositivi){
            if(dispositivo.getDispositivo().equals(null)){
                System.out.println("il dispositivo non è disponibile");
            }
        }
        return listaDispositivi;
    }

}
