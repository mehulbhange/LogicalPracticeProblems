package com.bridgelabz.day6;

import java.util.Scanner;

class Calculate {
    static int[] notes = {1000,500,100,50,10,5,2,1};
    int amount = 0;
    static int totalNotes;
    static int i=0;

    public void calNotes(int amount){
        if(amount == 0){
            return;
        }else{
            int note = amount/notes[i];
            int remaining = amount%notes[i];
            amount = remaining;
            totalNotes += note;
            if(note != 0)
                System.out.println(notes[i]+" : "+note);
        }
        i++;
        calNotes(amount);
    }

}

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Change in Rs. ");
        int num = sc.nextInt();

        Calculate cal = new Calculate();

        cal.calNotes(num);
        System.out.println("Total Notes returned : "+Calculate.totalNotes);
    }
}
