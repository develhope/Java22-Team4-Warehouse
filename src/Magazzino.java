import Dispositivi.Dispositivi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Magazzino {

List<Dispositivi> dispositiviList = new ArrayList<>();

    public void aggiungiDispositiviConWhile(Scanner scanner1) {
        Scanner scanner = new Scanner(System.in);
        String risposta;

        Dispositivi nuovoDispositivo = new Dispositivi();
        do {
            System.out.print("Inserisci il brand del dispositivo: ");
            nuovoDispositivo.setBrand(scanner.nextLine());
            System.out.print("Inserisci il modello del dispositivo: ");
            nuovoDispositivo.setModello(scanner.nextLine());
            System.out.print("Inserisci il prezzo del dispositivo: ");
            nuovoDispositivo.setPrezzo(Double.parseDouble(scanner.nextLine()));
            System.out.print("Desideri aggiungere un altro dispositivo? (sì/no): ");
            dispositiviList.add(nuovoDispositivo);
            risposta = scanner.nextLine();
        } while (risposta.equalsIgnoreCase("si"));
//        Iterator<Dispositivi> iteratoreDispositivi = dispositiviList.iterator();
//        while (iteratoreDispositivi.hasNext()){
//            dispositiviList.add(nuovoDispositivo);
//        }

        if(risposta.equalsIgnoreCase("no")){
            scanner.close();
        }

    }
    public List<Dispositivi> stampaDispositivi(List<Dispositivi> listaDispositivi){
        for(Dispositivi dispositivo: listaDispositivi){
            if(dispositivo.getTipoDispositivo() == null){
                System.out.println("il dispositivo non è disponibile");
            }
        }
        return dispositiviList ;
    }

    public void ricercaProduttore(List<Dispositivi> listaDispositivi){
        for (Dispositivi dispositivo : listaDispositivi){
            if (dispositivo.getBrand() == null){
                System.out.println("il dispositivo non è disponibile");
            }
            System.out.println(dispositivo.getBrand());
        }
    }
    public void ricercaModello(List<Dispositivi> listaDispositivi){
        for (Dispositivi dispositivo : listaDispositivi){
            if (dispositivo.getModello() == null){
                System.out.println("il dispositivo non è disponibile");
            }
            System.out.println(dispositivo.getModello());
        }
    }
}
//
////    protected List<Dispositivi> listaDispositivi = new ArrayList<>();
////    Dispositivi dispositivo = new Dispositivi();
////    public void aggiungiDispositivoMagazzino(Dispositivi dispositivo){
//        Scanner scanner = new Scanner(System.in);
//        while(listaDispositivi.size()>=100){
//            System.out.println("Ciao magazziniere! Inserisci il tipo di dispositivo che vuoi inserire...");
//            dispositivo.setTipoDispositivo(scanner.nextLine());
//            System.out.println("Digita l'ID del tuo dispositivo.....");
//            dispositivo.setId(Long.parseLong(scanner.nextLine()));
//            System.out.println("Digita il modello del dispositivo.....");
//            dispositivo.setModello(scanner.nextLine());
//            System.out.println("Digita il produttore del dispositivo.....");
//            dispositivo.setBrand(scanner.nextLine());
//            System.out.println("Digita la descrizione del dispositivo.....");
//            dispositivo.setDescrizione(scanner.nextLine());
//            System.out.println("Digita la dimensione del display....");
//            dispositivo.setDisplay(String.valueOf(Integer.parseInt(scanner.nextLine())));
//            System.out.println("Digita la dimensione dello spazio di archiviazione del dispositivo....");
//            dispositivo.setMemoria(Integer.parseInt(scanner.nextLine()));
//            System.out.println("Digita il prezzo di acquisto.....");
//            dispositivo.setPrezzoAcquisto(Double.parseDouble(scanner.nextLine()));
//            System.out.println("Digita il prezzo di vendita.....");
//            dispositivo.setPrezzo(Double.parseDouble(scanner.nextLine()));
//            System.out.println("Grazie! A presto");
////        listaDispositivi.add(dispositivo);
////    }