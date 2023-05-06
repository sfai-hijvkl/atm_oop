package com.example.atmoop;

public class bigbank extends Bank {
    public bigbank() {
    }

    public bigbank(double loanAmount) {
        super(loanAmount);
    }

    public void setInterest(double interestRate) {

    }

    public double getInterest() {
        // return the interest rate for the small bank
        return 0.05;
    }

    public double computeInterest() {
        // calculate the interest using the formula
        double loanAmount = getLoanAmount();
        double interestRate = getInterest();
        double interest = loanAmount * (interestRate / 12.0);
        return interest;
    }
}
