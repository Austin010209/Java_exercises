import java.util.*;
public class SquareArrays
{
    public static void squareElements(double[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = Math.pow(arr[i], 2);
        }
    }
    public static void main(String[] args)
    {
        double[] scores = {8.6,5.3,7.1,9.2};
        squareElements(scores);
        String result = Arrays.toString(scores);
        System.out.println(result);
    }
}
