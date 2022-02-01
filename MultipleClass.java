package com.company;

public class MultipleClass {
    public static void main(String[] args) {
       Student ashish=new Student();
       Student arpita=new Student();
       Student abhishek=new Student();
       ashish.roll=11;
       ashish.name="Ashish Kumar Mishra";

       arpita.roll=34;
       arpita.name="Arpita Senapati";

       abhishek.roll=10;
       abhishek.name="Abhishek";
//        System.out.println("Student's name: \t\t\t Roll number");
       ashish.printDetails();
       arpita.printDetails();
       abhishek.printDetails();
    }
}


 class Student{
    int roll;
    String name;
    public void printDetails(){

        System.out.print(name);
        System.out.print(" \t\t\t\t ");
        System.out.print(roll+" \t\t\t\t\t ");
    }
}