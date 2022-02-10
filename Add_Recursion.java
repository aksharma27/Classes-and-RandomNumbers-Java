package com.company;

import java.util.Scanner;
public class Add_Recursion {
    public static void main(String[] args) {
        int result =sum(2,5);

        System.out.println(result);
    }
     static int sum(int start, int end){
        if(end>start){
            return end+sum(start, end-1);
        }
        else {
            return end;
        }
    }
}
