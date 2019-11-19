package com.company;

public class Singalton {

    static Singalton singalton=null;

    private Singalton() {

    }

    public static Singalton getobj() {
        if(singalton==null) {
            singalton=new Singalton();
        }
        return singalton;
    }

    public void print(int [] array) {
        for(int i:array) {
            System.out.print(i+" ");
        }
    }
}
