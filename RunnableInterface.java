package com.company;

public class RunnableInterface {
    public static void main(String[] args) {
        MyThread mythread3=new MyThread();
        Thread t1= new Thread(mythread3);
        t1.start();

        MyThread2 mythread2=new MyThread2();
        Thread t2= new Thread(mythread2);
        t2.start();
    }
}

class MyThread implements Runnable{
    public void run(){
        int i =0;
        while (i<2){
            System.out.println("first Thread");
            i++;
        }
    }
}class MyThread2 implements Runnable{
    public void run(){
        int i =0;
        while (i<3){
            System.out.println("2nd Thread");
            i++;
        }
    }
}
