public class SkiRunning extends Entertainment {
        
    
    public String nameOfSkiResort;
	public boolean isRental;
	public boolean isChairLifts;

   
    public SkiRunning(String nameOfSkiResort, boolean isRental, boolean isChairLifts) {
        super(String speciesOfEntertainments, double price, String placeOfEntertainments,
		Time timeOfEntertainments, int duration);
        this.nameOfSkiResort = nameOfSkiResort;
		this.isRental = isRental;
    }   
        
   
    public void getNameOfSkiResort() {
        return nameOfSkiResort;
    }   
    public void getIsRental() {
        return isRental;
    }
}