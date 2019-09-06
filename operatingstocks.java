public class operatingstocks
{
    public static void main(String[] args)
    {
        Buystocks Google = new Buystocks();
        Google.buying(12,3.4);
        Google.buying(32,3.2);
        Google.buying(-10,3);
        System.out.println("Google.currentshare " + Google.currentshare());
        System.out.println("Google.currentstock " + Google.currentstock());
        System.out.println("Google.profit " + Google.profit(3));
        Buystocks Baidu = new Buystocks();
        Baidu.buying(32,4.3);
        Baidu.buying(-21,2.1);
        System.out.println("Baidu.currentshare " + Baidu.currentshare());
        System.out.println("Baidu.currentstock " + Baidu.currentstock());
        System.out.println("Baidu.profit " + Baidu.profit(4));
    }
}