public class Tablet{
    private String deviceType;
    private String deviceManufacturer;
    private String deviceModel;
    private String deviceDescription;
    private String screenSize;
    private String storageSize;
    private String purchasePrice;
    private String sellingPrice;
    private String deviceID;
    public Tablet(String deviceType,String deviceManufacturer, String deviceModel,String deviceDescription,String screenSize,String storageSize,String purchasePrice,String sellingPrice, String deviceID){
        this.deviceType = deviceType;
        this.deviceManufacturer = deviceManufacturer;
        this.deviceModel = deviceModel;
        this.deviceDescription = deviceDescription;
        this.screenSize = screenSize;
        this.storageSize = storageSize;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
        this.deviceID = deviceID;
    }
    //getter e setter
    public String getDeviceType() {
        return deviceType;
    }
    public String setDeviceType(){
        return getDeviceType();
    }

    public String getDeviceManufacturer() {
        return deviceManufacturer;
    }

    public String setDeviceManufacturer(){
        return getDeviceManufacturer();
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public String setDeviceModel() {
        return getDeviceModel();
    }

    public String getDeviceDescription() {
        return deviceDescription;
    }
    public String setDeviceDescription() {
        return getDeviceDescription();
    }

    public String getScreenSize() {
        return screenSize;
    }

    public String setScreenSize() {
        return getScreenSize();
    }

    public String getStorageSize() {
        return storageSize;
    }
    public String setStorageSize() {
        return getStorageSize();
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }
    public String setPurchasePrice() {
        return getPurchasePrice();
    }

    public String getSellingPrice() {
        return sellingPrice;
    }
    public String setSellingPrice() {
        return getSellingPrice();
    }

    public String getDeviceID() {
        return deviceID;
    }
    public String setDeviceID() {
        return getDeviceID();
    }
    //override
    @Override
    public String toString() {
        return "Tablet: \n" +
                "deviceType: " + deviceType + ", "+
                "deviceManufacturer: " + deviceManufacturer + ", " +
                "deviceModel: " + deviceModel + ", " +
                "deviceDescription: " + deviceDescription + ", " +
                "screenSize: " + screenSize +", " +
                "storageSize: " + storageSize +", " +
                "purchasePrice: " + purchasePrice +", " +
                "sellingPrice: " + sellingPrice +", " +
                "deviceID: " + deviceID +". "  ;
    }
}
