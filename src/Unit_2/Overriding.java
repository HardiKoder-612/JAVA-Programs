package Unit_2;
class Parent{
    public void show()
    {
        System.out.println("Parent class");
    }
}
class Child extends Parent{
     public void show()
    {
        System.out.println("Child class");
    }
}
class Overriding {
    public static void main(String args[])
    {
        Parent obj1=new Child();
        Parent obj2=new Parent();
        obj1.show();
        obj2.show();
    }


}
