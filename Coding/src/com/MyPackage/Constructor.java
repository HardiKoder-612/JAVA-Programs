package com.MyPackage;

class Constructor {
    Constructor()
    {
        System.out.println("This is a default constructor");
    }
    Constructor(int a)
    {
        System.out.println("This is a parameterized constructor");
    }
}
class Calling{
    public static void main(String args[])
    {
        Constructor c1=new Constructor();   //calls the default constructor
        Constructor c2=new Constructor(1);   //calls the parameterized constructor
    }
}

