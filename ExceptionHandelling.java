package com.company;

public class ExceptionHandelling {
    public static void main(String[] args) {
        try {
            int a=45;
            int b=0;
            int div=a/b;
            System.out.println(div);
        }
        catch (Exception e){
            System.out.println("Cannot divide by 0");
        }
        System.out.println("hello");
    }
}
