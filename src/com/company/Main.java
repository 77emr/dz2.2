package com.company;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        BankAccount ba =  new BankAccount();
        ba.deposit(30000);
        while (true){
            try {
                ba.WithDraw(7000);
            } catch (LImitException le ){

            }try {
                ba.WithDraw((int) ba.getAmount());
            } catch (LImitException l ){
                l.printStackTrace();
            }
            break;
        }
    }
}
