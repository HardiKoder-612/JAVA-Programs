package AdditionalAssignment;/*
* The total amount of ink needed to print a single D is exactly 106 units.
* For example, printing a D in pure yellow would use 106 units of yellow ink and 0 from all others.
* Printing a D in the Code Jam red uses 0 units of cyan ink, 500000 units of magenta ink, 450000 units of yellow ink,
*  and 50000 units of black ink.

To print a color, a printer must have at least the required amount of ink for each of its 4 color cartridges.
* Given the number of units of ink each printer has in each cartridge, output any color, defined as 4 non-negative
* integers that add up to 106, such that all three printers have enough ink to print it.
* The first line of the input gives the number of test cases, T.
iNPUT
T test cases follow. Each test case consists of 3 lines. The
 i-th line of a test case contains 4 integers Ci, Mi, Yi, and Ki, representing the number of ink units
  in the i-th printer's cartridge for the colors cyan, magenta, yellow, and black, respectively.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class CodeJam
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0)
        {
            int []c=new int[3];
            int []m=new int[3];
            int []y=new int[3];
            int []k=new int[3];
            for (int i = 0; i < 3; i++) {
                c[i]=sc.nextInt();
                m[i]=sc.nextInt();
                y[i]=sc.nextInt();
                k[i]=sc.nextInt();
            }
            int sum=c[0]+m[0]+y[0]+k[0];
            if(sum<=1000000)
                System.out.println(c[0]+" "+m[0]+" "+y[0]+" "+k[0]);
            else
            {

            }
            T--;
        }
    }
}
