import java.awt.*;
public class fdasf
{
    public static void change(Point a)
    {
        a.x = 4;
        a.y = 5;
    }
    public static void main(String[] args)
    {
        Point one = new Point(1,2);
        change(one);
        System.out.print(one);
        //System.out.println(two);
    }
}
