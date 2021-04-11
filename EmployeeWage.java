package com.bridgelabz.day7;
import java.util.Random;


public class EmployeeWage {
     String companyName;
     int wagePerHour;
     int max_hours;
     int max_working_days;

     EmployeeWage(String companyName,int wagePerHour,int max_hours,int max_working_days){
         this.wagePerHour=wagePerHour;
         this.max_hours=max_hours;
         this.max_working_days=max_working_days;
         this.companyName=companyName;
     }

    public  int calculateWage(){
        Random rand = new Random();
        int daysWorked=0;
        int TotalHours = 0;
        int hours;
        int oneDayWage = 0;
        int montlyWage = 0;

        for (int i = 0;i<=this.max_working_days && TotalHours<this.max_hours ; i++) {
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
            if(TotalHours<=this.max_hours) {
                oneDayWage = this.wagePerHour * hours;
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