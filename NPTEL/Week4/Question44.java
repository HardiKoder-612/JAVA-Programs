package Week4;
interface First{
    // default method
    int x=1;
    default void show(){
        System.out.println("Default method implementation of First interface.");
    }
}
interface Second{
    // Default method
    default void show(){
        System.out.println("Default method implementation of Second interface.");
    }
}

// Implementation class code
class Question44 implements First, Second {
    // Overriding default show method
    public void show() {
        First.super.show();
        Second.super.show();
        System.out.println(First.x);
    }

    public static void main(String args[]){
        Question44 q = new Question44();
        q.show();
    }
}