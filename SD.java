import java.util.*;
public class SD
{
    private int[][] matrix;
    public SD(int[][] matrix1)
    {
        matrix = matrix1;
    }
    public boolean checkrow()
    {
        for(int i = 0; i<9; i++)
        {
            int[] onerow = matrix[i];
            for(int j = 0; j<9; j++)
            {
                if(onerow[j]>9)
                {
                    return false;
                }
                for(int k = j+1; k<9; k++)
                {
                    if(onerow[j]==onerow[k])
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public boolean checkcolumn()
    {
        for(int i = 0; i<9; i++)
        {
            int[] onecol = new int[9];
            for(int x = 0; x<9; x++)
            {
                onecol[x] = matrix[x][i];
            }
            for(int j = 0; j<9; j++)
            {
                if(onecol[j]>9)
                {
                    return false;
                }
                for(int k = j+1; k<9; k++)
                {
                    if(onecol[j]==onecol[k])
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public boolean checksqu()
    {
        for(int i = 0; i<9; i+=3)
        {
            for(int j = 0; j<9; j+=3)
            {
                //the square is from matrix[i][j] to matrix[i+3][j+3]
                int[][] smallsqu = new int[3][3];
                for(int q = 0; q<3; q++)
                {
                    for(int w = 0; w<3; w++)
                    {
                        smallsqu[q][w] = matrix[i+q][j+w];
                    }
                }
                int[] theline = new int[9];
                for(int e = 0; e<9; e++)
                {
                    theline[e] = smallsqu[e/3][e%3];
                    if(theline[e]>9)
                    {
                        return false;
                    }
                }
                for(int r = 0; r<9; r++)
                {
                    for(int t = r+1; t<9; t++)
                    {
                        if(theline[r]==theline[t])
                        {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    public int[][] getSD()
    {
        return matrix;
    }
    public void setSD(int a, int b, int c)
    {
        matrix[a][b] = c;
    }
    public String toString()
    {
        String answer = "";
        for(int i = 0; i<9; i++)
        {
            String k = Arrays.toString(matrix[i]);
            answer = answer + k+"\n";
        }
        return answer;
    }
}
