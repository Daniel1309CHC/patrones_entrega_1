package builderprototype.model;

public class Electronic {
    private String name;
    private String description;
    private String category;
    private double price;
    private String model;

    public Electronic(String name, String description, String category, double price, String model) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.model = model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Electronic clone() {
        return new Electronic(this.name, this.description, this.category, this.price, this.model);
    }

    @Override
    public String toString() {
        return "Electronic [name=" + name + ", description=" + description
                + ", category=" + category + ", price=" + price + ", model=" + model + "]";
    }
}
