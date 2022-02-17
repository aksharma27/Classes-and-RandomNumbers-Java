package com.company;

public class WrapperClasses {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
      try {
          int i = Integer.parseInt(args[0]);
          int d = Integer.parseInt(args[1]);
          int ans = i + d;
          System.out.println(ans);
      }
      catch (Exception e)
      {
          System.out.println("This should be in command line");
      }
    }
}
