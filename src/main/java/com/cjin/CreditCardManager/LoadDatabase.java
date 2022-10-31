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
    CommandLineRunner initDatabase(CreditCardRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new CreditCardAccount("Sapphire Reserve", "Travel","Chase" )));
            log.info("Preloading " + repository.save(new CreditCardAccount("Platinum", "Travel","American Express")));
        };
    }

    @Bean
    CommandLineRunner initDatabase(CustomerRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Customer("James Conroy", 800 )));
            log.info("Preloading " + repository.save(new Customer("Steve Ford",650 )));
        };
    }
}
