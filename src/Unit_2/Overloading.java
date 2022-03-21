package Unit_2;
public class Overloading {
    void sum()
    {
        int a=10,b=20,add;
        add=a+b;
        System.out.println(add);
    }
    void sum(int a,int b)
    {
        int add=a+b;
        System.out.println(add);
    }
    void sum(int a,int b,int c)
    {
        int add=a+b+c;
        System.out.println(add);
    }
    public static void main(String args[])
    {
        Overloading obj=new Overloading();
        obj.sum();
        obj.sum(12,13);
        obj.sum(15,16,20);
    }
}
