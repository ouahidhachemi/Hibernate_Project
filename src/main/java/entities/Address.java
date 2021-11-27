package entities;

import javax.persistence.*;

import static java.lang.String.format;

@Embeddable
@Table(name = "ADRESSE")
public class Address {

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
        return format("Address{street='%s', houseNumber='%s', zipCode=%d, city='%s'}", street, houseNumber, zipCode, city);
    }
}
