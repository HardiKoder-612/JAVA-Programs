package MyPackage;
class Animal{
void weep()
{
    System.out.println("Weeping....");
}
}
class Dog extends Animal{
void sleep()
{
    System.out.println("Sleeping....");
}
}
class BabyDog extends Dog{
void eat()
{
    System.out.println("Eating....");
}
}
public class Multilevel {
    public static void main(String agrs[]) {
        BabyDog obj = new BabyDog();
        obj.eat();
        obj.sleep();
        obj.weep();
    }
}
