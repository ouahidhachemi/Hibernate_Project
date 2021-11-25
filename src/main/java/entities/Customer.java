package entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CLIENT")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID_CLIENT", nullable = false)
    private Long id;

    @Column(name = "NOM_CLIENT")
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ADRESSE")
    private Address address;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "FACTURE_CLIENT")
    private List<Invoice> invoices;

    public Customer() {}

    public Customer(String name) {
        this.name = name;
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
        return String.format("%n%nCustomer{id=%d, name='%s',%naddress=%s, %n%ninvoices=%s}", id, name, address, invoices);
    }

}
