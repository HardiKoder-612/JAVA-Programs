package MyPackage;
import java.awt.*;
public class SwingClass extends Frame {
    SwingClass()
    {
        Button b=new Button("disk");
        b.setBounds(100,100,40,30);
        b.setSize(300,300);
    }

    public static void main(String args[])
    {
        SwingClass obj=new SwingClass();
    }
}
