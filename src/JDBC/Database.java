package JDBC;
import java.sql.*;
public class Database {
    public static void main(String[] args) throws Exception{
        try{
            String url="jdbc:mysql://localhost:3306/jdbc";
        String uname = "root";
        String pass="hardikdonisagoodboy";
        String query="INSERT INTO STUDENT values (104,'ROHAN',21)";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,uname,pass);
        System.out.println("connection established successfully");
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
