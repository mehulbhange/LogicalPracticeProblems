package com.bridgelabz.day6;

import java.util.Scanner;

public class StopWatch {
    public long startTimer=0;
    public long stopTimer=0;
    public long time;

    public void start()
    {
        startTimer=System.currentTimeMillis();
        System.out.println("Start Time is: "+startTimer);
    }

    public void stop()
    {
        stopTimer=System.currentTimeMillis();
        System.out.println("Stop Time is: "+stopTimer);
    }

    public long getTime()
    {
        time=stopTimer-startTimer;
        return time;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StopWatch stopWatch = new StopWatch();
        System.out.println("Enter any integer to start");
        int s = sc.nextInt();
        stopWatch.start();

        System.out.println("Enter any integer to stop");
        int t = sc.nextInt();
        stopWatch.stop();

        System.out.println("Time(in millisec) : "+ stopWatch.getTime());

        System.out.println("Converting millisec to seconds: "+(stopWatch.getTime()/1000)+" sec");

    }
}
