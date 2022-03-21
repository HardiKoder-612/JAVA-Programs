package AWTButtons;
import java.awt.*;
import java.awt.event.WindowEvent;

public class Buttons {
    private Buttons()
    {
        Frame f=new Frame("My first button");
        Button b=new Button("I am a button");
        b.setBounds(30,50,150,50);
        f.add(b);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        Buttons obj=new Buttons();
    }
}
