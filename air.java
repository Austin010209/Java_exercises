public abstract class air implements Vehicle
{
    private String type;
    private int size;
    private int speed;
    private int distance;
    public air(int a)
    {
        type = "Air";
        size = 500;
        speed = 900;
        distance = a;
    }
    public String type()
    {
        return type;
    }
    public int size()
    {
        return size;
    }
    public int speed()
    {
        return speed;
    }
    public void setspeed(int b)
    {
        speed = b;
    }
    public abstract String brand(String a);
    public abstract double safety(double b);
}