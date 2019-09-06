import java.util.*;
public class operation extends SD
{
    private ArrayList<oneorder> orders;
    public operation(int[][] matrix2)
    {
        super(matrix2);
        orders = new ArrayList<oneorder>();
    }
    public int rlrnum()
    {
        return (int)(Math.random()*9);
    }
    public int numrnum()
    {
        return (int)(1+Math.random()*9);
    }
    public boolean allset()
    {
        for(int i = 0; i<9; i++)
        {
            for(int j = 0; j<9; j++)
            {
                if(getSD()[i][j]==0)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public int[][] procedure()
    {
        while(!allset())
        {
            int row = rlrnum();
            int col = rlrnum();
            int num = numrnum();
            if(getSD()[row][col] == 0)
            {
                setSD(row,col,num);
                oneorder neworder = new oneorder(row,col,num);
                orders.add(neworder);
            }
            int count = 0;
            while((checkrow()&&checkcolumn()&&checksqu())==false)
            {    
                setSD(row,col,numrnum());
                count++;
                if(count >= 149)
                {
                    int leng = orders.size();
                    orders.remove(leng-1);
                    count = 0;
                }
            }
        }
        return getSD();
    }
    
    public String toString()
    {
        String answer = "";
        for(int i = 0; i<9; i++)
        {
            String k = Arrays.toString(procedure()[i]);
            answer = answer + k+"\n";
        }
        return answer;
    }
}