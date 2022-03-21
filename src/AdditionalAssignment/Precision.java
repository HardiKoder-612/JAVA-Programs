package AdditionalAssignment;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class Precision {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        float a;
        int b;
        a=sc.nextFloat();
        b=sc.nextInt();
        BigDecimal bd=new BigDecimal(Float.toString(a));
        bd=bd.setScale(b,RoundingMode.HALF_UP);
        a=bd.floatValue();
        System.out.print(a);
    }
}
