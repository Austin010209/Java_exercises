public class numbertheory
{
    private int initial;
    private int times;
    private double result;
    public numbertheory()
    {
        initial = 1;
        times = 10;
        result = 0;
        for(int i = 0; i<= times; i++)
        {
            double k = i * 1.0;
            result += 1/k;
        }
    }
    public double result()
    {
        return result;
    }
}
