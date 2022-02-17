package com.company;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        int r =in.nextInt();
        System.out.println("Area of circle of radius "+r+" is: "+area(r));
    }
    static double area(int r){
        double area=Math.PI*(r*r);
        return area;
    }
}
