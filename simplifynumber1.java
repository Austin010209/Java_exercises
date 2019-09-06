import java.util.*;
public class simplifynumber1
{
    public static int simplifynumber(double decimal)
    {
        int a = 0;
        int b = -99;
        while(Math.pow(10,b)<decimal)
        {
            b++;
        }
        //b=2,this number is more than 10 and less than 100
        int length = (decimal+"").length();
        int times = length-b-1;
        int newvalue = (int)(decimal*Math.pow(10,times));
        return newvalue;
    }
    public static int[] getDigit(int original)
    {
        //position: 0-length
        int b = 0;
        while(original>=Math.pow(10,b))
        {
            b++;
        }
        int length = b;
        int length1 = length;
        int[] listofnumber = new int[length];
        int thenumber = original;
        for(int i = 0; i<length; i++)
        {
            int thisdigit = thenumber/((int)(Math.pow(10,length1-1)));
            listofnumber[i] = thisdigit;
            //第0项是第一个数
            thenumber = thenumber-thisdigit*(int)(Math.pow(10,length1-1));
            length1--;
        }
        return listofnumber;
    }
    public static int simplify(int[] thelist)
    {
        int i = thelist.length-1;
        int testingNO = thelist[i-1];
        int counting = 1;
        while(thelist[i-2] == testingNO)
        {
            i--;
            counting ++;
        }
        int firstdifsecond = thelist.length-2-counting;
        if(thelist[firstdifsecond+1]>=5 && thelist[firstdifsecond] != 9)
        {
            thelist[firstdifsecond]++;
        }
        return firstdifsecond;
        //我们要刚变的那个数
        //11999998, 1和9变化，1是第一位
    }
    public static void main(String[] args)
    {
        int outcome = simplifynumber(11.599998);
        System.out.println(outcome);
        int[] answer = getDigit(outcome);
        String k = Arrays.toString(answer);
        System.out.println(k);
        int answer1 = simplify(answer);
        System.out.println(answer1);
    }
}    