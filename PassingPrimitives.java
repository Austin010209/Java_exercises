public class PassingPrimitives
{
    public static void displayScore()
    {
    	int score = 10;
        displayTotal(score);
        System.out.println(score);
    }
    public static void displayTotal(int total)
    {
        total = 75;
        System.out.println(total);
    }
    public static void main(String[] args)
    {
        displayScore();
    }
}
