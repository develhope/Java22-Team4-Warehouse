package InventoryClasses;

import java.util.ArrayList;

public class Devices extends Warehouse {
    private static String deviceName;
    private static int quantity;

    public Devices(String deviceName, int quantity) {
        this.deviceName = deviceName;
        this.quantity = quantity;
    }

    public static String getDeviceName() {
        return deviceName;
    }

    public static int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Devices{" +
                "deviceName='" + deviceName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
