import java.util.*;
public class trial1
{
    public static void mod(int[] a, int value)
    {
       for (int i=0; i < a.length; i++)
       {
          a[i] = i;
       }
       value = a[a.length-1];
    }
    public static void main(String[] args)
    {
        int[] itemArray = {9, 8, 7, 6};
        int val = 5;
        mod(itemArray,val);
        System.out.println(val);
        String answer = Arrays.toString(itemArray);
        System.out.println(itemArray);
    }
}
