public class dress extends CustomerGoods {
        
    
    public boolean isSportswear ;
	public boolean isTravelClothing; 
	public color;

   
    public dress(boolean isSportswear, boolean isTravelClothing) {
        super(String name, Boolean isFood, Double price, Boolean delivery);
        this.isSportswear = isSportswear;
		this.isTravelClothing = isTravelClothing;
    }   
        
   
    public void getIsSportswear() {
        return isSportswear; 
    }   
    public void getIsTracelClothing() {
        return isTravelClothing;
    }
}