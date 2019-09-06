import java.util.*;
public class PassingArrays
{
    public static void initializeArray()
    {
        int[] scores = {10,20,30};
        alterArray(scores);
        String result = Arrays.toString(scores);
        System.out.println(result);
    }
    public static void alterArray(int[] points)
    {
        String outcome = Arrays.toString(points);
        System.out.println(outcome);
        points[0] = 500;
    }
    public static void main(String[] args)
    {
        initializeArray();
    }
}
