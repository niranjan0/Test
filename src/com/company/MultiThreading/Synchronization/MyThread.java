package com.company.MultiThreading.Synchronization;



 public class MyThread implements Runnable {

    Display d;
    String name;
    public MyThread(Display d, String name){
        this.d=d;
        this.name=name;
    }
    @Override
    public void run() {

        d.wish(name);
    }
}
