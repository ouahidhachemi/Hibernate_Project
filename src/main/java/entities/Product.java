package entities;

public class Product {

    private long id;
    private String name;
    private float unitPrice;

    protected Product(long id, String name, float unitPrice) {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return String.format("Product{id=%d, name='%s', unitPrice=%s}", id, name, unitPrice);
    }
}
