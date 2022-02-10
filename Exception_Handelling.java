package com.company;

import java.security.spec.ECField;

public class Exception_Handelling {
    public static void main(String[] args) {
       int[] arr = new int[5];
       arr[0]=0;
       arr[1]=1;
       arr[2]=3;
       arr[3]=4;
       arr[4]=9;
       try{
           System.out.println(arr[56]);
       }
       catch (Exception e){
           System.out.println("index not found");
       }
        finally {
           System.out.println("leave the page");
       }



//       catch (Exception e)
//        {
//            System.out.println(" ....");
//        }

    }
}
