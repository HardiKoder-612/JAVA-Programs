import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {
    public static void typeCounter(String sentence) {
        int s=0,i=0,f=0;
        boolean sflag=true,iflag=true;
        String sen[]=sentence.split(" ");
        for(int j=0;j<sen.length;j++)
        {
            try{
                Integer d=Integer.parseInt(sen[j]);
            }
            catch(NumberFormatException e){
                iflag=false;
            }
            if(iflag==false)
            {
                try{
                    Double g=Double.parseDouble(sen[j]);
                }
                catch(NumberFormatException e){
                    sflag=false;
                }
            }
            if(iflag)
            {
                i++;
            }
            if(sflag==true && iflag==false)
            {
                f++;
            }
            if(sflag==false)
            {
                s++;
            }
            iflag=true;
            sflag=true;
        }
        System.out.println("String "+s);
        System.out.println("Integer "+i);
        System.out.println("Double "+f);
    }


    /*
     * Complete the 'typeCounter' function below.
     *
     * The function accepts STRING sentence as parameter.
     */
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String sentence = bufferedReader.readLine();

        Result.typeCounter(sentence);

        bufferedReader.close();
    }
}
