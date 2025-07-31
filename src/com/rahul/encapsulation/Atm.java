package com.rahul.encapsulation;

public class Atm {
    private long accno;
    private int balance;
    private int pin;

    public Atm(long accno, int balance, int pin) {
        this.accno = accno;
        this.balance = balance;
        this.pin = pin;
    }

    // method for deposit
    void deposit(int amount) {
        this.balance += amount;
        System.out.println("Deposited successfully");
        this.show_balance(this.pin);
    }

    // method for withdrawal
    void withdraw(int amount, int pin) {
        if (amount > this.balance) {
            System.out.println("Insufficient balance");
        } else {
            if (this.pin == pin) {
                this.balance -= amount;
                System.out.println("Withdrawl successful");
                this.show_balance(this.pin);
            } else {
                System.out.println("Wrong pin entered");
            }
        }
    }

    // show balance
    void show_balance(int pin) {
        if (this.pin == pin) {
            System.out.println("Your current balance is: " + this.balance);
        } else {
            System.out.println("Wrong pin entered");
        }
    }
}
