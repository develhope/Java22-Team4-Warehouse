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

    public void ricercaProduttore(List<Dispositivi> listaDispositivi){
        for (Dispositivi dispositivo : listaDispositivi){
            if (dispositivo.getBrand().equals(null)){
                System.out.println("il dispositivo non è disponibile");
            }
            System.out.println(dispositivo.getBrand());
        }
    }
    public void ricercaModello(List<Dispositivi> listaDispositivi){
        for (Dispositivi dispositivo : listaDispositivi){
            if (dispositivo.getModello().equals(null)){
                System.out.println("il dispositivo non è disponibile");
            }
            System.out.println(dispositivo.getModello());
        }
    }
}
