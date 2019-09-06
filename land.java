public abstract class land implements Vehicle
{
    private String type;
    private int size;
    private int speed;
    private int distance;
    public land(String c, int d, int a, int b)
    {
        type = c;
        size = d;
        speed = a;
        distance = b;
    }
    public String type()
    {
        return type;
    }
    public int size()
    {
        return size;
    }
    public void setspeed(int e)
    {
        speed = e;
    }
    public abstract String brand();
    public abstract int price(int b);
}