package Addn3;
public class Amount {
    float principal_amount=1000,rate=5,si;
    int time=3;
    void calc()
    {
        si=(principal_amount*rate*time)/100;
        System.out.println(si);
    }
    class R1{
        float rate=2;
        void calc()
        {
            si=(principal_amount*rate*time)/100;
            System.out.println(si);
        }
    }
    class R2{
        float rate=3;
        void calc()
        {
            si=(principal_amount*rate*time)/100;
            System.out.println(si);
        }
    }
    public static void main(String args[])
    {
        Amount obj1=new Amount();
        Amount.R1 obj2=obj1.new R1();
        Amount.R2 obj3=obj1.new R2();
        System.out.print("S.I. using outer class is: Rs. ");
        obj1.calc();
        System.out.print("S.I. using inner class(R1) is: Rs. ");
        obj2.calc();
        System.out.print("S.I. using inner class(R2) is: Rs. ");
        obj3.calc();
    }

}
