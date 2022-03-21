package MyPackage;
interface NewShape
{
    void draw();
    int radius=10;
}
class Newcircle implements NewShape
{
    public void draw() {

        System.out.println("Radius is: " + radius);
    }
}
public class InterfaceVar {
    public static void main(String args[])
    {
        Newcircle obj=new Newcircle();
        obj.draw();
    }
}
