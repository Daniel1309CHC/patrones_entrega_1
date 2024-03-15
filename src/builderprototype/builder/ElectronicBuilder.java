package builderprototype.builder;

import builderprototype.model.Electronic;

public class ElectronicBuilder implements ProductBuilder {
    String name;
    String description;
    String category;
    double price;
    String model;

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

    public ProductBuilder buildModel(String model){
        this.model = model;
        return this;
    }

    public Electronic getResult() {
        return new Electronic(name, description, category, price, model);
    }
}
