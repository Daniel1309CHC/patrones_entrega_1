package builderprototype;

import builderprototype.builder.ClothingBuilder;
import builderprototype.builder.ElectronicBuilder;
import builderprototype.director.Director;
import builderprototype.model.Clothing;
import builderprototype.model.Electronic;

public class Main {
    public static void main(String[] args) {
        Director d = new Director();

        ClothingBuilder clothingBuilder = new ClothingBuilder();
        d.makeShirt(clothingBuilder);
        clothingBuilder.buildColor("White");
        Clothing clothing = clothingBuilder.getResult();
        System.out.println(clothing);

        // Clona el objeto
        Clothing clothing1 = clothing.clone();
        ClothingBuilder clothingBuilder1 = new ClothingBuilder();
        System.out.println(clothing1.toString());

        ElectronicBuilder electronicBuilder = new ElectronicBuilder();
        d.makeTV(electronicBuilder);
        electronicBuilder.buildModel("2022");
        Electronic electronic = electronicBuilder.getResult();
        System.out.println(electronic);

        // Clona el objeto
        Electronic electronic1 = electronic.clone();
        System.out.println(electronic1.toString());
    }
}
