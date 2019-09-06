public class him
{
    public static void Jason(String hi)
    {
        for(int i=0;i<hi.length();i++)
        {
            String j = hi.substring(i,(i+1));
            System.out.println(j);
        }
    }
    public static void main(String[] args)
    {
        String couu = "Ask what you can do for your country";
        Jason(couu);
    }
}