//package Magazzino;
//
//import Dispositivi.Dispositivi;
//import Magazzino.*;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class GestioneMagazzino {
//    Magazzino magazzino = new Magazzino();
//    Scanner scanner = new Scanner(System.in);

//        try {
//            nuovoDispositivo.setPrezzoAcquisto(Double.parseDouble(scanner.nextLine()));
//        } catch (NumberFormatException e) {
//            System.out.println("Ops, hai digitato una lettera. Reinserisci il valore prestando attenzione a digitare solo cifre.");
//            System.out.print("Inserisci il prezzo di acquisto del dispositivo: ");
//            nuovoDispositivo.setPrezzoAcquisto(Double.parseDouble(scanner.nextLine()));
//        }
//
//        System.out.println("Inserisci il prezzo di vendita del dispositivo: ");
//        try {
//            nuovoDispositivo.setPrezzo(Double.parseDouble(scanner.nextLine()));
//        } catch (NumberFormatException e) {
//            System.out.println("Ops, hai digitato una lettera. Reinserisci il valore prestando attenzione a digitare solo cifre.");
//            System.out.print("Inserisci il prezzo di vendita del dispositivo: ");
//            nuovoDispositivo.setPrezzo(Double.parseDouble(scanner.nextLine()));
//        }
//        System.out.println("Inserisci lo spazio di archiviazione: ");
//        try {
//            nuovoDispositivo.setMemoria(scanner.nextInt());
//        } catch (NumberFormatException e) {
//            System.out.println("Ops, hai digitato una lettera. Reinserisci il valore prestando attenzione a digitare solo cifre.");
//            System.out.println("Inserisci lo spazio di archiviazione: ");
//            nuovoDispositivo.setMemoria(scanner.nextInt());
//        }
//        System.out.println("Inserisci da dimensione del display:");
//        try {
//            nuovoDispositivo.setDisplay(scanner.nextInt());
//        } catch (NumberFormatException e) {
//            System.out.println("Ops, hai digitato una lettera. Reinserisci il valore prestando attenzione a digitare solo cifre.");
//            System.out.println("Inserisci da dimensione del display:");
//            nuovoDispositivo.setDisplay(scanner.nextInt());
//        }
//    }
//}
