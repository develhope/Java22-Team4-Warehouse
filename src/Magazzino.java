import Dispositivi.Dispositivi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Magazzino {

    protected List<Dispositivi> listaDispositivi = new ArrayList<>();

    public void aggiungiDispositivoMagazzino(Scanner scanner1){

        Scanner scanner = new Scanner(System.in);
        Dispositivi dispositivo = new Dispositivi();
        System.out.println("Ciao magazziniere! Inserisci il tipo di dispositivo che vuoi inserire...");
        dispositivo.setTipoDispositivo(scanner.nextLine());
        System.out.println("Digita l'ID del tuo dispositivo.....");
        dispositivo.setId(Long.parseLong(scanner.nextLine()));
        System.out.println("Digita il modello del dispositivo.....");
        dispositivo.setModello(scanner.nextLine());
        System.out.println("Digita il produttore del dispositivo.....");
        dispositivo.setBrand(scanner.nextLine());
        System.out.println("Digita la descrizione del dispositivo.....");
        dispositivo.setDescrizione(scanner.nextLine());
        System.out.println("Digita la dimensione del display....");
        dispositivo.setDisplay(String.valueOf(Integer.parseInt(scanner.nextLine())));
        System.out.println("Digita la dimensione dello spazio di archiviazione del dispositivo....");
        dispositivo.setMemoria(Integer.parseInt(scanner.nextLine()));
        System.out.println("Digita il prezzo di acquisto.....");
        dispositivo.setPrezzoAcquisto(Double.parseDouble(scanner.nextLine()));
        System.out.println("Digita il prezzo di vendita.....");
        dispositivo.setPrezzo(Double.parseDouble(scanner.nextLine()));
        System.out.println("Grazie! A presto");
        scanner.close();
        listaDispositivi.add(dispositivo);
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
