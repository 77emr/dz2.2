package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }
    public double deposit(double sum){
        System.out.println("Вы положили на счет:"+(amount+=sum));
    return amount;

}
public void WithDraw(int sum) throws  LImitException{
        if (amount<sum){
            throw new LImitException("Вы не можете снять запрашиваю сумму чем остаток денег на счет",sum);
        }else {
            System.out.println("Сщ счета снято :"+sum);
            System.out.println("Остаток на счету:"+(amount-=sum));
        }
}
}
