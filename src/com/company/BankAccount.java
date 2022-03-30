package com.company;
//task 3,4
public class BankAccount {
   private double balance;
   //default constructor
    public BankAccount(){
    }
     public void SetBalance(double initialBalance){
        balance = initialBalance;
     }
     public void deposit(double amount){
        if(amount < 5000){
        balance += amount;
        }else{
            System.out.println("Transaction cancelled. Max deposit - 5000 | 'Your deposit: " + amount);
        }
     }
     public void withdraw(double amount){
        if(amount < balance) {
            balance -= amount;
            System.out.println("You have withdraw this amount " + amount );
            System.out.println("After withdrawal your balance is " + balance);
        }else{
            System.out.println("There is not enough funds");
        }
     }
     public double printBalance(){
        return balance;
     }

     public void transfer(double amount, BankAccount acc){
        if(this.balance < amount){
            System.out.println("Transfer cancelled. You are trying to transfer " + amount + " units, but only "
                    + balance + " are available");
        }
        else{
            this.balance -= amount;
            acc.balance += amount;
            System.out.println("Yore balance now is " + this.balance);
            System.out.println("Balance after you got transfer is " + acc.balance);
        }
     }

}
