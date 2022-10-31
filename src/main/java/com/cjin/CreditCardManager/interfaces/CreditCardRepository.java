package com.cjin.CreditCardManager.interfaces;


import com.cjin.CreditCardManager.account.CreditCardAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardRepository extends JpaRepository<CreditCardAccount,Long> {

}
