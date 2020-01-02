public class drums extends MusicInstruments {
        
    
    public boolean isElectronic;
	public boolean twoBassDrum; 
	public String producer;

   
    public drums(boolean isElectronic, boolean twoBassDrum) {
        super(String type, double price, String model, boolean isCase);
        this.isElectronic = isElectronic;
		this.twoBassDrum = twoBassDrum;
    }   
        
   
    public void setTwoBassDrum(boolean twoBassDrum) {
        this.twoBassDrum = twoBassDrum;
    }   
    public void getIsElectronic() {
        return isElectronic;
    }
}