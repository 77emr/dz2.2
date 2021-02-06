package com.company;

public class LImitException extends Exception {
    private double remainingAmount;
    public LImitException(String messege,double remainingAmount){
        super(messege);
        this.remainingAmount=remainingAmount;

    }

    public double getRemainingAmount() {
        return remainingAmount;
    }
}
