package Week3;
import java.lang.Math.*;
import java.util.Scanner;
class Point{
    double x,y;
    void distance(Point p1,Point p2)
    {
        double result=0.0;
        result=Math.sqrt(Math.pow((p1.x-p2.x),2)+Math.pow((p1.y-p2.y),2));
        System.out.print(result);
    }
}
public class Circle extends Point{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point p1=new Point();
        p1.x=sc.nextDouble();
        p1.y=sc.nextDouble();
        Point p2=new Point();
        p2.x=sc.nextDouble();
        p2.y=sc.nextDouble();
        Circle c1=new Circle();
        c1.distance(p1,p2);
    }
}
