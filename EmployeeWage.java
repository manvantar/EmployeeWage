package com.bridgelabz.day7;
import java.util.Random;


public class EmployeeWage {

     static int wagePerHour = 20;
     static int max_hours=100;
     static int max_working_days=20;

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage problem");
        int totalWage=calculateWage();

    }
    public static int calculateWage(){
        Random rand = new Random();
        int daysWorked=0;
        int TotalHours = 0;
        int hours;
        int oneDayWage = 0;
        int montlyWage = 0;

        for (int i = 0;i<=max_working_days && TotalHours< max_hours ; i++) {
            int typeOfEmployee = rand.nextInt(10) % 3;

            switch (typeOfEmployee) {
                case 2:
                    hours = 12;
                    break;
                case 1:
                    hours = 8;
                    break;
                default:
                    hours = 0;
                    break;
            }
            TotalHours += hours;
            if(TotalHours<=max_hours) {
                oneDayWage = wagePerHour * hours;
                montlyWage = montlyWage + oneDayWage;
            }
            else{
                TotalHours=TotalHours-hours;
            }
            daysWorked=i;
        }
        System.out.println("Today working days= "+daysWorked);
        System.out.println("TotalHours= "+TotalHours);
        System.out.println("MonthlyWage= "+montlyWage);
        return montlyWage;
    }
}