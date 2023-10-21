package com.driver;

public class Main {
    public Main() {
    }

    public static class A {
        public String meth(){
            return "Invoking method from class A";
        }
    }

    public static class B extends A {
        public String meth() {
            return "Method is overridden in Extendend class B";
        }
    }
     public static void main(String args[]){
         //A objA=new B();
         //System.out.println("Calling method from class A using object of class B: " + objA.meth());

         B objB = new B();//call this overridden method from obj of class B *
         objB.meth();
         System.out.println( objB.meth());
     }
  
}