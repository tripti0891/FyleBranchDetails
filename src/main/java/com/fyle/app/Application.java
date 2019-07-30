package com.fyle.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application 
//implements CommandLineRunner 
{

	private static final Logger log = LoggerFactory.getLogger(Application.class);
    
	/*
	 * @Autowired private BankRepository bankRepo;
	 */
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

	/*
	 * @Override public void run(String... args) {
	 * 
	 * log.info("StartApplication...");
	 * 
	 * Bank_Branches b = bankRepo.findByIfsc("ABHY0065001");
	 * System.out.println("######3: = " + b);
	 * 
	 * List<Bank_Branches> b1 =
	 * bankRepo.findByBankNameAndCity("ABHYUDAYA COOPERATIVE BANK LIMITED",
	 * "MUMBAI"); b1.forEach(x -> System.out.println(x));
	 * 
	 * }
	 */
}
