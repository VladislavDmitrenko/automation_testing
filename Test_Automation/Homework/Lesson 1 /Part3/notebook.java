public class notebook extends TouchScreenDevice {
        
    
    public String producer;
	public String operatingSystem;
	public boolean isGPSModule;
   
    public notebook(String producer, String operatingSystem, boolean isGPSModule) {
        super(String type, double price, double screenSize,
			  int internalMemory, boolean isCamera, Boolean isSim,
			  boolean isWiFi);
        this.producer = producer;
		this.operatingSystem = operatingSystem;
		this.isGPSModule = isGPSModule;
    }   
        
   
    public void getProducer() {
        return producer;
    }   
    public void getOperatingSystem() {
        return operatingSystem;
    }
}