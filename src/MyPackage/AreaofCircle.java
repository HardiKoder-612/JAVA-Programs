package MyPackage;

import java.util.*;
import java.lang.*;

public class AreaofCircle {
    public static void main(String args[])
    {
        float radius,area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        radius=sc.nextFloat();
        area= (float) (3.14*radius*radius);
        System.out.println("Area of the circle is: "+area);
    }
}
