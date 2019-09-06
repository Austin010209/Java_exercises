import java.util.*;
public class String_
{
    public static int[] changeString(int[] l)
    {
        l[0] = 5;
        return l;
    }
    public static void main(String[] args)
    {
        int[] k = {1,2,3};
        System.out.println(Arrays.toString(changeString(k)));
        System.out.println(Arrays.toString(k));
    }
}
