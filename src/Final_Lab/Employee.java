package Final_Lab;
import java.util.Scanner;
import java.io.*;
public class Employee implements Serializable{
    String name,dob,department,designation;
    long salary;
    void setName(String n)
    {
        name=n;
    }
    void setDOB(String d)
    {
        dob=d;
    }
    void setDepartment(String dep)
    {
        department=dep;
    }
    void setDesignation(String deg)
    {
        designation=deg;
    }
    void setSalary(long s)
    {
        salary=s;
    }
    String getName()
    {
        return name;
    }
    String getDob()
    {
        return dob;
    }
    String getDesignation()
    {
        return designation;
    }
    String getDepartment()
    {
        return department;
    }
    long getSalary()
    {
        return salary;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee obj=new Employee();
        String name,dob,department,designation;
        long salary;
        System.out.print("Enter the name of the employee: ");
        name=sc.nextLine();
        obj.setName(name);
        System.out.print("Enter the date of birth(dd/mm/yyyy): ");
        dob=sc.nextLine();
        obj.setDOB(dob);
        System.out.print("Enter the department: ");
        department=sc.nextLine();
        obj.setDepartment(department);
        System.out.print("Enter the designation: ");
        designation=sc.nextLine();
        obj.setDesignation(designation);
        System.out.print("Enter the salary: ");
        salary=sc.nextInt();
        obj.setSalary(salary);
        try{
            FileOutputStream f=new FileOutputStream("OutObject.txt");
            ObjectOutputStream o=new ObjectOutputStream(f);
            o.writeObject(obj);
            f.close();
            o.close();
        }
        catch(IOException e)
        {
            System.out.println("The required information is not found in the file.");
        }
        try{
            FileInputStream fin=new FileInputStream("OutObject.txt");
            ObjectInputStream fob=new ObjectInputStream(fin);
            Employee obj1=(Employee) fob.readObject();
            System.out.println("\nInformation of employee fetched from the file->\n");
            System.out.print("Name: "+obj1.getName());
            System.out.print("\nDate of Birth (dd/mm/yyyy): "+obj1.getDob());
            System.out.print("\nDepartment: "+obj1.getDepartment());
            System.out.print("\nDesignation: "+obj1.getDesignation());
            System.out.print("\nSalary: "+obj1.getSalary());
        }
        catch(Exception e)
        {
            System.out.print("File not found");
        }
    }
}
