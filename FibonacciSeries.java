package com.bridgelabz.day6;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.print(0 + "\t" + 1);

        for(int i=2;i<num;i++){
            int n3 = n1 + n2;
            System.out.print("\t"+n3);
            n1 = n2;
            n2 = n3;
        }

    }
}
