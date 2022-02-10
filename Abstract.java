package com.company;

public class Abstract {
    public static void main(String[] args) {
//        Parent p=new Parent();  -> abstract classes cannot be instantiated.
//           Child3 child = new Child3();
        Child2 child2= new Child2();
        child2.print();
        child2.printDetails();


    }
}
 abstract class  Parent{
    public Parent(){
        System.out.println("I'm the base constructor of Base class Parent");
    }
    public void printDetaisl(){
        System.out.println("Hello");
    }
    abstract public void print();
}

class Child2 extends Parent{    //it is mandatory to override the methods from the abstract class to the new non abstract class extending the parent abstract class
       @Override
       public void print(){
           System.out.println("Hello, this is abstract method of Parent class");
}
    public void printDetails(){
        System.out.println("Hello");
        }

}

 abstract class Child3 extends Parent{
 public void show(){
     System.out.println("this is Abhishek");
 }
}