package prototype;

public class Main {
	
	public static void main(String[] args) {
		Product clothing = new Clothing();
		clothing.setName("Shirt");
		clothing.setDescription("Elegant Shirt");
		clothing.setPrice(50);
		clothing.setCategory("Outerwear");
		
		System.out.println("- Before -");
		System.out.println(clothing);
		
		System.out.println("- After -");
		Product clothing2 = clothing.clone();
		((Clothing) clothing2).setSize("M");
		((Clothing) clothing2).setColor("Grey");
		System.out.println("Clothing: " + clothing);
		System.out.println("Clothing2: " + clothing2);
		
		System.out.println("- Modified -");
		clothing.setPrice(100);
		System.out.println("Clothing: " + clothing);
		System.out.println("Clothing2: " + clothing2);
		
		
		Product electronic = new Electronic();
		electronic.setName("Tv");
		electronic.setDescription("TV 50'");
		electronic.setPrice(1200);

		
		System.out.println("- Before -");
		System.out.println(electronic);
		
		System.out.println("- After -");
		Product electronic2 = electronic.clone();
		((Electronic) electronic).setModel("2024");
		System.out.println("Electronic: " + electronic);
		System.out.println("Electronic2: " + electronic2);
		
		System.out.println("- Modified -");
		electronic.setDescription("TV 55'");
		System.out.println("Electronic: " + electronic);
		System.out.println("Electronic2: " + electronic2);
	}
}
