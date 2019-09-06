public class MomentGFMethod1
{
    public static void main(String[] args)
    {
        //we have know a and b
        double a = 1;
        double b = 3;
        double sum = 0;
        double sumsquare = 0;
        int accuracy = 10000000;
        //random sampling
        for(int i = 0; i < accuracy; i++)
        {
            double x = 1+2*Math.random();
            sum += x;
            sumsquare += x*x;
        }
        //expected mean and variance
        double Emean = 2;
        double Evariance = 1.0/3;
        double Calmean = sum/accuracy;
        double Calvariance = sumsquare/accuracy-Calmean*Calmean;
        double CalA = Calmean-Math.sqrt(3)*Math.sqrt(Calvariance);
        double CalB = Calmean+Math.sqrt(3)*Math.sqrt(Calvariance);
        String answer = "Emean  " + Emean + "     Calmean " + Calmean + "\n";
        answer += "Evariance  " + Evariance + "   Calvariance" + Calvariance + "\n";
        answer += "a = " + a + "     CalA = " + CalA + "\n";
        answer += "b = " + b + "     CalB = " + CalB + "\n";
        System.out.println(answer);
    }
}
