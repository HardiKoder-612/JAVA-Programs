package Package;
import java.util.Scanner;
class Area {
    int length,breadth;
    Area(int len,int br)
    {
        length=len;
        breadth=br;
    }
    int returnArea()
    {
        return length*breadth;
    }
}
class Result{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,b,area;
        System.out.println("Enter the length of the recatngle: ");
        l=sc.nextInt();
        System.out.println("Enter the breadth of the recatngle: ");
        b=sc.nextInt();
        Area obj;
        obj = new Area(l,b);
        area= obj.returnArea();
        System.out.println("Area of the recatngle: "+area);
    }
}
