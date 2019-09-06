public class converting
{
    public static void main(String[] args)
    {
        String hex = "252";
        int length = hex.length();
        int sum = 0;
        
        for (int i = 0; i == (length-1);  i ++)
        {
            String sub = hex.substring(i,(i+1));
            int digit = Integer.parseInt(sub);
            int newdigit;
            if (i == 0){newdigit = digit;
            sum += newdigit;}
            else if (i == 1){newdigit = 16*digit;
            sum += newdigit;}
            else if (i == 2){newdigit = 256*digit;
            sum += newdigit;}
            else if (i == 3){newdigit = 256*16*digit;
            sum += newdigit;}
            
        }
        System.out.println(sum);
    }
}