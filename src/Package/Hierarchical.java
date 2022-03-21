package Package;
class DogOrBird{
    void Eat()
    {
        System.out.println("Eats...");
    }
}
class Dog extends DogOrBird{
    void bark()
    {
        System.out.println("Barks...");
    }
}
class Bird extends DogOrBird{
    void chirp()
    {
        System.out.println("Chirps...");
    }
}
public class Hierarchical {
    public static void main(String args[]) {
        Dog d = new Dog();
        Bird b = new Bird();
        System.out.println("1. Dog");
        d.Eat();
        d.bark();
        System.out.println("2. Bird");
        b.Eat();
        b.chirp();
    }
}
