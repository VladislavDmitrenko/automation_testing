public class gamingSites extends Entertainment {
        
    
    public String webAddress;
	public String typeOfContent;
	public boolean isPaidContent;

   
    public gamingSites(String webAddress, String typeOfContent) {
        super(String speciesOfEntertainments, double price, String placeOfEntertainments,
		Time timeOfEntertainments, int duration);
        this.webAddress = webAddress;
		this.typeOfContent = typeOfContent;
    }   
        
   
    public void getTypeOfContent() {
        return typeOfContent;
    }   
    public void getWebAddress() {
        return webAddress;
    }
}