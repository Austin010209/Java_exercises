public class privatecar extends land
{
    private String brand;
    private int price;
    public privatecar(String c, int d, int a, int b, String e, int f)
    {
        super(c,d,a,b);
        brand = e;
        price = f;
    }
    public String brand()
    {
        return brand;
    }
    public int price(int a)
    {
        return (a+price)/2;
    }
    public void increaseprice()
    {
        price += 100;
    }
}