/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0)
        {
            int n,k;
            n=sc.nextInt();
            k=sc.nextInt();

            int A[]=new int[n];
            int sum=0,max=0;
            for (int i = 0; i < n; i++) {
                A[i]=sc.nextInt();
                sum+=A[i];
            }
            for (int i = 0; i < n; i++) {
                if(A[i]>=max)
                    max=A[i];
            }
            if(sum<=k)
                System.out.println(n);
            else if(sum>k)
            {
                sum-=max;
                max/=2;
                sum+=max;
                if(sum<=k)
                    System.out.println(n);
                else
                {

                }
            }
            T--;
        }
    }
}
