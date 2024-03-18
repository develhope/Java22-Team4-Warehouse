import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dispositivi.*;
import Magazzino.Magazzino;

public class GestioneDispositivi {
    public List<Dispositivi> listaProdotti;
    Magazzino magazzino = new Magazzino();
    public GestioneDispositivi() {
        listaProdotti = new ArrayList<>();
    }

    public void copiaElementi(List<Dispositivi> listaDispositivi) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleziona l'indice del prodotto da copiare:");
        int indiceProdotto = scanner.nextInt();

        if (indiceProdotto >= 0 && indiceProdotto < listaDispositivi.size()) {
            listaProdotti.add(magazzino.getListaDispositivi().get(indiceProdotto));
            System.out.println("Prodotto copiato con successo: " + magazzino.getListaDispositivi().get(indiceProdotto));
        } else {
            System.out.println("Indice del prodotto non valido.");
        }
    }

}
