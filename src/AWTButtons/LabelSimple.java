package AWTButtons;
import java.awt.*;
public class LabelSimple {
    public LabelSimple()
    {
        Frame f=new Frame("My first simple labels program");
        Label l=new Label("This is the first label.");
        l.setBounds(10,40,160,30);
        Label l2=new Label("This is the second label.");
        l.setBounds(10,90,160,30);
        f.add(l);
        f.add(l);
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(400,300);
    }
    public static void main(String args[])
    {
        LabelSimple obj=new LabelSimple();
    }
}
