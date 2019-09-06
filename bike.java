public class bike extends land
{
    private String brand;
    private int price;
    private int evaluation;
    public bike(String c, int d, int a, int b, String e, int f, int g)
    {
        super(c,d,a,b);
        brand = e;
        price = f;
        evaluation = g;
    }
    public String brand()
    {
        return brand;
    }
    public int price(int b)
    {
        return price + b;
    }
    public void setevaluation(int k)
    {
        evaluation = k;
    }
    public int getevaluation()
    {
        return evaluation;
    }
}