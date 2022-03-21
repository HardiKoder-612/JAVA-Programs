package AWTButtons;
import java.awt.Frame;
import java.awt.Button;
import java.awt.BorderLayout;
public class BorderLayoutExample {
    BorderLayoutExample()
    {
    Frame frame=new Frame("Different border layouts");
    Button b1=new Button("North");
    Button b2=new Button("South");
    Button b3=new Button("East");
    Button b4=new Button("West");
    Button b5=new Button("Center");
    b1.setBounds(10,20,100,100);
        b2.setBounds(10,30,100,100);
        b3.setBounds(10,40,100,100);
        b4.setBounds(10,50,100,100);
        b5.setBounds(10,60,100,100);
    frame.add(b1,BorderLayout.NORTH);
    frame.add(b2,BorderLayout.SOUTH);
    frame.add(b3,BorderLayout.EAST);
    frame.add(b4,BorderLayout.WEST);
    frame.add(b5,BorderLayout.CENTER);
    frame.setSize(400,300);
    frame.setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}
