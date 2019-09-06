public class return__
{
    public static double abs(double x)
    {
        if(x<=0)
        {
            return -x;
        }
        else
        {
            return x;
        }
    }
    public static void main(String[] args)
    {
        System.out.println(abs(3.4));
    }
}
