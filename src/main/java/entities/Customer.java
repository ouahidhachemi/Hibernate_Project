package entities;

import javax.persistence.*;

@Entity
@Table(name = "CLIENT")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CLIENT_ID", nullable = false)
    private long id;

    @Column(name = "CLIENT_NAME")
    private String name;

    @OneToOne
    private Address address;

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
}
