package com.company;

public class Method_Overriding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.meth1();
        b.meth1();
    }
}
class A{
    public void meth1(){
        System.out.println("hello, I'm method of class A");
    }
}
//parameters, modifiers and datatypes of both the methods should be the same to override
class B extends A {
    @Override
    public void meth1() {
        System.out.println("Hello, I'm mehtod of class B");
    }
}

