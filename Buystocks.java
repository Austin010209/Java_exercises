import java.util.*;
public class Buystocks
{
    private ArrayList<Integer> Nosharebuying;
    private ArrayList<Double> shareprice;
    public Buystocks()
    {
        Nosharebuying = new ArrayList<Integer>();
        shareprice = new ArrayList<Double>();
    }
    public int currentshare()
    {
        int total = 0;
        int length = Nosharebuying.size();
        for(int i = 0; i<length; i++)
        {
            total += Nosharebuying.get(i);
        }
        return total;
    }
    public double currentstock()
    {
        double total = 0;
        int length = Nosharebuying.size();
        for(int i = 0; i<length; i++)
        {
            total += Nosharebuying.get(i)*shareprice.get(i);
        }
        return total;
    }
    public void buying(int Noshare, double price)
    {
        Nosharebuying.add(Noshare);
        shareprice.add(price);
    }
    public double profit(double currentprice)
    {
        double u = currentprice*currentshare();
        double p = u-currentstock();
        return p;
    }
}
