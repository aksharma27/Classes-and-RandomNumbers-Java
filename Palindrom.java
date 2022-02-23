package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrom {   //101
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of inputs");
        int n=in.nextInt();   //2
        System.out.println("Enter the numbers");
        int[] input=new int[n];
        int sum=0;
        for (int i=0; i<n; i++){
            input[i] =in.nextInt();  //3,5
            sum=sum+input[i];
        }
        System.out.println(sum/n);
    }
}
