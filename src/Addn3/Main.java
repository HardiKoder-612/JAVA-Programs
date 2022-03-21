package Addn3;
class Shape{
    void CHARACTER()
    {
        System.out.println("I am a shape.");
    }
}
class quadrilateral extends Shape{
    void CHARACTER()
    {
        Shape obj=new Shape();
        System.out.println("I am a quadrilateral");
        obj.CHARACTER();
    }
}
class parallelogram extends quadrilateral{
    void CHARACTER()
    {
        quadrilateral obj=new quadrilateral();
        System.out.println("I am a parallelogram");
        obj.CHARACTER();
    }
}
public class Main {
    public static void main(String args[])
    {
        parallelogram ob=new parallelogram();
        ob.CHARACTER();
    }

}
