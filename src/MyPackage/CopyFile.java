package MyPackage;
import java.io.*;
public class CopyFile {
    public static void main(String args[])
    {
        File infile=new File("input.dat");
        File outfile=new File("output.dat");
        FileReader ins=null;
        FileWriter outs=null;
        try
        {
            ins=new FileReader(infile);
            outs=new FileWriter(outfile);
            int ch;
            while ((ch=ins.read())!=-1)
            {
                outs.write(ch);
            }
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
            catch(IOException e)
            {}
        }
    }
}
