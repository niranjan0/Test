package com.company;



import com.datastructure.niranjan.Employee;

import java.util.HashMap;
import java.util.Objects;

class test {

static HashMap<Employee,String> hashMap = new HashMap<>();


    public static void main(String args[]){

 Employee employee1 = new Employee("niranjan","9901145293","niranjanmishra01@gmail.com");
 Employee employee2 = new Employee("aman","8002762829","aman.gupta.nitp@gmail.com");
 hashMap.put(employee1,"4536");
 hashMap.put(employee2,"457658");

 boolean exist = checkAvailability("niranjan","9901145293","niranjanmishra01@gmail.com");
 System.out.println(exist);
}

    private static boolean checkAvailability(String name, String mobile, String email) {
        Employee emp = new Employee(name,mobile,email);
        if(hashMap.containsKey(emp)){
            return true;
        }
        return false;
    }

}