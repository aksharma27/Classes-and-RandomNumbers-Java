package com.company;

public class New {
    public static void main(String[] args) {
        int breadth, lenght;
        bedroon area= new bedroon(5,6,2);
        area.volume();

    }
}

class Room{
    int lenght, breadth;
    Room(int x, int y){
       this.lenght=x;
       this.breadth=y;
    }
    int area(){
//        System.out.println(lenght*breadth);
        return lenght*breadth;
    }
}
class bedroon extends Room{
    int height;
    bedroon(int x, int y, int z){
        super(x,y);
        this.height=z;
    }
    void volume(){
        System.out.println("volume: "+area()*height);
    }
}

