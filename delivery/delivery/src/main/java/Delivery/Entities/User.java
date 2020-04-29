package Delivery.Entities;

import Delivery.Collection.Gender;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private Integer age;
    private Gender gender;

    public User() {
    }

    public User(String email, String password, String firstName, String lastName, Integer age, Gender gender) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        User user = (User) other;
        return (this.getEmail().equals(user.getEmail()) & this.getPassword().equals(user.getPassword()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(email,password);
    }
}
