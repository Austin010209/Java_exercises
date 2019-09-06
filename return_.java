public class return_
{
    public static double printLogarithm(double x)
    {
        if(x<=0.0)
        {
            System.out.println("Only positive");
            return 0;
        }
        double result = Math.exp(x);
        return result;
    }
    public static void main(String[] args)
    {
        double result = printLogarithm(8);
        System.out.println(result);
    }
}
