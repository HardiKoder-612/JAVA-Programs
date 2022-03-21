package Package;
        import java.io.*;
        import java.util.Scanner;
        import java.lang.*;
class Student implements Serializable
{
    String name,designation;
    double salary;
    void setName(String n)
    {
        name=n;
    }
    void setDesignation(String d)
    {
        designation=d;
    }
    void setSalary(double d)
    {
        salary=d;
    }
    String getName()
    {
        return name;
    }
    String getDesignation()
    {
        return designation;
    }
    double getSalary()
    {
        return salary;
    }
}
public class Main {

    public static void main(String[] args)
    {
        String s;
        Scanner sc = new Scanner(System.in);
        Student emp[] = new Student[4];
        for (int i = 0; i < 4; i++)
        {
            emp[i]=new Student();
            System.out.println("Student "+(i+1));
            System.out.println("Enter name: ");
            emp[i].setName(sc.nextLine());
            sc.nextLine();
            System.out.println("Enter designation: ");
            emp[i].setDesignation(sc.nextLine());
            System.out.println("Enter salary: ");
            emp[i].setSalary(sc.nextDouble());
            try{
                FileOutputStream f=new FileOutputStream("OutObject.txt");
                ObjectOutputStream o=new ObjectOutputStream(f);
                o.writeObject(emp[i]);
                f.close();
                o.close();
            }
            catch(IOException e)
            {
                System.out.println("The required information is not found in the file.");
            }
        }
    }
}