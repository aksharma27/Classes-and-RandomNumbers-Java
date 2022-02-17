package com.company;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner in= new Scanner(System.in);
      System.out.println(sum(in.nextInt(), in.nextInt()));
    }
    static int sum(int a, int b){
        int sum=a+b;
        return sum;
    }
}
