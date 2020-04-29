package Delivery.Entities;

import java.io.Serializable;
import java.util.Objects;

public class Address implements Serializable{
    private String country;
    private String town;
    private String street;
    private String house;

    public Address() {
    }

    public Address(String country, String town, String street, String house) {
        this.country = country;
        this.town = town;
        this.street = street;
        this.house = house;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getTown() {
        return town;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Address{");
        sb.append("country='").append(country).append('\'');
        sb.append(", town='").append(town).append('\'');
        sb.append(", street='").append(street).append('\'');
        sb.append(", house='").append(house).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
