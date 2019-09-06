import java.util.*;
public class sorting
{
    public static int[] sort(int[] first, int[] second)
    {
        int len1 = first.length;
        int len2 = second.length;
        int[] result = new int[len1+len2];
        int i = 0;
        int j = 0;
        for(int k=0; k<(len1+len2); k++)
        {
            if(first[i]<second[j])
            {
                result[i+j] = first[i];
                if(i!=(len1-1)){i++;}
                else if(i==(len1-1))
                {
                    if(j==0){result[k] = second[k-i];}
                    else{result[k] = second[k-i-1];}
                }
            }
            else if(first[i]>=second[j])
            {
                result[i+j] = second[j];
                if(j!=(len2-1)){j++;}
                else if(j==(len2-1))
                {
                    if(i==0){result[k] = first[k-j];}
                    else{result[k] = first[k-j-1];}
                }
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        int[] first = {7,8};
        int[] second = {1,2,3};
        System.out.println(Arrays.toString(sort(first,second)));
    }
}
