package builderprototype.model;

public class Clothing extends Product{
    private String color;

    public Clothing () {

    }

    public Clothing(Clothing target) {
        super(target);
        this.color = target.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Clothing clone() {
        return new Clothing(this);
    }

    @Override
    public String toString() {
        return "Clothing [name=" + this.getName() + ", description=" + this.getDescription()
                + ", category=" + this.getCategory() + ", price=" + this.getPrice() + ", color=" + color + "]";
    }
}
