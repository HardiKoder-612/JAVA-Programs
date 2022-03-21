package Lab;
interface MyInterface
{
    public void method1();
    public void method2();
}
class Demo implements MyInterface
{
    public void method1()
    {
        System.out.println("Hello");
    }
    public void method2()
    {
        System.out.println("World");
    }
    public static void main(String arg[])
    {
        MyInterface obj = new Demo();
        obj.method1();
        obj.method2();
    }
}
