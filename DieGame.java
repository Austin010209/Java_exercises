import java.util.*;
public class DieGame
{
    // 实例变量 - 用你自己的变量替换下面的例子
    private Die[] dice;

    /**
     * 类 DieGame 的对象的构造函数
     */
    public DieGame()
    {
        // 初始化实例变量
        dice = new Die[5];
        for (int i = 0; i < dice.length; i++)
        {
            Die piece = new Die();
            dice[i] = piece;
        }
    }
    public void rollDice()
    {
        for(int i = 0; i<dice.length; i++)
        {
            Die cube = dice[i];
            cube.roll();
        }
    }
    public String toString()
    {
        String result = "";
        for (int i = 0; i < dice.length; i++)
        {
            Die cube = dice[i];
            result+= cube.getFaceValue() + " ";
        }
        return result;
    }
}
