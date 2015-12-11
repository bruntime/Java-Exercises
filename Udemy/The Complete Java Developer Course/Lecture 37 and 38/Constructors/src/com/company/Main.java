package com.company;

import javafx.animation.PauseTransition;

public class Main {

    public static void main(String[] args) {
        // Create a new class for a bank account
        // Create fields: account number, balance, customer name, email, phone number
        // Create getters and setters for each field
        // Create two addition methods:
        // 1. To allow the customer to deposit funds (this should increment the balance field),
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if there are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        //Add some System.out.println's in the two methods above as well

        //BankAccount JohnsAccount = new BankAccount();
        BankAccount PaulsAccount = new BankAccount();//(1203942, 0.00, "Paul Jones","pauljones@email.com", 2030492040);
        System.out.println(PaulsAccount.getNumber());
        System.out.println(PaulsAccount.getBalance());
//        PaulsAccount.setNumber(1203942);
//        PaulsAccount.setBalance(0.00);
//        PaulsAccount.setCustomerName("Paul Jones");
//        PaulsAccount.setCustomerEmail("pauljones@email.com");
//        PaulsAccount.setCustomerPhoneNum(2030492040);

        PaulsAccount.withdrawFunds(100.0);

        PaulsAccount.depositFunds(50.0);
        PaulsAccount.withdrawFunds(100.0);

        PaulsAccount.depositFunds(51.0);
        PaulsAccount.withdrawFunds(100.0);
    }
}
