package entities;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PRODUIT", updatable = false, nullable = false)
    private Long id;

    @Column(name = "NOM_PRODUIT")
    private String name;

    @Column(name = "PRIX_PRODUIT")
    private float unitPrice;

    public Product() {}

    public Product(String name, float unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
