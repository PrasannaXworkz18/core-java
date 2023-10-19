package com.xworkz.yono.sbi;

public class BankAc {
    private double balance;

    public void debite(int amount){
        if(amount<=balance)
            balance=balance-amount;//implicit casting
        System.out.println("My account Amount is debited");

    }


    public void  credit(int amount){
        this.balance=balance+amount;
        System.out.println("My Account Amount is credited");

    }

    public void tranfer(int amount , BankAc beneficiary){// this class name BankAcc
        this.debite(amount);
        beneficiary.credit(amount);

    }

    public double getBalance() {

        return balance;
    }

    }


