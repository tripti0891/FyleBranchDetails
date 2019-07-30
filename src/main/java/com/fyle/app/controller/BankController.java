package com.fyle.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fyle.app.entity.Bank_Branches;
import com.fyle.app.service.BankService;

@RestController
public class BankController {
	
	@Autowired
	BankService bankService;
    
	//http://localhost:8080/getBankByIFSC?ifsc=ABHY0065001
	@GetMapping("/getBankByIFSC")
    public Bank_Branches getBankBrancheByIFSC(@RequestParam(value="ifsc") String ifsc) {
    	return bankService.getBranchesByIFSC(ifsc);
    }
    
	//http://localhost:8080/getBanksByNameAndCity?name=ABHYUDAYA%20COOPERATIVE%20BANK%20LIMITED&city=MUMBAI
	@GetMapping("/getBanksByNameAndCity")
    public List<Bank_Branches> getBankBranchesByNameAndCity(@RequestParam(value="name") String name, @RequestParam(value="city") String city) {
    	return bankService.getBranchesByNameAndCity(name, city);
    }
    
    @GetMapping("/")
    public String status() {
    	return "Service is running...";
    }
}
