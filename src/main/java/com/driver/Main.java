package com.driver;

public class Main {
     public static void main(String args[]){
         A objA=new B();
         System.out.println("Calling method from class A using object of class B: " + objA.meth());

         B objB = new B();//call this overridden method from obj of class B *
         System.out.println("Calling overridden method from class B: " + objB.meth());
     }
  
}