package com.company.MultiThreading.Synchronization;

public class Display {

    public static synchronized void wish(String name) {

        for (int i = 0; i < 5; i++) {
            System.out.print("good morning : ");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            System.out.println(name);
        }
    }
}
