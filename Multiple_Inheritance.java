package com.company;

public class Multiple_Inheritance {
    public static void main(String[] args) {
        Child c=new Child();
        c.printF();
        c.printG();
    }
}



interface one{
    public void printG();

}
interface two{
    int a = 0;
    public void printF();
    }
interface three extends one,two{
    public void printG();
}
class Child implements three{
    @Override public void printG(){
        System.out.println("Hello");
    }
    @Override public void printF(){
        System.out.println("This is 2nd interface inside class Child");

    }
}