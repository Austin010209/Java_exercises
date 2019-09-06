import java.util.*;
public class array2
{
    public static void main(String[] args)
    {
        int[][] nums = {{0,1,2,3,4},{10,11,12,13,14},{-2,21,22,23,24},{12,7,19,31,15}};
        String display = "";
        int total = 0;
        for (int row = 0; row<4; row++)
        {
            for (int col = 0; col < 5; col++)
            {
                total += nums[row][col];
            }
        }
        System.out.println(total);
    }
}