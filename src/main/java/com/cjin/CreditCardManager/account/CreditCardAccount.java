package com.cjin.CreditCardManager.account;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CreditCardAccount {
    private @Id @GeneratedValue Long id;
    private String name;
    private String type;
    private String bank;

    CreditCardAccount() {}

    public CreditCardAccount(String creditCardName, String type, String bank) {
        this.name = creditCardName;
        this.type = type;
        this.bank = bank;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreditCardAccount that = (CreditCardAccount) o;

        if (!id.equals(that.id)) return false;
        if (!name.equals(that.name)) return false;
        if (!type.equals(that.type)) return false;
        return bank.equals(that.bank);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + bank.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "CreditCardAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", bank='" + bank + '\'' +
                '}';
    }
}
