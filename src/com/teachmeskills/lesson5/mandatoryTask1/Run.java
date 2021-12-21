package com.teachmeskills.lesson5.mandatoryTask1;


import com.teachmeskills.lesson5.mandatoryTask1.CreditCard;

public class Run {
    public static void main(String[] args) {
        CreditCard Card1 = new CreditCard(37663834, 250);
        CreditCard Card2 = new CreditCard(46763547, 100);
        CreditCard Card3 = new CreditCard(37563527, 50);

        Card1.deposit(50);
        System.out.println("First card balance : "+Card1.getBalance()+"$");

        Card2.deposit(50);
        System.out.println("Second Card balance: " +Card2.getBalance()+ "$");

        Card3.withdraw(10);
        System.out.println("Third Card balans:"+ Card3.getBalance()+"$");

    }
}
