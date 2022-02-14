package com.company;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("sum of "+n +" natural number are "+ sum(n));
        System.out.println(factorial(n));
}

    static int factorial(int n) {  //n*n-1*n-2.....1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int sum(int n) {               //5
        if (n == 1) {
            return 1;
        }
        return n + sum(n -1);  //3+2+1
    }
}