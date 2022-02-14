package com.company;

import java.security.spec.ECField;

public class Exception_Handelling {
    public static void main(String[] args) {
      int a=0;
      int b=10;
//      10/0
        try {
            System.out.println(10 / 2);
        }
        catch (Exception e){
            System.out.println("cannot divide anything by 0");
        }
        finally {
            System.out.println("Operation over");
        }


//       catch (Exception e)
//        {
//            System.out.println(" ....");
//        }

    }
}
