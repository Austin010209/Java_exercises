public class Star
{
    private int height;
    private int age;
    private String name;
    private double GPA;
    private boolean smart;
    public Star(int a, String b, double c, boolean d)
    {
        height = a;
        name = b;
        GPA = c;
        smart = d;
        age = 17;
    }
    public int getHeight()
    {
        return height;
    }
    public String getName()
    {
        return name;
    }
    public boolean getSmart()
    {
        return smart;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int e)
    {
        age = e;
    }
    public void setSmart(boolean f)
    {
        smart = f;
    }
}