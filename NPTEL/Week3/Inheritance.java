package Week3;

class A{
    public int i;
    protected int j;
}
    class B extends A{
        void display()
        {
            super.j=super.j-super.i;
            System.out.println((super.i+""+super.j));
        }
    }
    class Inheritance
    {
        public static void main(String[] args) {
            B obj=new B();
            obj.i=3;
            obj.j=6;
            obj.display();
        }
    }
