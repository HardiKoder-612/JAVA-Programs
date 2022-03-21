package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;
public class JDBCExample {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        try{
        String url="jdbc:mysql://localhost:3306/surprise_test_java";
        String uname = "root";
        String pass="hardikdonisagoodboy";
        Class.forName("com.mysql.cj.jdbc.Driver");
        String query;
        System.out.println("Enter the SQL query to be processed....\n");
        query=sc.nextLine();
        System.out.println("connection established successfully");
        Connection con=DriverManager.getConnection(url,uname,pass);
        Statement st=con.createStatement();
        st.executeUpdate(query);
        st.close();
        con.close();
        }
    catch(Exception e)
    {
        System.out.println("Connection not established...");
    }
    }
}