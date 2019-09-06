public class CalculateProbablity1
{
    public static double probability(double x,double beta)
    {
        return Math.pow(x,6)*Math.pow(Math.E,-x*beta)/(720*Math.pow(beta,7));
    }
    public static void main(String[] args)
    {
        double beta = 3;
        for(int i = 0; i<100;i++)
        {
            double x = 0.1*Math.random();
            double P1 = probability(x,beta);
            System.out.println("x = " + x + "     P = " + P1);
        }
    }
}
