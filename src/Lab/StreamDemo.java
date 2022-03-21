package Lab;
import java.io.FilterReader;
import java.io.FileReader;
import java.io.Reader;
class Stream extends FilterReader
{
    protected Stream(Reader in)
    {
        super(in);
    }
}
public class StreamDemo {
    public static void main(String args[]) throws Exception
    {
        System.out.println(new Stream(new FileReader("")).markSupported());
    }
}
