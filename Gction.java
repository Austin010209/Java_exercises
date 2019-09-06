import java.util.Arrays;
public class Gction
{
    public static void main(String[] args)
    {
        String k = "26374834";
        int digit = Integer.parseInt(k);
        System.out.println(digit);
        double y = digit/Math.pow(10,6);
        int y1 = (int)y;
        System.out.println(y1);
    }
}
