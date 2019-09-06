public class gsdg
{
    public static double chengfang(double dishu, int jicifang)
    {
        double temp = 1;
        for(int i = 0; i!= jicifang; i++)
        {
            temp = temp * dishu;
        }
        return temp;
    }
    public static void main(String[] args)
    {
        double k = chengfang(1.02,3);
        System.out.println(k);
    }
}
