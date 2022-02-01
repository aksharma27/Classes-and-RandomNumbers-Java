package com.company;

import java.util.Scanner;

public class MethodInClass{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Emp obj = new Emp();
        System.out.println("Enter name and id");
//        System.out.println("Enter name and id");
        String name=in.nextLine();
        int id=in.nextInt();
        obj.id=id;
        obj.name=name;
        obj.printDetails();


    }
}

class Emp{
    String name;
    int id;
    public void printDetails()
    {
        System.out.println("My name is "+name+" and id is "+id);

    }
}



