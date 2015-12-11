package com.company;

/**
 * Created on 12/5/2015.
 */
public class BankAccount {

    private int number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private int customerPhoneNum;

    //constructor - initializes object. called once, when creating object
    public BankAccount() {
        this(56789, 2.50, "Default name", "Default address", 123456789); //calling a constructor from another constructor
        System.out.println("Empty constructor called");
    }

    //another example of constructor - this constructor has parameters
    public BankAccount(int number, double balance, String customerName, String customerEmail, int customerPhoneNum) {
        System.out.println("Account constructor with parameters called.");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNum = customerPhoneNum;
    }

    public void depositFunds (double addedFunds) {
        //increment balance fields
        this.balance += addedFunds;
        System.out.println("Deposit of " + addedFunds + " made. New balance is " + this.balance);
    }

    public void withdrawFunds (double withdrawalFunds) {
        //decrement balance fields
        if (this.balance - withdrawalFunds <= 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed.");
        } else {
            this.balance -= withdrawalFunds;
            System.out.println("Withdrawal of " + withdrawalFunds + " processed. Remaining balance = " + this.balance);
        }
    }

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }

    public String getCustomerEmail(){
        return this.customerEmail;
    }

    public void setCustomerPhoneNum(int customerPhoneNum){
        this.customerPhoneNum = customerPhoneNum;
    }

    public int getCustomerPhoneNum(){
        return this.customerPhoneNum;
    }
}
