package Assgn_Surp_2;
import java.io.*;
class Student implements Serializable{
    int id;
    String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class Serlize {
    public static void main(String args[])
    {
        try
        {
            Student s1=new Student(1,"Hardik Sharma");
            FileOutputStream fout=new FileOutputStream("f.txt");
            ObjectOutputStream out= new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            out.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
