package com.company;
//"this" is a reference variable that refers to the current object
public class ThisKeyword {
    public static void main(String[] args) {
        Test obj=new Test(23,45); Test obj2=new Test(43,49);
        obj.print();
        obj2.print();
    }
}
class Test{
    int a;
    int b;
    Test(int a, int b){
       this.a=a;
       this.b=b;
    }
    void print(){
        System.out.println("a ="+a+ " b ="+b);
    }
}
