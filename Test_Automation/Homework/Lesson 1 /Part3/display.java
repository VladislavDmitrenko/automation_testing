public class display extends TouchScreenDevice {
        
    
    public String producer;
	public String model;
	public boolean isPowerSavingMode;
   
    public display(String producer, String model, boolean isPowerSavingMode) {
        super(String type, double price, double screenSize,
			  int internalMemory, boolean isCamera, Boolean isSim,
			  boolean isWiFi);
        this.producer = producer;
		this.model = model;
		this.isPowerSavingMode = isPowerSavingMode;
    }   
        
   
    public void getProducer() {
        return producer;
    }   
    public void getIsPowerSavingMode() {
        return isPowerSavingModel;
    }
}