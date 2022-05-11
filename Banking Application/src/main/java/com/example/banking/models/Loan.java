package com.example.banking.models;

import javax.persistence.*;

@Entity
@Table(name = "LOAN")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Loan_No")
    private int loadNo;

    @Column(name = "Customer_Id")
    private int customerId;

    @Column(name = "Loan_Amount")
    private int loanAmount;


    public int getLoadNo() {
        return loadNo;
    }

    public void setLoadNo(int loadNo) {
        this.loadNo = loadNo;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }
}
