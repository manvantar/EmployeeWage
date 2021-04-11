package com.bridgelabz.day7;

public class Main {
    public static void main(String[] args) {
        EmployeeWage e1=new EmployeeWage("Acenture",20,102,21);
        int wage1=e1.calculateWage();
        System.out.println(e1.companyName+" has monthly wage "+wage1);

    }
}
