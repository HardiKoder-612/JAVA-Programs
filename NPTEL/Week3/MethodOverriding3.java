package Week3;
class Men
{
    int walkingDistance(int weight)
    {
        System.out.println(10);
        return 10;
    }
}
class WildMen extends Men
{
    int walkingDistance(int weight)
    {
        System.out.println("20");
        return weight;
    }
}
public class MethodOverriding3 {
    public static void main(String[] args) {
        WildMen wc=new WildMen();
        wc.walkingDistance(30);
    }
}
