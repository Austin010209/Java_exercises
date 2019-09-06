public class NormalPerson
{
    private int age;
    private String name;
    private int height;
    private double weight;
    private boolean crime;
    public NormalPerson(int a, String b, int c, double d, boolean i)
    {
        age = a;
        name = b;
        height = c;
        weight = d;
        crime = i;
    }

    public void increaseAge()
    {
        age++;
    }
    public void setAge(int e)
    {
        age = e;
    }
    public void setName(String f)
    {
        name = f;
    }
    public void setHeight(int g)
    {
        height = g;
    }
    public void setWeight(double h)
    {
        weight = h;
    }
    public void setCrime(boolean j)
    {
        crime = j;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public int getheight()
    {
        return height;
    }
    public double getweight()
    {
        return weight;
    }
    public boolean getCrime()
    {
        return crime;
    }
    public String toString()
    {
        String result = "";
        result += "age is " + age + "\n";
        result += "name is " + name + "\n";
        result += "height is " + height + "\n";
        result += "weight is " + weight;
        return result;
    }
}
