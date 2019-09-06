public class Die
{
    // 实例变量instance variable - 用你自己的变量替换下面的例子
    private int faceValue;
    public Die()
    {
        // 初始化实例变量
        faceValue = 1;
    }
    public int getFaceValue()
    {
        // 在这里加入你的代码 Your code here
        return faceValue;
    }
    public void roll()
    {
        faceValue = (int)(Math.random()*6)+1;
    }
    public String toString()
    {
        String result = faceValue + "What's your name";
        return result;
    }
}
