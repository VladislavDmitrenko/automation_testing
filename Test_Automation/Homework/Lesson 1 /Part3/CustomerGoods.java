
public class CustomerGoods {
	private long dateOfProducing; 
	private String countryProducing; 
	private long productShelLife; 
	private String nameTrademark; 
	private long barcode; 
	private String typeOfGoods; 
	private String brutto; 
	private int weight; 
	private String size; 
	private double netto; 
	private String color; 
	private int height; 

    public long setDateOfProducing(long newDateOfProducing){ 
    	return this.dateOfProducing = newDateOfProducing;
    }
    public long getDateOfProducing(){ 
    	return dateOfProducing;
    }
	public double getNetto() { 
		return netto;
	}
	public void setNetto(double netto) { 
		this.netto = netto;
	}
	public long getProductShelLife() { 
		return productShelLife;
	}
	public void setNetto(long productShelLife) {  
		this.productShelLife = productShelLife;
	}
	public String getNameTrademars() { 
		return getNameTrademark();
	}
	public void setNameTrademark1(String newNameTrademark){ 
		nameTrademark = newNameTrademark;
	}
	public long getBarcode() {  
		return barcode;
	}
	public void setBarcode(long newBarcode){ 
		barcode = newBarcode;
	}
	public String getTypeOfGoods() { 
		return typeOfGoods;
	}
	public void setTypeOfGoods(String newTypeOfGoods){ 
		typeOfGoods = newTypeOfGoods;
	}
	public String getBrutto() { 
		return brutto;
	}
	public void setBrutto(String newBrutto){  
		brutto = newBrutto;
	}
	public int getWeight() { 
		return weight;
	}
	public void setWeight(int newWeight){ 
		weight = newWeight;
	}
	@SuppressWarnings("unused")
	private String getSize() { 
		return size;
	}
	@SuppressWarnings("unused")
	private void setSize(final String newSize){ 
		size = newSize;
	}
	@SuppressWarnings("unused")
	private int getHeight() { 
		return height;
	}
	public String getColor() { 
		return color;
	}
	public void setColor(String newColor){ 
		color = newColor;
	}
	public String getCountryProducing() {
		return countryProducing;
	}
	public void setCountryProducing(String countryProducing) {
		this.countryProducing = countryProducing;
	}
	public String getNameTrademark() {
		return nameTrademark;
	}
	public void setNameTrademark(String nameTrademark) {
		this.nameTrademark = nameTrademark;
	}
}