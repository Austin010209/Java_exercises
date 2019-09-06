import java.util.*;
public class trial5
{
    public static void initializeArray()
    {
        boolean k = true;
        alterArray(k);
        System.out.println(k);
    }
    public static void alterArray(boolean x)
    {
        System.out.println(x);
        x = false;
    }
    public static void main(String[] args)
    {
        initializeArray();
    }

}