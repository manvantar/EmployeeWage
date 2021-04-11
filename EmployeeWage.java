package com.bridgelabz.day7;
import java.util.Random;


public class EmployeeWage {

    static int wagePerHour = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage problem");
        Random rand = new Random();

        int TotalHours = 0;
        int hours;
        int oneDayWage = 0;
        int montlyWage = 0;
        for (int i = 0; i <= 20; i++) {
            int typeOfEmployee = rand.nextInt(10) % 3;

            switch (typeOfEmployee) {
                case 2:
                    hours = 8;
                    break;
                case 1:
                    hours = 8;
                    break;
                default:
                    hours = 0;
                    break;
            }
            TotalHours += hours;
            oneDayWage = wagePerHour * hours;
            montlyWage = montlyWage + oneDayWage;
        }
        System.out.println("TotalHours= "+TotalHours);
        System.out.println("MonthlyWage= "+montlyWage);

    }
}