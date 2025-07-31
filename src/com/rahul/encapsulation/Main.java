package com.rahul.encapsulation;

public class Main {
    public static void main(String[] args) {
        Atm atm = new Atm(98716546543456l, 1500, 9453);

        atm.show_balance(9453);
        atm.deposit(15000);
        atm.withdraw(22000, 9453);

//        atm.balance = 100000;
//        atm.pin = 1234;

        atm.show_balance(9453);
    }
}
