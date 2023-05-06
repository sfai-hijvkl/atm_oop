package com.example.atmoop;

public class Bank {

    private double loan_amount;
    private double interest;

    public Bank() {
        loan_amount=0;
        interest = 0.04;
    }
    public Bank(double loan_amount){
        this.loan_amount = loan_amount;
        interest=0.04;
    }

    public double getInterest(){
        return interest;
    }

    public double getLoanAmount() {
        return loan_amount;
    }

    public double computeInterest(){
        double interest_rate = interest/12;
        double product = Math.pow((1 + (interest_rate)), 12);
        return loan_amount * (product - 1);
    }


}
