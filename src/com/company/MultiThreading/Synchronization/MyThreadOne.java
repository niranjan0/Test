package com.company.MultiThreading.Synchronization;

public class MyThreadOne implements Runnable {
    ClassLevelAndObjectlevelSync display;
    public MyThreadOne(ClassLevelAndObjectlevelSync display) {
        this.display=display;
    }
    @Override
    public void run() {

        try {
            display.display();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
