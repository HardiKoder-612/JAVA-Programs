package Session1;
interface Java{
    // default method
    default void disp(){
        System.out.println("Default method implementation of Java interface.");
    }
}

interface Nptel{
    // Default method
    default void disp(){
        System.out.println("Default method implementation of Nptel interface.");
    }
}

// Implementation class code
class Question44 implements Java, Nptel{
    // Overriding default disp method
    public void disp(){

        Java.super.disp();
        }


    public static void main(String args[]){
        Question44 q = new Question44();
        q.disp();
    }
}