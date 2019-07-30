package com.fyle.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.fyle.app.entity.Bank_Branches;

public interface BankRepository extends CrudRepository<Bank_Branches, String> {

    Bank_Branches findByIfsc(String ifsc);
    
    @Query(value = "select * from bank_branches where bank_name = :bankName and city = :city", nativeQuery = true)
    List<Bank_Branches> findByBankNameAndCity(@Param("bankName") String bank_name, @Param("city") String city);

}