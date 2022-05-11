package com.example.banking.repositories;

import com.example.banking.models.Loan;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface LoanRepository extends CrudRepository<Loan,Integer> {
//Body is auto-generated
}
