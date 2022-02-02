package com.company;

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Three three= new Three();
        three.printD();
        three.printF();
        three.printF();
    }
}
class One{
    public void printD()
    {
        System.out.println("hello there");
    }
}
class Two extends One{
    public void printF(){
        System.out.println("Hello");
    }}

class Three extends Two{
}