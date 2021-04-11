package com.bridgelabz.day7;
import java.util.Random;


public class EmployeeWage {

    static int wagePerHour=20;

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage problem");
        Random rand=new Random();
        int attendance=rand.nextInt(10)%2;
        int fullTimeHours=8;
        int oneDayWage= wagePerHour*fullTimeHours;


    }

}
