package prototype;

public class Clothing extends Product{
	
	private String size;
	private String color;
	
	
	public Clothing() {
		
	}
	
	public Clothing(Clothing target) {
		super(target);
		this.size = target.size;
		this.color = target.color;
		
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public Clothing clone() {
		return new Clothing(this);
	}
	
	@Override
	public String toString() {
		return "Clothing size: " + size + " Color: " + color + " Name: " + this.getName() + " Description: " + this.getDescription() + " Price: " + this.getPrice() + " Category: " + this.getCategory();
	}
	
	
	
}
