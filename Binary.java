package com.bridgelabz.day6;

import sun.util.locale.provider.CalendarDataUtility;

import java.util.Scanner;

public class Binary {
    public static String toBinary(int decimal){
        return Integer.toBinaryString(decimal);
    }
    static int swapNibbles(int x)
    {
        return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
    }

    static boolean isPowerOfTwo(int n)
    {
        if (n == 0)
            return false;

        while (n != 1)
        {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();

        System.out.println( "Binary number : "+toBinary(num));

        int number = swapNibbles(num);
        System.out.println("Swap nibbles : "+ number);

        if (isPowerOfTwo(number)){
            System.out.println(number + " is power of 2");
        }else{
            System.out.println(number+ " is not power of 2");
        }


    }
}
