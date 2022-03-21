package MyPackage;

import java.io.*;
class Temp implements Serializable
{
    String name,uid;
}
public class ObjectWrite {
    public static  void main(String args[])
    {
        Temp obj=new Temp();
        obj.name="Hardik";
        obj.uid="20BCS5969";
        try
        {
            File f=new File("input.txt");
            FileOutputStream fos =new FileOutputStream(f);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(obj);
            FileInputStream fis= new FileInputStream(f);
            ObjectInputStream ois=new ObjectInputStream(fis);
            Temp obj1=(Temp) ois.readObject();
            System.out.println("Value of the object fetched from the file is following ->");
            System.out.println(obj1.name);
            System.out.println(obj1.uid);
        }
        catch(Exception e)
        {

        }

    }

}
