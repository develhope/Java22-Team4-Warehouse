import Magazzino.Magazzino;

import java.util.Scanner;
//TODO 1.AGGIUNGI ID ALLA LISTA DISPOSITIVI, AL MOMENTO STAMPA SOLO NULL; 2.TEST DEI METODI; 3.COME POSSO SPOSTARE TUTTO LO SCANNER IN UNA CLASSE CHE CONYTENGA METODI DI GESTIONE SENZA BLOCCARE TUTTO? 4. AGGIUNGERE ENUM DAVVERO?
public class Main {
    public static void main(String[] args) {
        Carrello carrello = new Carrello();
        Magazzino magazzino = new Magazzino();
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(carrello,magazzino,scanner);
        menu.avviaMenu();
    }
}
