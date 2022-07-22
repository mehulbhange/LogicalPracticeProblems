package com.bridgelabz.day6;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int reverse = 0;

        while(num > 0){
            reverse = (reverse*10) + (num%10);
            num = num/10;
        }
        System.out.println("Reverse number : "+reverse);
    }
}
