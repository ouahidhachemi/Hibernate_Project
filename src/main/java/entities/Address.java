package entities;

import javax.persistence.*;

@Entity
@Table(name = "ADRESSE")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ADRESSE", updatable = false, nullable = false)
    private Long addressId;

    @Column(name = "RUE")
    private String street;

    @Column(name = "NUMERO_APARTMENT")
    private String houseNumber;

    @Column(name = "CODE_POSTAL")
    private int zipCode;

    @Column(name = "VILLE")
    private String city;

    public Address() {
    }

    public Address(String street, String houseNumber, int zipCode, String city) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
        this.city = city;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return String.format("Address{id=%d, street='%s', houseNumber='%s', zipCode=%d, city='%s'}", addressId, street, houseNumber, zipCode, city);
    }
}
