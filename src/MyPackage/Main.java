package MyPackage;
class Mobile
{
    String str;
   Mobile()
   {
       str="Hello Mobile";
   }
   public String getProperties()
   {
        return str;
   }
}
public class Main
{
    public static void main(String args[]) {
          Mobile obj = new Mobile();
          System.out.println("The Property is: " + obj.getProperties());
    }
    }
