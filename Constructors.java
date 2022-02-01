package com.company;

public class Constructors {
// Constructors: Method with the name same as the class
public static void main(String[] args) {
    Stud newobj= new Stud("Ashish");

    System.out.println(newobj.getId());
    System.out.println(newobj.getName());
//    System.out.println(newobj.setName(myname));
}
}

class Stud{
    String n;
    int i;
    private int id;
    private String name;

    public  Stud(String myname){          //Parameterised Constructor
        id=234556;
        name="Ashish";
    }
    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }
    public void setId(){
        this.id=i;
    }
    public void setName(){
        this.name=n;
    }

}
