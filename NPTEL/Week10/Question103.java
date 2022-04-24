import java.sql.*;
import java.util.Scanner;
import java.lang.Exception;

public class Question103 {
    public static void main(String args[]) {
        try {
            Connection conn = null;
            Statement stmt = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");
            conn.close();
            System.out.print(conn.isClosed());
        }
        catch(Exception e){ System.out.println(e);}
    }
}
