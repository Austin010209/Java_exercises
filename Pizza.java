public class Pizza
{
    private String pizza;
    private String topping;
    private double price;
    public Pizza(String t, double p)
    {
        topping = t;
        price = p;
    }
    public String getTopping()
    {
        return topping;
    }
    public double getPrice()
    {
        return price;
    }
    public void setTopping(String t)
    {
        topping = t;
    }
    public void setPrice(double p)
    {
        price = p;
    }
}
