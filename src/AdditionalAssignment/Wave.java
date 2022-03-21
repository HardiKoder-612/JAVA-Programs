package AdditionalAssignment;
import java.util.Scanner;
public class Wave {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n-1;i=i+2)
        {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
        }
        System.out.println("Array eleemnts after sorting in wave like form->");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}
