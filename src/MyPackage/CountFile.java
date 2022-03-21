package MyPackage;
import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class CountFile {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        char letter=sc.next().charAt(0);
        File infile=new File("File.txt");
        File outfile=new File("CountFile.txt");
        FileReader ins=null;
        FileWriter outs=null;
        try
        {
        ins = new FileReader(infile);
        outs= new FileWriter(outfile);
        int ch;
        char outchar;
        while((ch=ins.read())!=-1)
        {
            outchar=Character.toUpperCase((char)ch);
            outs.write(outchar);
            if (outchar == letter)
            {
                count++;
            }
        }
        System.out.println("The number of occurences are: "+count);

        }
        catch(IOException e)
        {
            System.out.println(e);
            System.exit(-1);
        }
        finally
        {
            try
            {
                ins.close();
                outs.close();
            }
            catch (IOException e)
            {}
        }
    }
}
