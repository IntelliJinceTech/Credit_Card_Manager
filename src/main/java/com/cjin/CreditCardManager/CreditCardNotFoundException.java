package com.cjin.CreditCardManager;

public class CreditCardNotFoundException extends RuntimeException {
    public CreditCardNotFoundException(Long id) {
        super("Could not find credit card account " + id);
    }
}
