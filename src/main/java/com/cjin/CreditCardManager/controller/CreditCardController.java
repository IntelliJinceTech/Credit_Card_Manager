package com.cjin.CreditCardManager.controller;

import com.cjin.CreditCardManager.interfaces.CreditCardRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditCardController {
    private final CreditCardRepository cCRepository;

    public CreditCardController(CreditCardRepository cCRepository) {
        this.cCRepository = cCRepository;
    }

    //Get Mapping --> return all credit cards
    //Post Mapping --> New Credit card
    //
}
