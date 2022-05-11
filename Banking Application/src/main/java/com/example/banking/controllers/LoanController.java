package com.example.banking.controllers;

import com.example.banking.models.Loan;
import com.example.banking.services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoanController {

    @Autowired
    private LoanService loanService;

    @RequestMapping(value = "/loan",method = RequestMethod.GET)
    List<Loan> getAllLoans(){
        return loanService.getAllLoans();
    }
    
    @RequestMapping(value = "/loan/{id}",method = RequestMethod.GET)
    Loan getLoanById(@PathVariable int id){
        return loanService.getLoanById(id);
    }

    @RequestMapping(value = "/loan",method = RequestMethod.POST)
    void saveLoan(@RequestBody Loan loan){
        loanService.saveLoan(loan);
    }


    @RequestMapping(value = "/loan",method = RequestMethod.PUT)
    void updateLoan(@RequestBody Loan loan){
        loanService.updateLoan(loan);
    }

    @RequestMapping(value = "/loan/{id}",method = RequestMethod.DELETE)
    void removeLoan(@PathVariable int id){
        loanService.removeLoan(id);
    }
}
