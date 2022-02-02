package com.company;

import java.util.Scanner;

public class Inheritance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g=in.nextInt(); int vel=in.nextInt(); int h=in.nextInt();
//        subclass
        Mtb mtb = new Mtb(g,vel,h);
        System.out.println(mtb.printDetails());

//        Parent class
        Cycle cycle= new Cycle(5,60);
        System.out.println(cycle.printDetails());
    }
}

class Cycle{        //super class
    public int gear;
    public int speed;
    public Cycle(int g, int speed){             //parameterised constructor
        this.gear=g;
        this.speed=speed;
    }
//    public void applyBreak(int decrement){
//        speed -= decrement;
//    }
//    public void accelerate(int accelerate){
//        speed += accelerate;
//    }
    public String printDetails(){
        return ("Number of gears are :"+gear+" speed of the cycle is "+ speed);
    }

}

class Mtb extends Cycle{          //Sub-class
    //syntax: class NewClassName extends ParentClass
    public int seatHeight;
    public Mtb(int gear, int speed, int Height){
        super(gear,speed);
       seatHeight=Height;
    }
//    public void setHeight(int numval){
//        seatHeight=numval;
//    }
    @Override public String printDetails(){
        return (super.printDetails()+" seat height is "+seatHeight);
    }
}