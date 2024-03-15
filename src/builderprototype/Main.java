package builderprototype;

import builderprototype.builder.ClothingBuilder;
import builderprototype.builder.ElectronicBuilder;
import builderprototype.director.Director;
import builderprototype.model.Clothing;
import builderprototype.model.Electronic;

public class Main {
    public static void main(String[] args) {
        Director d = new Director();

        System.out.println("<-- Clothing -->");
        ClothingBuilder clothingBuilder = new ClothingBuilder();
        d.makeShirt(clothingBuilder);
        clothingBuilder.buildColor("White");
        Clothing clothing = clothingBuilder.getResult();
        System.out.println("- Before -");
        System.out.println(clothing);

        // Clone the Clothing object
        System.out.println("- After -");
        Clothing clothingClone = clothing.clone();
        clothingClone.setColor("Blue");
        System.out.println("OG: " + clothing);
        System.out.println("Clone: " + clothingClone);
        System.out.println("<-- End Clothing -->");


        System.out.println("<-- Electronic -->");
        ElectronicBuilder electronicBuilder = new ElectronicBuilder();
        d.makeTV(electronicBuilder);
        electronicBuilder.buildModel("2022");
        Electronic electronic = electronicBuilder.getResult();
        System.out.println("- Before -");
        System.out.println(electronic);

        // Clone the Electronic object
        System.out.println("- After -");
        Electronic electronicClone = electronic.clone();
        electronicClone.setModel("2024");
        System.out.println("OG: " + electronic);
        System.out.println("Clone: " + electronicClone);
        System.out.println("<--End Electronic -->");
    }
}
