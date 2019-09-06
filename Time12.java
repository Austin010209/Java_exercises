public class Time12
{
    public static void printTime(Time t)
    {
        System.out.println(t.hour+ ":" + t.minute + ":" + t.second);
    }
    public static Time addTime(Time t1,Time t2)
    {
        Time sum = new Time();
        sum.hour = t1.hour + t2.hour;
        sum.minute = t1.minute + t2.minute;
        sum.second = t1.second + t2.second;
        return sum;
    }
    public static void main(String[] args)
    {
        Time t1 = new Time();
        t1.hour = 11;
        t1.minute = 8;
        t1.second = 3.453;
        Time t2 = new Time();
        t2.hour = 11;
        t2.minute = 8;
        t2.second = 3.453;
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(addTime(t1,t2));
    }
}
