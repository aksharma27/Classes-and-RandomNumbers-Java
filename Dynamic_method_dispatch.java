package com.company;

public class Dynamic_method_dispatch {
    public static void main(String[] args) {
        Animal obj = new Dog();         //upcasting, taken reference of
//parent class animal but object of subclass created.
    }
}

class Animal{

}

class Dog extends Animal{

}
