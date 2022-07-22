package com.bridgelabz.day6;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();

        for(int i=2;i<num;i++){
            if(num%i == 0){
                System.out.println(num +" is not prime number");
                return;
            }
        }

        System.out.println(num +" is prime number");

    }
}
