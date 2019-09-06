import java.util.Arrays;
public class array1
{
    public static void main(String[] args)
    {
        double[] samples = new double[20];
        for(int i = 0; i<samples.length; i++)
        {
            samples[i] = Math.random() * 100;
        }
        
        double total = 0.0;
        for (int i = 0; i<samples.length;i++)
        {
            total += samples[i];
        }
        double average= total/samples.length;
        System.out.println("Average =" + average);

    }
}
