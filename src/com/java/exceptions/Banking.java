package com.java.exceptions;

import java.io.*;

class CheckingAccount {
   private double balance;
   private int number;
   
   public CheckingAccount(int number) {
      this.number = number;
   }
   
   public void deposit(double amount) {
      balance += amount;  // balance = balance+amount
      System.out.println("The Balance Amount is : " + balance);
   }
   
   public void withdraw(double amount) throws InsufficientFundsException {
      if(amount <= balance) {
         balance -= amount;
      }else {
         double shortageAmount = amount - balance;
         throw new InsufficientFundsException(shortageAmount);
      }
   }
   
   public double getBalance() {
      return balance;
   }
   
  
   
   public int getNumber() {
      return number;
   }
}
// File Name BankDemo.java
public class Banking {

   public static void main(String [] args) {
      CheckingAccount c = new CheckingAccount(101);
      System.out.println("Depositing $500...");
      c.deposit(500.00);
      
      try {
         System.out.println("\nWithdrawing $100...");
         c.withdraw(100.00);
         System.out.println("Withdrawal of $100 is Successful!!!!");
         System.out.println("\nWithdrawing $600...");
         c.withdraw(600.00);
         System.out.println("Withdrawal of $600 is Successful!!!!");
      } catch (InsufficientFundsException e) {
         System.out.println("Sorry, but you are short  of $" + e.getAmount());
         e.printStackTrace();
         
         e.getMessage("You are short of Funds");
      }
   }
}

