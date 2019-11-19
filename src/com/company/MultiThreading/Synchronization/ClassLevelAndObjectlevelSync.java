package com.company.MultiThreading.Synchronization;

public class ClassLevelAndObjectlevelSync  {

    public static synchronized void display() throws InterruptedException {
        for(int i=1;i<=5;i++) {
            System.out.println(i);
               // Thread.sleep(1500);
        }
    }

    public  void displayChar() {
        for(int i=65;i<70;i++) {
            System.out.println((char)i);
          /*  try {
                Thread.sleep(1500);
            }
            catch (InterruptedException e){

            }*/
        }
    }
}
