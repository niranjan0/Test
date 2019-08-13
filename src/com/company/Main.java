package com.company;

import com.datastructure.niranjan.*;
import com.sun.javafx.runtime.SystemProperties;

import java.io.PrintStream;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;


public class Main {
    public static final PrintStream niranjan = System.out;
    public static void main(String[] args) {

   TreeTraversal tt = new TreeTraversal();
   tt.root = new TreeTraversal.Node(10);
   tt.root.left = new TreeTraversal.Node(5);
   tt.root.right = new TreeTraversal.Node(45);
   tt.root.left.left = new TreeTraversal.Node(12);
   tt.root.left.right = new TreeTraversal.Node(7);
   tt.root.right.left = new TreeTraversal.Node(43);
   tt.root.right.right = new TreeTraversal.Node(99);

   tt.postOrder(tt.root);

niranjan.println("another");
tt.postOrderWithTwoStack(tt.root);

     /*   Fibonacci fb = new Fibonacci();
       // int n=40;
        fb.Initilize();
        niranjan.println(fb.fibMemoization(40));*/

    /*    ListNode list = new ListNode();

        list.push(10);
        list.push(12);
        list.push(15);
        list.insertAfer(1,17);
        list.print();
      //  list.printList();*/


      /*  String str1 = "apple";
        String str2 = "cpple";
        OneEditAway obj = new OneEditAway();
        niranjan.println(obj.oneEditAwayString(str1,str2));*/
           // int arr[] = {4, 6, 9, 2, 10, 11, 8};
      /* String s = "ram has a home";
       niranjan.println(removeSpace(s));*/
         //  niranjan.println( HasPairOfSum(arr, 244));
     /*   RemoveDuplicateFromArray rom = new RemoveDuplicateFromArray();
      //  int arr[]  = {1,4,4,8,9,9,10,11,25,36,36};
        int result1[] = rom.remove(arr);
niranjan
        for(int i=0;i<result1.length;i++)
        {
            niranjan.println("dcy "+result1[i]);
        }*/
        // rom.remove()
        // write your code here
        //PrintStream niranjan = System.out;
        //   niranjan.println("hi");
        //  Leetcode2 lt = new Leetcode2();
        //  lt.intToRoman(10);
        //  Employee [] staff =  new Employee[3];
        //   Factorial fact =  new Factorial();
        //  niranjan.println(fact.getFectorial(8));
        //  NiranjanArray ni  = new NiranjanArray() ;
        // ni.check();
        //  niranjan.println("coming after assign");
        //   int res []= ni.check();


  /*      niranjan.println("length of res = "+res.length );
        for(int i:res)
        {
            niranjan.println(res[i]);
        }
       staff[0] = new Employee("niranjan",  4000.0,1994,03,01);
        staff[1] = new Employee("ramesh",  3000.0,1992,05,15);
        staff[2] = new Employee("suresh",  2000.0,1993,03,13);

       Employee dev = new Employee("sachin",5000.0,2018,02,14);

        for(Employee e: staff)
            e.raiseSalary(5.0);

        for (Employee e : staff)
        {
            niranjan.println("name is "+e.getName()+ " salary is "+e.getSalary() +" and hireday is "+e.getHireday());
        }
        Employee.checkStaticBehaviour(dev);
       Employee test = new Employee();
        niranjan.println(dev.getSalary());

        test.setHireday(LocalDate.of(2018,04,15));
        test.setSalary(60000.0);
        test.setName("");

        Employee.checkStaticBehaviour(test);
        niranjan.println(test.getSalary());

        Employee man = new Manager("nitin",45000,2018,03,15,5000);

       // Manager man1 = (Manager) staff[0];
      //  man1.setBonus(5000);
      //  staff[0].
        // man.setBonus(3000);
        niranjan.println("name is "+man.getName()+" and salsry is "+man.getSalary()+ " hireday is "+man.getHireday()+" "+
        ((Manager) man).getBonus());*/
        }

  /*  private static String removeSpace(String s) {
        s =s.trim();
 String res = s.replaceAll("\\s","%20");

         return res;
    }*/

   /* private static boolean HasPairOfSum(int arr[],int i) {

            HashSet<Integer> set = new HashSet<Integer>();
            for(int j=0 ;j<arr.length;j++)
            {
                if(!set.contains(i-arr[j]))
                {
                    set.add(arr[j]);
                }
                else
                {
                    return true;

                }
            }
            return false;
        }*/



    }


