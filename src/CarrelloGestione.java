import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarrelloGestione {
    public static void main(String[] args) {
        List<String> magazzino = new ArrayList<>();
        List<String> carrello = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Operazioni disponibili:");
            System.out.println("1. Aggiungi dispositivo al carrello");
            System.out.println("2. Rimuovi dispositivo dal carrello");
            System.out.println("3. Mostra carrello");
            System.out.println("4. Mostra dispositivi in magazzino");
            System.out.println("0. Esci");
            System.out.print("Seleziona un'operazione: ");
            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci il nome del dispositivo da aggiungere al carrello: ");
                    String dispositivoDaAggiungere = scanner.next();
                    if (magazzino.contains(dispositivoDaAggiungere)) {
                        carrello.add(dispositivoDaAggiungere);
                        magazzino.remove(dispositivoDaAggiungere);
                        System.out.println("Dispositivo aggiunto al carrello.");
                    } else {
                        System.out.println("Il dispositivo non è disponibile in magazzino.");
                    }
                    break;
                case 2:
                    System.out.print("Inserisci il nome del dispositivo da rimuovere dal carrello: ");
                    String dispositivoDaRimuovere = scanner.next();
                    if (carrello.contains(dispositivoDaRimuovere)) {
                        carrello.remove(dispositivoDaRimuovere);
                        magazzino.add(dispositivoDaRimuovere);
                        System.out.println("Dispositivo rimosso dal carrello.");
                    } else {
                        System.out.println("Il dispositivo non è nel carrello.");
                    }
                    break;
                case 3:
                    System.out.println("Dispositivi nel carrello:");
                    for (String dispositivo : carrello) {
                        System.out.println(dispositivo);
                    }
                    break;
                case 4:
                    System.out.println("Dispositivi in magazzino:");
                    for (String dispositivo : magazzino) {
                        System.out.println(dispositivo);
                    }
                    break;
                case 0:
                    System.out.println("Grazie per aver utilizzato il programma di gestione del carrello.");
                    return;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }
    }
}



