package com.example.atmoop;

public class smallbank extends Bank {
    public smallbank() {
    }

    public smallbank(double loanAmount) {
        super(loanAmount);
    }

    public void setInterest(double interestRate) {

    }

    public double getInterest() {

        return 0.03;
    }

    public double computeInterest() {

        double loanAmount = getLoanAmount();
        double interestRate = getInterest();
        double interest = loanAmount * (interestRate / 12.0);
        return interest;
    }
}
