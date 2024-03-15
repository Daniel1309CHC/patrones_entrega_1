package builderprototype.builder;

import builderprototype.model.Clothing;

public class ClothingBuilder implements ProductBuilder{
    String name;
    String description;
    String category;
    double price;
    String color;

    @Override
    public ProductBuilder buildName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public ProductBuilder buildDescription(String description){
        this.description = description;
        return this;
    }

    @Override
    public ProductBuilder buildCategory(String category) {
        this.category = category;
        return this;
    }

    @Override
    public ProductBuilder buildPrice(double price) {
        this.price = price;
        return this;
    }

    public ProductBuilder buildColor(String color){
        this.color = color;
        return this;
    }

    public Clothing getResult() {
        return new Clothing(name, description, category, price, color);
    }
}