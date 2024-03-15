package builderprototype.model;

public class Clothing {
    private String name;
    private String description;
    private String category;
    private double price;
    private String color;

    public Clothing(String name, String description, String category, double price, String color) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.color = color;
    }

    public Clothing clone() {
        return new Clothing(this.name, this.description, this.category, this.price, this.color);
    }

    @Override
    public String toString() {
        return "Clothing [name=" + name + ", description=" + description
                + ", category=" + category + ", price=" + price + ", color=" + color + "]";
    }
}
