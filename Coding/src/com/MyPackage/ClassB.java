package com.MyPackage;
class SingleInheritence

{

    public void dispA()

    {

        System.out.println("disp() method of ClassA");

    }

}

public class ClassB extends SingleInheritence

{

    public void dispB()

    {

        System.out.println("disp() method of ClassB");

    }

    public static void main(String args[])

    {

        //Assigning ClassB object to ClassB reference

        ClassB b = new ClassB();

        //call dispA() method of ClassA

        b.dispA();

        //call dispB() method of ClassB

        b.dispB();

    }

}