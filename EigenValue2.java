import java.util.*;
//你能相信吗  这东西还可以
//时间，2018.12.10， 23：58， 张雪阳 Austin
public class EigenValue2
{
    public static double randomnum()
    {
        double x = 20*Math.random();
        double plus = Math.random();
        double y = Math.random();
        x = x + 1/y-2;
        if(plus < 0.5)
        {
            x = -x;
        }
        else
        {
            x = x;
        }
        return x;
    }
    
    public static String onetest(double[][] MatrixA)
    {
        int n = MatrixA.length;
        double [] Matrixb = new double[n];
        for (int i = 1; i <= n; i++)
        {
            Matrixb[i-1] = randomnum();
        }
        //
        double[] MatrixB = new double[n];
        for(int i = 0; i< n; i++)
        {
            double sum = 0;
            for(int j = 0; j<n; j++)
            {
                double oneproduct = MatrixA[i][j] * Matrixb[j];
                sum += oneproduct;
            }
            MatrixB[i] = sum;
        }
        double norm = 0;
        for(int i = 0; i<n; i++)
        {
            double a = MatrixB[i] * MatrixB[i];
            norm += a;
        }
        norm = Math.pow(norm,0.5);
        for(int i = 0; i<n; i ++)
        {
            MatrixB[i] = MatrixB[i] / norm;
        }
        boolean answer = true;
        double ratio = MatrixB[0]/Matrixb[0];
        for(int i = 1; i<n; i++)
        {
            double M = MatrixB[i]/Matrixb[i];
            if(Math.abs(M-ratio)>3*Math.pow(10,-4))
            {
                answer = answer&&false;
                continue;
            }
        }
        if(answer == false)
        {
            return "false";
        }
        else
        {
            String k = Arrays.toString(MatrixB);
            return k;
        }
    }
    public static void main(String[] args)
    {
        Scanner dimension = new Scanner(System.in);
        System.out.println("Enter an integer, the dimension of the matrix A: ");
        int n = dimension.nextInt();
        double[][] MatrixA = new double[n][n];
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                Scanner element = new Scanner(System.in);
                System.out.println("matrix A: Enter the value of " + i + "th row and " + j + "th column: ");
                double Element = element.nextDouble();
                MatrixA[i-1][j-1] = Element;
            }
        }
        int r = 0;
        int g = 0;
        while(r == 0)
        {
            String z = onetest(MatrixA);
            if(z.equals("false"))
            {
                g++;
            }
            else
            {
                System.out.println(z);
                break;
            }
        }
    }
}
