package com.company;

public class MultiThreading {
    public static void main(String[] args) {
        Mythread mythread = new Mythread();
        Mythread2 mythread2=new Mythread2();
        mythread.start();
        mythread2.start();
    }
}

class Mythread extends Thread{

    @Override
    public void run(){
        int i=0;
        while (i<2){
            System.out.println("Running Mythread class");
            i++;
        }
    }
}

class Mythread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<3){
            System.out.println("Running in Mythread2 class");
            i++;
        }
    }
}
