public class device extends CustomerGoods {
        
    
    public String  producer;
	public double capacity;
	public boolean isWorkOnBatteries;

   
    public device(String producer, boolean isForBuilding) {
        super(String name, Boolean isFood, Double price, Boolean delivery);
        this.producer = producer;
		this.capacity = capacity;
    }   
        
   
    public void getProducer() {
        return producer;
    }   
    public void getCapacity() {
        return capacity;
    }
}