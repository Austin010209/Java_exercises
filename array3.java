import java.util.*;
public class array3
{
    public static void main(String[] args)
    {
        int[][] series = {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4},{5,5,5,5}};
        int sum = 0;
        for(int i = 0; i<5; i++)
        {
            int sum1 = 0;
            for(int j = 0; j < 4; j++)
            {
                sum1 += series[i][j];
            }
            sum += sum1;
        }
        System.out.println(sum);
    }
}