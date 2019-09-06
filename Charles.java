public class Charles
{
    private int age;
    private int height;
    private int weight;
    private double GPA;
    private boolean girlfriend;
    public Charles()
    {
        age = 17;
        height = 176;
        weight = 67;
        GPA = 4.16;
        girlfriend = false;
    }
    public int getAge()
    {
        return age;
    }
    public int getheight()
    {
        return height;
    }
    public int getweight()
    {
        return weight;
    }
    public double getGPA()
    {
        return GPA;
    }
    public boolean getGirlfriend()
    {
        return girlfriend;
    }
    public void setAge(int n)
    {
        age = n;
    }
    public void setheight(int k)
    {
        height = k;
    }
    public void setweight(int w)
    {
        weight = w;
    }
    public void setGPA(double u)
    {
        GPA = u;
    }
    public void setgirlfriend(boolean o)
    {
        girlfriend = o;
    }
}
