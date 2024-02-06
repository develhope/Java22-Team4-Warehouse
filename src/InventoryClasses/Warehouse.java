package InventoryClasses;

public class Warehouse{
    Inventory inventory = new Inventory();
    public void addDevice(Devices devices){
        inventory.add(devices);
    }
    //Un metodo per la stampa di tutti i dispositivi a magazzino.
    public void printInventory(){
        System.out.println("Devices present in warehouse: \n" );
        for(int i =0;i<addDevice();i++){
            System.out.println("Device: "+ Devices.getDeviceName());
            System.out.println("Quantity: "+ Devices.getQuantity());
        } if(Devices.getQuantity()==0){
            System.out.println("Devices: "+ Devices.getDeviceName()+ " Product not aviable!");
        }
    }

    private int addDevice() {
        return Devices.getQuantity();
    }
}

//
//Dovrà resitutire la lista di dispositivi frutto della
//ricerca o un errore nel caso in cui la ricerca non produca risultati

