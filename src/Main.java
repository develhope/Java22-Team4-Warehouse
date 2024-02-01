public class Main {
    public static void main(String[] args) {
        Smartphone smartphone1= new Smartphone("smartphone", "Samsung", "Galaxy S20",
                "Ultimo modello di Samsung", 6.2, 128, 799.99, 999.99, 12345);
        Notebook notebook1 = new Notebook("Notebook","HP","hp pro123","" +
                "un notebook di ultima generazione",12.7,223,207.88,370.30,4);
        Tablet tablet1 = new Tablet("Tablet","apple","SR123","è un tablet funzionale di ulrima generazione",
                12,300,800.99,978.78,9);
        System.out.println(smartphone1);
        System.out.println(notebook1);
        System.out.println(tablet1);

    }
}

