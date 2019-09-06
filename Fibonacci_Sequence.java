public class Fibonacci_Sequence
{
    public static void main(String[] args)
    {
        int f0 = 0;
        int f1 = 1;
        while(f1<10000)
        {
            System.out.println(f1);
            int a = f1;
            int b = f0 + f1;
            f0 = a;
            f1 = b;
        }
    }
}