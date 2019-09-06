public class Die1
{
    //instance variables
    private int faceValue;
    private int cou;
    private int zhenbucuo;
    //constructors
    public Die1()
    {
        faceValue = 0;
        zhenbucuo = 325;
        cou = zhenbucuo;
    }
    //methods
    public void roll()
    {
        faceValue = (int) (Math.random() * 6) + 1;
    }
    public int getFaceValue()
    {
        return faceValue;
    }
    public int getcou()
    {
        return cou + 23;
    }
    public int getzhenbucuo()
    {
        zhenbucuo = zhenbucuo + 1;
        zhenbucuo += cou;
        return zhenbucuo;
    }
    public String toString()
    {
        String result = "what is your name?";
        return result;
    }
}



