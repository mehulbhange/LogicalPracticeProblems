package com.bridgelabz.day6;

import java.util.Scanner;

public class Util {
    static Scanner sc = new Scanner(System.in);
    public static void temperatureConversion(){
        System.out.println("1. Celsius to Fahrenheit \t 2.Fahrenheit to Celsius ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println("Enter temperature in Celsius : ");
                double c = sc.nextDouble();
                double tempF = (c * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit : " + tempF);
                break;
            case 2:
                System.out.println("Enter temperature in Fahrenheit : ");
                double f = sc.nextDouble();
                double tempC = (f - 32) * 5 / 9;
                System.out.println("Temperature in Celsius : " + tempC);
                break;
            default:
                System.out.println("Enter valid choice.");
        }
    }

    public static void monthlyPayment(double P, double Y, double R){
        double n = 12 * Y;
        double r = R / (12 * 100);
        double payment = (P * r) / (1 - Math.pow(r+1,-n));
        System.out.println("Monthly Payment : "+payment);
    }

    public static void sqrt(double number){
        double epsilon = 1e-15;
        if(number<0){
            System.out.println("Enter non negative number only");
        }else{
            double t = number;

            while (Math.abs(t - (number/t)) > epsilon){
                t =  ((number/t)+t) * 0.5;
            }

            System.out.println("Sqrt : " + t);
        }
    }

    public static void main(String[] args) {

        temperatureConversion();

        System.out.println("Enter Principle loan amount, years and interest rate : ");
        double P = sc.nextDouble();
        double Y = sc.nextDouble();
        double R = sc.nextDouble();
        monthlyPayment(P, Y, R);

        System.out.println("Enter number ");
        sqrt(sc.nextDouble());

    }
}
