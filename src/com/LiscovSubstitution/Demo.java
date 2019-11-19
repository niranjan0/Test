package com.LiscovSubstitution;

public class Demo {

    static void useIt(Ractangle r){
        int height=r.getHeight();
        r.setWidth(10);
        // exp area = height*10;
        System.out.println(
                "expected area of :"+(height*10)
        +" got :"+r.getArea());
    }

    public static void main(String args[]){
        Ractangle rc = new Ractangle(2,3);
        useIt(rc);
    }
}
