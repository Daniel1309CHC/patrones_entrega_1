package builderprototype.model;

public class Electronic extends Product{
    private String model;

    public Electronic() {

    }

    public Electronic(Electronic target) {
        super(target);
        this.model = target.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Electronic clone() {
        return new Electronic(this);
    }

    @Override
    public String toString() {
        return "Electronic [name=" + this.getName() + ", description=" + this.getDescription()
                + ", category=" + this.getCategory() + ", price=" + this.getPrice() + ", model=" + model + "]";
    }
}
