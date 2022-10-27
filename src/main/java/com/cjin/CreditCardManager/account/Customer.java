package com.cjin.CreditCardManager.account;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Customer {
    private @Id @GeneratedValue Long id;
    private String name;
    private String creditRating;

    Customer() {}

    public Customer(String name, String creditRating) {
        this.name = name;
        this.creditRating = creditRating;
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

    public String getCreditRating() {
        return creditRating;
    }

    public void setCreditRating(String creditRating) {
        this.creditRating = creditRating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (!id.equals(customer.id)) return false;
        if (!name.equals(customer.name)) return false;
        return creditRating.equals(customer.creditRating);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + creditRating.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creditRating='" + creditRating + '\'' +
                '}';
    }
}
