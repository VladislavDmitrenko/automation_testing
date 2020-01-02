public class telephone extends TouchScreenDevice {
        
    
    public String producer;
	public String typeOfNetwork;
	public boolean isSupportExternalMemory;
   
    public telephone(String producer, String typeOfNetwork,
					  boolean isSupportExternalMemory) {
        super(String type, double price, double screenSize,
			  int internalMemory, boolean isCamera, Boolean isSim,
			  boolean isWiFi);
        this.producer = producer;
		this.typeOfNetwork = typeOfNetwork;
		this.isSupportExternalMemory = isSupportExternalMemory;
    }   
        
   
    public void getProducer() {
        return producer;
    }   
    public void getTypeOfNetwork() {
        return typeOfNetwork;
    }
}