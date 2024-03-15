package builderprototype.builder;

public interface ProductBuilder {
    public ProductBuilder buildName(String name);
    public ProductBuilder buildDescription(String description);
    public ProductBuilder buildCategory(String category);
    public ProductBuilder buildPrice(double price);
}