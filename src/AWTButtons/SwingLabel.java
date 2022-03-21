package AWTButtons;
import javax.swing.*;
public class SwingLabel extends JApplet{
    SwingLabel()
    {
        JFrame f=new JFrame("Label using swing");
        JLabel lab=new JLabel("This is the label");
        lab.setBounds(10,20,50,50);
        f.add(lab);
    }
    public static void main(String[] args) {
        new SwingLabel();
    }
}
