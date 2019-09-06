public class hi
{
    public static void main(String[] args)
    {
        int number = 7897234;
        while (1!=2)
        {
            if(number%2 == 0)
            {
                number = number / 2;
                System.out.println(number);
                if(number == 1)
                {
                    break;
                }
            }
            else
            {
                number = number * 3 + 1;
                System.out.println(number);
                if(number == 1)
                {
                    break;
                }
            }
        }
    }
}