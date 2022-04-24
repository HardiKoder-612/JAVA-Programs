//class Solution {
//    public int minSteps(String s, String t) {
//        int count=0;
//        int len1=s.length();
//        int len2=t.length();
//        int min;
//        for(int j=0;j<len2;j++)
//        {
//            int flag=0;
//            for (int i = 0; i < len1; i++)
//            {
//                if (t.charAt(j) == s.charAt(i))
//                {
//                    flag=1;
//                    break;
//                }
//            }
//            if(flag==0)
//            {
//                s=s+t.charAt(j);
//                count++;
//            }
//        }
//        for(int j=0;j<len1;j++)
//        {
//            int flag=0;
//            for (int i = 0; i <len2; i++)
//            {
//                if (s.charAt(j) == t.charAt(i))
//                {
//                    flag=1;
//                    break;
//                }
//            }
//            if(flag==0)
//            {
//                t=t+s.charAt(j);
//                count++;
//            }
//        }
//
//        System.out.println(s);
//        System.out.println(t);
//        return count;
//    }
//}class Leetcode{
//    public static void main(String[] args) {
//        Solution obj=new Solution();
//        String s="cotxazilut";
//        String pref= "nahrrmcchxwrieqqdwdpneitkxgnt";
//        int count=obj.minSteps(s,pref);
//        System.out.println(count);
//    }
//}