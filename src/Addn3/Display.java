package Addn3;
class Parent{
    void pdisplay()
    {
        System.out.println("this is a parent class.");
    }
}
class Child extends Parent{
    void cdisplay()
    {
        System.out.println("this is a child class.");
    }
}
public class Display {
    public static void main(String args[])
    {
        Parent p =new Parent();
        Child c=new Child();
        p.pdisplay();
        c.cdisplay();
        c.pdisplay();
    }
}
