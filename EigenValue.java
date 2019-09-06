import java.util.Scanner;
import java.util.*;
public class EigenValue
{
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
        double [] Matrixb = new double[n];
        for (int i = 1; i <= n; i++)
        {
            Scanner newelement = new Scanner(System.in);
            System.out.println("matrix b: Enter the value of the " + i + "th row: ");
            double newElement = newelement.nextDouble();
            Matrixb[i-1] = newElement;
        }
        // the product of A and b
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
        String k = Arrays.toString(MatrixB);
        System.out.println(k);
        double ratio = MatrixB[0]/Matrixb[0];
        for(int i = 1; i<n; i++)
        {
            double M = MatrixB[i]/Matrixb[i];
            if(Math.abs(M-ratio)>Math.pow(10,-2))
            {
                System.out.println("fail");
                break;
            }
        }
    }
}
