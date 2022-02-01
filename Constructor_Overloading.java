package com.company;
//same as Method Overloading
public class Constructor_Overloading {
    public static void main(String[] args) {
        Box box1=new Box(4,3,2);
        Box box2=new Box(3);
        Box box3=new Box();

        System.out.println("Volume of b1 "+box1.volume());
        System.out.println("Volume of b1 "+box2.volume());
        System.out.println("Volume of b1 "+box3.volume());

    }
}

class Box{
    double width;
    double height;
    double depth;

    public Box(double w, double h, double d){           //parameterised constructor
        width=w;        //when dimensions are specified
        depth=d;
        height=h;
    }
    Box(){   //when no dimensions specified
        width=height=depth;  //0
    }
    Box(double length){         //when cube is created
        width=height=depth=length;
    }
    double volume(){
        return width*height*depth;
    }
}
