public class piano extends MusicInstruments {
        
    
    public boolean isElectronic;
	public String hullMaterial; 
	public String producer;

   
    public piano(boolean isElectronic, String hullMaterial) {
        super(String type, double price, String model, boolean isCase);
        this.isElectronic = isElectronic;
		this.hullMaterial = hullMaterial;
    }   
        
   
    public void setHullMaterial(String hullMaterial) {
        this.hullMaterial = hullMaterial;
    }   
    ublic void getIsElectronic() {
        return isElectronic;
    }
}