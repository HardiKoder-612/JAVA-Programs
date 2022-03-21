package AWTButtons;
import java.awt.*;
import java.awt.event.ItemEvent;

public class SimpleCheckBoxes {
    Checkbox cj=new Checkbox("java");
    Checkbox cpp=new Checkbox("C++");
    Checkbox cp=new Checkbox("Python");

    	    String text="";
	    Label msg;
    public SimpleCheckBoxes()
    {
        Frame f=new Frame("This is the first check box page by me.");
        cj.setBounds(100, 100,  50, 50);
        cpp.setBounds(100, 150,  50, 50);
        cp.setBounds(100, 200,  50, 50);
        f.add(cj);
        f.add(cpp);
        f.add(cp);
        f.setSize(500,500);
        f.setVisible(true);
    }
    public  static  void main(String[] args)
    {
        new SimpleCheckBoxes();
    }
	    public void itemState(ItemEvent e)
	    {
	        text+="Selection will be shown as true\n";
	        text+="Languages->\n";
	        text+="Java: "+cj.getState();
	        text+="\nC++: "+cpp.getState();
	        text+="\nPython: "+cp.getState();
	        msg.setText(text);
	    }
}