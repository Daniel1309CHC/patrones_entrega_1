package prototype;

public class Electronic extends Product{
	
	private String model;
	private String manufacturer;
	
	
	public Electronic() {
		
	}
	
	public Electronic(Electronic target) {
		super(target);
		this.model = target.model;
		this.manufacturer = target.manufacturer;
		
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	@Override
	public Electronic clone() {
		return new Electronic(this);
	}
	
	@Override
	public String toString() {
		return "Electronic model: " + model + " Manufacturer: " + manufacturer + " Name: " + this.getName() + " Description: " + this.getDescription() + " Price: " + this.getPrice() + " Category: " + this.getCategory();
	}
}
