package entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Map;

@Entity
@Table(name = "FACTURE")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FACTURE", updatable = false, nullable = false)
    private Long id;

    @Column(name = "DATE_FACTURE")
    private LocalDate date;

    @ElementCollection
    @Column(name = "PRODUIT_FACTURE")
    private Map<Product, Integer> productQuantity;

    @Column(name = "TOTAL_FACTURE")
    private float totalPrice;

    public Invoice() {
        this.date = LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Map<Product, Integer> getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Map<Product, Integer> productQuantity) {
        this.productQuantity = productQuantity;
        this.productQuantity.forEach((product, quantity) -> this.totalPrice += product.getUnitPrice() * quantity);
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return String.format("%n%nFacture : {id=%d, date=%s,%nproductQuantity=%s, %ntotalPrice=%s}", id, date, productQuantity, totalPrice);
    }
}
