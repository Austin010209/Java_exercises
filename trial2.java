public class trial2
{
    public static void main(String[] args)
    {
        String a = "Tom and Jerry";
        String b = "Tom";
        String k = a.substring(0,3);
        System.out.println(k);
        System.out.println(k.equals(b));
        String w = "Tom";
        System.out.println((w==b) + " it should be yes.");
        System.out.println((w==k) + " it should be no.");
    }
}