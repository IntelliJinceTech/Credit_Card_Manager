package com.cjin.CreditCardManager;

import com.cjin.CreditCardManager.account.Customer;
import com.cjin.CreditCardManager.interfaces.CustomerRepository;
import org.slf4j.Logger;
import com.cjin.CreditCardManager.account.CreditCardAccount;
import com.cjin.CreditCardManager.interfaces.CreditCardRepository;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private final static Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(CreditCardRepository cCRepository,CustomerRepository customerRepository) {
        return args -> {
            log.info("Preloading " + cCRepository.save(new CreditCardAccount("Sapphire Reserve", "Travel","Chase" )));
            log.info("Preloading " + cCRepository.save(new CreditCardAccount("Platinum", "Travel","American Express")));
            log.info("Preloading " + customerRepository.save(new Customer("James Conroy", 800 )));
            log.info("Preloading " + customerRepository.save(new Customer("Steve Ford",650 )));
        };
    }
}
