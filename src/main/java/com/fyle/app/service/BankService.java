package com.fyle.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fyle.app.entity.Bank_Branches;
import com.fyle.app.repository.BankRepository;

@Service
public class BankService {

	@Autowired
    private BankRepository bankRepo;
	
	public Bank_Branches getBranchesByIFSC(String ifsc) {
		return bankRepo.findByIfsc(ifsc);
	}
	
	public List<Bank_Branches> getBranchesByNameAndCity(String bank_name, String city) {
		return bankRepo.findByBankNameAndCity(bank_name, city);
	}
}
