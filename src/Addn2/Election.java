package Addn2;
import java.util.*;
public class Election {
    public static void main(String args[])
    {
        ArrayList <Integer> vote=new ArrayList<>();
        int c1=0,c2=0,c3=0,ct=0,v;
        Scanner sc=new Scanner(System.in);
        String cand1,cand2;
        System.out.println("Enter candidate 1 name: ");
        cand1=sc.nextLine();
        System.out.println("Enter candidate 2 name: ");
        cand2=sc.nextLine();
        System.out.print("\nEnter total number of votes to be given: ");
        ct=sc.nextInt();
        int temp=ct;
        while(temp>0)
        {
            System.out.println("***************Vote Menu**************");
            System.out.println("1. "+cand1+"\n2. "+cand2+"\n3. None of the above");
            System.out.println("Enter you vote(1/2/3): ");
            v=sc.nextInt();
            vote.add(v);
            temp--;
        }
        for(int i=0;i<vote.size();i++)
        {
            if(vote.get(i)==1)
                c1++;
            if(vote.get(i)==2)
                c2++;
            if(vote.get(i)==3)
                c3++;
        }
        float per1,per2,per3;
        per1=(c1*100)/ct;
        per2=(c2*100)/ct;
        per3=(c3*100)/ct;
        System.out.println("\n***********Results************");
        System.out.println(cand1+" got "+c1+" votes which is "+per1+" % of the total votes.");
        System.out.println(cand2+" got "+c2+" votes which is "+per2+" % of the total votes.");
        System.out.println(c3+" voted none of the above which is "+per3+" % of the total votes.");
    }
}
