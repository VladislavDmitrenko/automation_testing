public class game extends Entertainment {
        
    
    public String nameOfToy;
	public boolean isInteractive;
	public boolean isSoftToy;

   
    public game(String nameOfToy, public boolean isInteractive) {
        super(String speciesOfEntertainments, double price, String placeOfEntertainments,
		Time timeOfEntertainments, int duration);
        this.nameOfToy = nameOfToy;
		this.isInteractive = isInteractive;
    }   
        
   
    public void getNameOfToy() {
        return nameOfToy;
    }   
    public void getIsInteractive() {
        return isInteractive;
    }
}