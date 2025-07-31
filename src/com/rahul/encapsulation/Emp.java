package com.rahul.encapsulation;

public class Emp {
    public static void main(String[] args) {
        Employee employee1 = new Employee();

        employee1.setSalary(10000);
        employee1.setBonus(2500);

        System.out.println(employee1.getSalary());
        System.out.println(employee1.getBonus());
    }
}
