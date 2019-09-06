public class simplifynumber
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
        length = length -1;
        int times = length-b;
        int newdecimal = (int)(decimal*Math.pow(10,times));
        //change the decimal to integer by multiplying
        int[] integer = new int[length];
        int num1 = newdecimal;
        for(int i = length-1; i>=0; i--)
        {
            int power = (int)(Math.pow(10,i));
            integer[length-i-1] = num1/power;
            num1 = num1-integer[length-i-1]*power;
        }
        int lastdigit = integer[length-1];
        int lasttwodigit = integer[length-2];
        int count1 = 0;
        int j = length-2;
        while(j>=0)
        {
            if(integer[j]==lastdigit)
            {
                count1++;
            }
            j--;
        }
        return num1;
        //ttoo difficult. fails
    }
    public static void main(String[] args)
    {
        int outcome = simplifynumber(11.99999999);;
        System.out.println(outcome);
    }
}    