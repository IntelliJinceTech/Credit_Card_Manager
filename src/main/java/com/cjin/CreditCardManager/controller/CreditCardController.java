package com.cjin.CreditCardManager.controller;

import com.cjin.CreditCardManager.CreditCardNotFoundException;
import com.cjin.CreditCardManager.account.CreditCardAccount;
import com.cjin.CreditCardManager.interfaces.CreditCardRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CreditCardController {
    private final CreditCardRepository cCRepository;

    public CreditCardController(CreditCardRepository cCRepository) {
        this.cCRepository = cCRepository;
    }

    //Get Mapping --> return all credit cards
    @GetMapping("/creditcards")
    List<CreditCardAccount>all() {
        return cCRepository.findAll();
    }
    //Post Mapping --> New Credit card
    @PostMapping("/creditcards")
    CreditCardAccount newCreditCardAccount(@RequestBody CreditCardAccount newCreditCardAccount) {
        return cCRepository.save(newCreditCardAccount);
    }
    // Get Mapping for ID --> return creditcard by Id
    @GetMapping("/creditcards/{id}")
    CreditCardAccount one(@PathVariable Long id) {
        return cCRepository.findById(id)
                .orElseThrow(() -> new CreditCardNotFoundException(id));
    }

    CreditCardAccount replaceCreditCardAccount (@RequestBody CreditCardAccount newCreditCardAccount,@PathVariable Long id) {
        return cCRepository.findById(id)
                .map(creditCardAccount -> {
                    creditCardAccount.setBank(newCreditCardAccount.getBank());
                    creditCardAccount.setName(newCreditCardAccount.getName());
                    creditCardAccount.setType(newCreditCardAccount.getType());
                    return cCRepository.save(newCreditCardAccount);
                })
                .orElseGet(() -> {
                    newCreditCardAccount.setId(id);
                    return cCRepository.save(newCreditCardAccount);
                });
    }
}
