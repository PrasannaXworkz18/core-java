package com.xworkz.yono.sbi;

import com.xworkz.yono.sbi.savings.SavingAc;

public class Executor {
    public static void main(String args[]){

       BankAc myAccount = new SavingAc(10000);
       myAccount.credit(3000);
       myAccount.credit(1000);
       myAccount.debite(1000);


       SavingAc mySavingAcc=(SavingAc)myAccount;
       mySavingAcc.calculateInterestRate();
       System.out.println("Balance After Interest Rate "+mySavingAcc.getBalance());
       System.out.println("Balance Of MyAccount  "+myAccount.getBalance());

      /*  SavingAc friendsAc = new SavingAc();
        myAccount.tranfer(3000,friendsAc);
        System.out.println("My Balance  "+myAccount.getBalance());
        System.out.println("FriendAccount Balance  "+friendsAc.getBalance());

        SavingAc momsAc = new SavingAc();
        myAccount.tranfer(1000,momsAc);
        System.out.println("My Balance "+myAccount.getBalance());
        System.out.println("MomsAc Balance "+momsAc.getBalance());

        SavingAc shekarAc = new SavingAc();
        myAccount.tranfer(2000,shekarAc);
        System.out.println("My Balance "+myAccount.getBalance());
        System.out.println("Shekar balance "+shekarAc.getBalance());

        SavingAc surajAc = new SavingAc();
        myAccount.tranfer(3000,surajAc);
        System.out.println("My Balance "+myAccount.getBalance());
        System.out.println("Suraj Ac Balance "+surajAc.getBalance());

        SavingAc sidduAc = new SavingAc();
        myAccount.tranfer(1000,sidduAc);
        System.out.println("My Balance "+myAccount.getBalance());
        System.out.println("sidduAc Balance "+sidduAc.getBalance());

        SavingAc phonepayWallet = new SavingAc();
        myAccount.tranfer(500,phonepayWallet);
        System.out.println("My Balance "+myAccount.getBalance());
        System.out.println("phonePay Wallet Balance "+phonepayWallet.getBalance());

        SavingAc rummyAc = new SavingAc();
        myAccount.tranfer(3000,rummyAc);
        System.out.println("My Balance "+myAccount.getBalance());
        System.out.println("Rummy Ac Balance "+rummyAc.getBalance());

        SavingAc googlePayWallet = new SavingAc();
        myAccount.tranfer(1000,googlePayWallet);
        System.out.println("My Balance "+myAccount.getBalance());
        System.out.println("Gooogle Pay Wallet Balance "+googlePayWallet.getBalance());

        SavingAc paytmAc = new SavingAc();
        myAccount.tranfer(500,paytmAc);
        System.out.println("My Balance "+myAccount.getBalance());
        System.out.println("Paytm Balance "+paytmAc.getBalance());

        SavingAc xworkzAc = new SavingAc();
        myAccount.tranfer(25000,xworkzAc);
        System.out.println("My Balance "+myAccount.getBalance());
        System.out.println("xworkz Balance "+xworkzAc.getBalance());*/


    }
}
