package AWTButtons;
import javax.swing.*;
import java.awt.*;
public class MenuExample {
    MenuExample()
    {
        Frame f=new Frame("This is a menu/ taskbar program");
        MenuBar menubar= new MenuBar();
        Menu fileMenu=new Menu("File");
        Menu editMenu=new Menu("Edit");
        Menu pasteMenu=new Menu("Paste");
        MenuItem m1=new MenuItem("New");
        MenuItem m2=new MenuItem("Open");
        MenuItem m3=new MenuItem("Save");
        MenuItem m4=new MenuItem("Copy");
        MenuItem m5=new MenuItem("Cut");
        MenuItem m6=new MenuItem("Exit");
        MenuItem m7=new MenuItem("Paste as plain text");
        MenuItem m8=new MenuItem("Paste as formatted text");
        fileMenu.add(m1);
        fileMenu.add(m2);
        fileMenu.add(m3);
        fileMenu.add(m6);
        editMenu.add(m4);
        editMenu.add(m5);
        pasteMenu.add(m7);
        pasteMenu.add(m8);
        f.setMenuBar(menubar);
        f.setSize(400,150);
        f.setLayout(null);
        f.setVisible(true);
        m2.addActionListener(e -> {
            JFileChooser choose =new JFileChooser();
            choose.showOpenDialog(null);
        });
    }
    public static void main(String[] args) {
        new MenuExample();
    }
}
