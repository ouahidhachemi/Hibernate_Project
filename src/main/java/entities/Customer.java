package entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CLIENT")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CLIENT_ID", nullable = false)
    private long id;

    @Column(name = "CLIENT_NAME")
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "CUSTOMER_INVOICES")
    private List<Invoice> invoices;

    public Customer() {}

    public Customer(String name) {
        this.name = name;
    }

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    @Override
    public String toString() {
        return String.format("Customer{id=%d, name='%s', address=%s, invoices=%s}", id, name, address, invoices);
    }

}
