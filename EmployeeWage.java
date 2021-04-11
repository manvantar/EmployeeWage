package com.bridgelabz.day7;
import java.util.Random;


public class EmployeeWage {

    static int wagePerHour=20;

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage problem");
        Random rand=new Random();
        int typeOfEmployee=rand.nextInt(10)%3;
        int hours=0;
        switch (typeOfEmployee){
            case 2:
                System.out.println("FullTimer");
                hours=8;
                break;
            case 1:
                System.out.println("PartTimer");
                hours=8;
                break;
            default:
                System.out.println("Absent");
                hours=0;
                break;
        }



        int oneDayWage= wagePerHour*hours;
        System.out.println(oneDayWage);


    }

}
