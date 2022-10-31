package com.cjin.CreditCardManager.interfaces;

import com.cjin.CreditCardManager.account.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
