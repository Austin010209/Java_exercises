public class countdown
{
    public static void countdown(int n)
    {
        if(n == 0)
        {
            System.out.println("You are done");
        }
        else
        {
            System.out.println(n);
            countdown(n-1);
        }
    }
    public static void main(String[] args)
    {
        countdown(9);
    }
}
