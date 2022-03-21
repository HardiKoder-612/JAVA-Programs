package Addn2;
import java.util.Scanner;
import javax.swing.*;
public class PayCheck {
    JFrame f;
    PayCheck()
    {
        f=new JFrame();
        int h,wh,wage;
        String in;
        in=JOptionPane.showInputDialog(f,"Enter the working hours of the employee: ");
        h=Integer.parseInt(in);
        in=JOptionPane.showInputDialog(f,"Enter pay per hour: ");
        wh=Integer.parseInt(in);
        wage=wh*h;
        if(h>40)
            wage=wage+wage/2;
        JOptionPane.showMessageDialog(f,"The total wage of the worker is: "+wage,"Alert",JOptionPane.WARNING_MESSAGE);
    }
    public static void main(String args[])
    {
        new PayCheck();
    }
}
