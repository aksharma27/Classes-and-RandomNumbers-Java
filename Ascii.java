package com.company;

import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner in = new Scanner(System.in);
        String obj=in.nextLine();   //a b c d
        for (int i=0; i<obj.length();i++){
            System.out.print(" "+(int)obj.charAt(i));
        }
    }
}
