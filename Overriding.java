package com.company;

public class Overriding {
    public static void main(String[] args) {
        Cyl obj=new Cyl(12,34);
       obj.vol();
        Circle cir= new Circle();
    }
}

 class Circle{
 public int rad;

    public double area(){
     return Math.PI*rad*rad;
 }
}

class Cyl extends Circle{
    int rad;
    public int height;

    Cyl(int r, int h){
     super(r);
        this.height=h;
    }

  public double vol(){
        System.out.println("this is cylinder of radius "+rad);
        double v= Math.PI*rad*rad*height;
        return v;
    }

}
