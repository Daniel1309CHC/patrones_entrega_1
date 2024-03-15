package builderprototype.director;

import builderprototype.builder.ProductBuilder;
public class Director {

    public ProductBuilder makeTV(ProductBuilder builder) {
        builder.buildName("TV Samsung 50'")
                .buildCategory("OLED")
                .buildDescription("Full color display to watch series and movies at home.")
                .buildPrice(1300);
        return builder;
    }

    public ProductBuilder makeShirt(ProductBuilder builder) {
        builder.buildName("Polo Shirt")
                .buildCategory("Short Sleeve")
                .buildDescription("The iconic mesh polo shirt - All Fits!")
                .buildPrice(100);
        return builder;
    }
}
