package com.xworkz.yono.sbi.savings;

import com.xworkz.yono.sbi.BankAc;

public class SavingAc extends BankAc {

    double rateOfInterest=3.8;
    public SavingAc(){

    }

    public SavingAc(double minBalance){

    }

    public void calculateInterestRate(){
       double interest = (rateOfInterest*getBalance())/100;
        System.out.println("Rate Of Interest Is "+interest);

    }


}
