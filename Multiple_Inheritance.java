package com.company;

public class Multiple_Inheritance {
    public static void main(String[] args) {
        Child c=new Child();
//        c.printF();
//        c.printG();
    }
}

interface father{
    public void printG();
}
interface mom{
    int a = 0;
    public void printF();
    }
interface child extends father,mom{
//   public void printG();
//   public void printF();
   public void printH();
}
interface child2 extends father,mom,child{
    public void hello();
}
class Child implements child{
    @Override public void printH(){
        System.out.println("hello there");
    }
    @Override public void printG(){
        System.out.println("Hello");
    }
    @Override public void printF(){
        System.out.println("This is 2nd interface inside class Child");
    }
    public void helo(){
        System.out.println("inherited");
    }
}
class Children implements child2{
    public void printG(){
        System.out.println("hi");
    }
       public void printF() {
           System.out.println("hi");
       }
           public void printH(){
               System.out.println("hi");
           }
    public void hello(){
        System.out.println("hi");
    }

}