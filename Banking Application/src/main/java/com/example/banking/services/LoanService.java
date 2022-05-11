package com.example.banking.services;

import com.example.banking.models.Loan;
import com.example.banking.repositories.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LoanService {
    @Autowired
    LoanRepository loanRepository;

    public List<Loan> getAllLoans(){
        List<Loan> loanList=new ArrayList<>();
        loanRepository.findAll().forEach(loanList::add);
        return loanList;
    }
    public Loan getLoanById(int id){
        Optional<Loan> op=loanRepository.findById(id);
        return op.orElse(null);
    }

    // Save the loan
    public void saveLoan(Loan loan){
       loanRepository.save(loan);

    }

    // Update the loan
    public void updateLoan(Loan updatedLoan)
    {
     loanRepository.save(updatedLoan);
    }

    public void removeLoan(int id){
        loanRepository.deleteById(id);
    }

}
