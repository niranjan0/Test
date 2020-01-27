package com.Inheritance.Overriding;

public class OverridingDemo {

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.methodTwo(0L);
        Parent child = new Childone();
        child.methodTwo(6L);
    }
}
