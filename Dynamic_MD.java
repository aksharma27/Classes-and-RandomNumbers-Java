package com.company;

public class Dynamic_MD {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();
        obj.ShowTime();
        obj.on();
//        obj.music();     -> error
    }
}
class Phone{
    public void ShowTime(){
        System.out.println("Time is 7:40 pm");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}


class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music");
    }
    @Override
    public void on(){
        System.out.println("Turning on Smart Phone...");
    }
}