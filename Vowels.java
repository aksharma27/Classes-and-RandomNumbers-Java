package com.company;

import java.util.Scanner;

public class Vowels {
        public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner in = new Scanner(System.in);
        String str= in.nextLine();
        if(str.charAt(0)=='a' || str.charAt(0)=='e' ||str.charAt(0)=='i' ||str.charAt(0)=='o' ||str.charAt(0)=='u' || str.charAt(0)=='A' ||str.charAt(0)=='E' ||str.charAt(0)=='I' ||str.charAt(0)=='O' ||str.charAt(0)=='U' ) {
            if (Character.isUpperCase(str.charAt(0))) {  /// ab c d
                System.out.println(" character is a vowel and is in Uppercase");
            } else {
                System.out.println("character is a vowel and is in lowercase");
            }
        }
        else {
            if (Character.isUpperCase(str.charAt(0))){
                System.out.println("character is not a vowel but is in Uppercase");
            }
            else {
                System.out.println("character is not a vowel nor in uppercase");
            }
        }
    }
}
