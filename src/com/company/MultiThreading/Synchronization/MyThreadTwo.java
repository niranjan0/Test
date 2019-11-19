package com.company.MultiThreading.Synchronization;

public class MyThreadTwo implements Runnable{
    ClassLevelAndObjectlevelSync display;

    public MyThreadTwo(ClassLevelAndObjectlevelSync display) {
        this.display=display;
    }

    @Override
    public void run() {
        display.displayChar();


    }
}
