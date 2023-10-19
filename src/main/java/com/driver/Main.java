package com.driver;

public class Main {
     public static void main(String args[]){
         ClassA objA=new ClassB();
         System.out.println("Calling method from class A using object of class B: " + objA.meth());

         ClassB objB = new ClassB();//call this overridden method from obj of class B *
         System.out.println("Calling overridden method from class B: " + objB.meth());
     }
  
}