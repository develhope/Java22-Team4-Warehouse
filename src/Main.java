import InventoryClasses.Devices;
import InventoryClasses.Warehouse;

public class Main {

    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("Notebook", "Apple Inc.", "MacBook Pro", "Apple M1", "13-inch", "8 GB", "1600.00 euro", "1800.00 euro", "ABCDE1234");
        Tablet tablet1 = new Tablet("Tablet", "Apple", "iPad Air", "iPad Air new generation", "11-inch", "4 GB", "599.00 euro", "799.00 euro", "FGHI5678");
        Smartphone smartphone1 = new Smartphone("Smartphone", "Apple", "iPhone 16", "iPhone 16 pro new generation", "7-inch", "265 GB", "1200.00 euro", "1400.00 euro", "LMNO91011");
        System.out.println(notebook1);
        System.out.println(tablet1);
        System.out.println(smartphone1);

        Warehouse warehouse = new Warehouse();
        warehouse.addDevice(new Devices(notebook1.getDeviceID(), 20));
        warehouse.addDevice(new Devices(tablet1.getDeviceID(), 31));
        warehouse.addDevice(new Devices(smartphone1.getDeviceID(), 6));
        warehouse.printInventory();
    }
}
